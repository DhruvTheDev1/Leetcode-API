# LeetCode API
### The API for retrieving your Leetcode Solved Questions stats 
<p align="left">
  <img src="https://img.shields.io/badge/Java-21-blue?style=flat&logo=java"/>
  <img src="https://img.shields.io/badge/Spring_Boot-3.4-green?style=flat&logo=spring"/>
  <img src="https://img.shields.io/badge/GraphQL-API-lightpink?style=flat&logo=graphql"/>
  <img src="https://img.shields.io/badge/Postman-API-orange?style=flat&logo=postman"/>

</p>

![image](https://github.com/user-attachments/assets/521070e2-957a-4b09-83a7-de72600c2634)


## About
Leetcode - the worlds leading platform for for coding and algorithmic problems. 

I discovered that there are not many APIs that allow you to enter a username and see your Leetcode Stats and as a Leetcode advocate I decided to tackle this problem.

## Technologies Used
- Springboot backend
- Thymleaf for the view/front-end
- GraphQL
- Postman for testing leetcode's graphql endpoint
> https://leetcode.com/graphql - uses Leetcode's GraphQL endpoint to retrieve data

## Getting Started
- Clone the repository
- Run the following command in the project directory:
  - /mvnw spring-boot:run
- Navigate to http://localhost:8080/leetcode/stats

## Project Structure
- `LeetcodeApiApplication.java` - Entry point of the Spring application
- `LeetcodeController.java` - Handles request relating to Leetcode stats and returning the response
- `LeetcodeData.java` - Plain old Java objects (holder of the data passed by the Controller to be displayed on a View)
- `LeetcodeService.java` - Service class that calls Leetcode's graphQL endpoint, converts data to POJO and returns to controller
- `schema.graphqls` - GraphQL schema
- `form.html` - Thymleaf template for the view

## Further Work
- Improve front-end UI
