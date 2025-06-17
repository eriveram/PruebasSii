Feature: Delete user on request

  Background:
    * configure ssl = true

  Scenario: delete user
    #llamar otro feature en uno actual
    * call read("../post/user-post.feature@CreateAndGetId")
    * header x-api-key  = "reqres-free-v1"
    Given url "https://reqres.in" + "/api/users/" + contactId
    When method delete
    Then status 204