Feature: Put user on request

  Scenario: Put user
      * header x-api-key  = "reqres-free-v1"
      Given url "https://reqres.in" + "/api/users/" + "2"
      * configure ssl = true
      And request { "name": "ramiro", "job": "doctor" }
      When method put
      Then status 200
      And match $.name == 'ramiro'