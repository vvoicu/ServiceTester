Feature: search google 2
Scenario: Search a term on google
    Given I have a "valid" data set
    And with the isPresent set to "true"
   	When I send the message to the url: "http://localhost:8081"
   	Then the response contains "Message"