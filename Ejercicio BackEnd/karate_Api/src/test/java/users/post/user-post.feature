Feature: Post user on request

  Background:
    * configure ssl = true
    * url "https://reqres.in"
    * path "/api/users"

  @CreateAndGetId
  Scenario: Post a user
  * header x-api-key  = "reqres-free-v1"
    Given request { "name": "denis", "job": "leader" }
    When method post
    Then status 201
    And print response
    * def contactId = response.id

  # Data Driven example 1
  Scenario Outline: Post a users List <name>
    * header x-api-key  = "reqres-free-v1"
    Given request { "name": "#(name)", "job": "#(job)" }
    When method post
    Then status 201

    Examples:
    | name   | job     |
    | Juan   | teacher |
    | Carlos | doctor  |
    | Gustavo| engineer|


  # Data Driven example 2  Json
  @ignore
  Scenario Outline: Post a users <name> from Json file
    * header x-api-key  = "reqres-free-v1"
    Given request { "name": "<name>", "job": "<job>" }
    When method post
    Then status 201
                                                                  
    Examples:
    | read('classpath:../data/users/UsersDataDrivenExample2.json') |


 # Data Driven example 3  CSV
 @ignore
 Scenario Outline: Post a users from <name> CSV file
   * header x-api-key  = "reqres-free-v1"
   Given request { "name": "<name>", "job": "<job>" }
   When method post
   Then status 201

   Examples:
   | read('classpath:../data/users/UsersDataDrivenExample3.csv') |


  Scenario: Post a user without job
    * header x-api-key  = "reqres-free-v1"
    Given url "https://reqres.in" + "/api/users"
    And request { "name": "morpheus" }
    When method post
    Then status 201

  Scenario: Post a use whit invalid name
    * header x-api-key  = "reqres-free-v1"
    Given url "https://reqres.in" + "/api/users"
    And request { "name": "$#%&%", "job": "pilot" }
    When method post
    Then status 201 





