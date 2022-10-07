Feature: To validate the login functionality of the facebook

Scenario: To validate the invalid credentionals
    Given To lauch the chromeBrowser and hit the facebook url
    When To pass the invalid credential to username field
    And  To pass the invalid credential to password field
    And  To click the login button
    Then  To close the chrome browser
   

 
 