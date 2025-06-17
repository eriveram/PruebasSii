Feature: Get user on reqres

  Background:
    * configure ssl = true

  Scenario: Get a User
    * header x-api-key  = "reqres-free-v1"
    Given url "https://reqres.in" + "/api/users/" + "2"
    * configure ssl = true
    When method get
    Then status 200

