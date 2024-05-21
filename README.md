Test Plan:

Test Plan Identifier: 

Bo01

Introduction: 

Testing E-Commerce website backoffice.

Test item: 

the software under test SUT is E-Commerce website backoffice contains a lot of features like customers, Products, sales, Promotion, Content management... etc.

Features to test: 

we will be focusing on customers and Products Features.

Features not to test: 

sales, Promotion and Content management Features.

Approach: 

BDD  automated functional testing.

Testing tasks: 

- test scenarios:

  1- Login with correcte credentials
  
  2- Add Customers
  
  3- Search Customers
  
  4- Add Product
  
  5- Add Categories
  
  6- Search Categories
  
  7- Add Manufactureres
  
  8- Search Manufactureres
  
Test suite: 
- Feature1: Customer
- Feature2: Login
- Feature3: Product
Technologies needs:
- Selenium
- java
- Gherkin
- Cucumber
- TestNg
- Extent Report
- PicoContainer
  
  
 ==================================================================================================================================================================================
 
 Test scenarios Priorities:
 
 - test scenarios:
   
  1- Login with correcte credentials = P1
   
  2- Add Customers = P1
  
  3- Search Customers = P2
  
  4- Add Product = P1
  
  5- Add Categories = P1
  
  6- Search Categories = P2
  
  7- Add Manufactureres = P1
  
  8- Search Manufactureres = P2
  
   
   
 ==================================================================================================================================================================================
 
 
Grouping step definitions
Technically it doesn’t matter how you name your step definition files, or which step definitions you put in a file. You could have one giant file containing all your step definitions. However, as the project grows, the file can become messy and hard to maintain. Instead, we recommend creating a separateStepDefinitions.java file for each domain concept.

A good rule of thumb is to have one file for each major domain object.
For example, in a Curriculum Vitae application, we might have:

EmployeeStepDefinitions.java
EducationStepDefinitions.java
ExperienceStepDefinitions.java
AuthenticationStepDefinitions.java
The first three files would define all the Given, When, and Then step definitions related to creating, reading, updating, and deleting the various types of objects. The last file would define step definitions related to logging in and out, and the different things a certain user is allowed to do in the system.

If you follow this pattern, you also avoid the Feature-coupled step definitions anti-pattern.

Of course, how you group your step definitions is really up to you and your team. They should be grouped in a way that is meaningful to your project.

===> so to dao that We have to use composition to resolve this problem. We could achieve this with dependency injection. I have used PicoContainer to achieve dependency injection.

![PATH](https://github.com/Mariem-ro/BDD_Cucumber_Selenium_java/assets/66451325/5c15d2a0-06bf-4375-ab8b-98c381da83b3)


