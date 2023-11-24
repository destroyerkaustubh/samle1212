Feature: Test HTTP request

  Background: 
  Given User Set BaseURI and BasePath

  Scenario: Test HTTP Post Request
    Given Ger RequestSpecification Object So We Can Hit Http Request Req body and Reqheader
    When User Select HTTP Post Request
    Then User Validate StatusCode As 201 and StatusLine as "HTTP/1.1 201 Created"
    Then User Validate responseheader
    And User Validate responseBody
    And User Captured id from response Body
    
    Scenario: Test HTTP Get Request
       Given Ger RequestSpecification Object So We Can Hit Http Request Req body and Reqheader
    When User Select HTTP Get Request
    Then User Validate StatusCode As 200 and StatusLine as "HTTP/1.1 200 OK"
    Then User Validate responseheader
    And User Validate responseBody
    
