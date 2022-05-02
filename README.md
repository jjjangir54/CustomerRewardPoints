### This project is built with Maven and Spring Web

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.


## Dependencies:
- h2
- lombok
- springdoc-openapi-ui
- spring-boot-devtools
- spring-boot-starter-web
- spring-boot-starter-test
- spring-boot-starter-data-jpa

## Restful endpoints:
   ### To Get Reward Points of all customers for last 3 months
   ```
   curl -X 'GET http://localhost:8080/customer/all
   ```
   
   ### To Get Reward Points of a customer for last 3 months based on Customer-ID
   ```
   curl -X 'GET http://localhost:8080/customer/rewards/{customerId}
   ```

## Swagger-UI URL :
```
http://localhost:8080/swagger-ui/index.html
```

### Note : 
customerId range from 1 to 11 for this project.


### Exceptions
**Customer with Id :: "customerId" does not exist.**        :  Message for customerId beyond the range

**Invalid Customer ID. Please Enter a valid Customer ID**   :  Message for bad input
