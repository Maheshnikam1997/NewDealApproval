Feature: MGM Deal Approval Project

  
  Background: Navigation to the URL
   
@Loginsalesforce
  Scenario: User is able to Open the browser, navigate to the URL
   Given User navigated to the dealapproval application url
   When user_login username "manoj.ingale@xebia.com.uat" and password "Manoj@1234"
   Then User successfully login on opportunity information dashboard.
 
  #Scenario Outline: User is able to search multiple products
    #When User Search for product "<product_name>"
    #Then Search Result page is displayed
    #Examples:
      #|product_name|
      #| laptop     |
      #| earphone   |
      #| computer   |


