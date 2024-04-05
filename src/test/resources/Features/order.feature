

Feature: Order Creation Feature
 
 
 Scenario:Create Sample order in Givconnect
   Given Navigate to Givconnect Portal Home Page 
   Given  Navigate to Givconnect Product Page  
   When Add the Product to Cart
   And  Navigate to Cart
   Then Add Sample Request Information
   And  Add Quote Request Information
   And  Add Regulatory Request Infomrmation
   And  Add project Additonal Information
   And  Add Shipping Address Information
   Then Confirm Submit order
   Then View order details 
   
   
   
