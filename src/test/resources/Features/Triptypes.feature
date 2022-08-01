Feature: To validate the triptype fuctionality in travel application




@tc001
Scenario: TC_001 Validate the different  triptypes functionality under triptypes

Given Lauch  travel url
When click the Triptype link
Then It should  navigate to the different triptypes page
And It should   displays the Adventure triptypes
@tc002
Scenario: TC_002 Validate the Adventure functionality

Given Lauch the travel url
When click on  Triptype link
And Click the Adventure link
And Click view details
Then It should navigate to the check availability 

@tc003
Scenario: TC_003 Validate the check availability functionality

Given Lauch the travel application
When click  Triptype link
And click on the Adventure link
And Click on the view details
And click on the CheckAvailability
And Select date and clcik on continue button
And Select adult and Child option
And click on proceed to checkout button
Then It should navigate to the WP travel engine  checkout page
