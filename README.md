# HWA_3_DesignPatterns: Design Patterns Implementation
Objective:
Your objective is to design and implement a software system that incorporates various design patterns, as discussed in the provided JUnit test cases. The system should adhere to best practices and pass the given test cases to demonstrate correct functionality.

## General Requirements
* The project structure has evenything you need to get you started.
* Follow the instructions from previous assignments on how to run the project.
* You are to complete the code, when necessary as provided in the comments inside each class.
* The AppTest.java has some hints as how to write some methods for your classes.
* Required components and which design pattern to use is provided below.
* You will need to provide a UML class diagram for all the classes required in this assignmen to include: classes, properties/attributes, operations/methods, interfacse, and relationships. You can use any UML diagramming tool. Image export from the diagramming tool is accepted, e.g. jpg, svg, etc. See checklist below to make sure your class diagram is complete. 


## Assignment Requirements:
**1. AuthManager (Singleton Pattern)**

* Implement the AuthManager class using the Singleton pattern to manage user authentication.
* Write JUnit test cases to verify the functionality of the getInstance and authenticateUser methods.

**2. Product Catalog (Factory Method Pattern)**

* Create interfaces and classes (Product, ProductFactory, Laptop, Phone, etc.) using the Factory Method pattern to represent a product catalog system.
* Write JUnit test cases to test the creation of different types of products using the factory method.

**3. Shopping Cart (Strategy Pattern)**

* Design the ShoppingCart class using the Strategy pattern to handle different payment strategies (PaymentStrategy).
* Implement concrete payment strategy classes (CreditCardPayment, PayPalPayment) and the ShoppingCart class.
* Write JUnit test cases to test the checkout process with different payment strategies.

**4. Order Processing (Observer Pattern)**

* Create the Order class as the subject and implement observer classes (InventoryManager, ShippingDepartment) using the Observer pattern.
* Implement methods to add observers, remove observers, and notify observers in the Order class.
* Write JUnit test cases to test the observer notifications when an order is processed.

**5. Additional Requirements**

* Ensure that each class and interface is in a separate file for better organization and modularity.
* Follow Java coding conventions, naming conventions, and best practices throughout the implementation.
* Document your code using comments to explain the purpose of each class, method, and significant logic.

## Submission Guidelines

### 1. Code Implementation

* Implement the entire system based on the provided requirements and design patterns.
* Write JUnit test cases for each feature to validate the correctness of your implementation.
* Ensure that your implementation passes all the provided JUnit test cases without errors.

### 2. Design Documentation

* Provide a design document describing the overall architecture of your system, including class diagrams illustrating the relationships between classes and interfaces.
* Include explanations of how each design pattern is applied in your implementation.


### 3. JUnit Test Results

Submit the results of running your JUnit test cases to demonstrate that your implementation meets the specified requirements and passes all tests.

### Grading Criteria
Your assignment will be graded based on the following criteria:

### 1. Correctness (40%)

* The implemented system should meet all the assignment requirements and pass the provided JUnit test cases.

### 2. Design Patterns Usage (40%)

* The usage of design patterns (Singleton, Factory Method, Strategy, Observer) should be clearly demonstrated and correctly implemented.

### 3. Code Quality and Documentation (20%)

* Your code should be well-structured, well-commented, and follow Java coding standards and best practices.
* Include appropriate comments and documentation to explain the purpose and functionality of each component.

### 4. JUnit Test Cases

* Your JUnit test cases should cover all aspects of the implemented system and validate its correctness under different scenarios.

>NOTE: you will be graded on the junit test cases provided in the project. 

# UML Class Diagram Checklist

## Classes
- [ ] Identify the main classes in the system.
- [ ] Ensure each class represents a key concept or entity in the application.

## Properties and Attributes
- [ ] Define attributes for each class to represent its properties.
- [ ] Specify the data types of attributes (e.g., int, String, etc.).
- [ ] Ensure attributes have appropriate visibility (public, private, protected).
- [ ] Include getter and setter methods for private attributes if needed.

## Relationships
- [ ] Identify relationships between classes.
- [ ] Determine the cardinality of relationships (one-to-one, one-to-many, many-to-many).
- [ ] Use appropriate UML relationship notations (association lines, aggregation, composition).
- [ ] Consider including directional arrows to indicate the navigation direction in relationships.

## Methods
- [ ] List methods associated with each class.
- [ ] Specify method parameters and return types.
- [ ] Ensure methods have appropriate visibility (public, private, protected).
- [ ] Include method signatures, but detailed method implementation is not necessary in class diagrams.

## Inheritance and Interfaces
- [ ] Represent inheritance relationships using generalization (extends) and specialization (implements) arrows.
- [ ] Indicate interfaces and their implementations.

## Multiplicity
- [ ] Specify multiplicity for associations (e.g., 0..1, 1..*, *).
- [ ] Clearly define multiplicity for each end of an association.

## Miscellaneous
- [ ] Use stereotypes when necessary (\<\<entity\>\>, etc.).
- [ ] Include class notes or comments to provide additional information.
- [ ] Ensure the diagram is clear, organized, and easy to understand.

## Example UML Class Diagram
- [ ] Provide a key or legend if the diagram includes specific notations or stereotypes.
- [ ] Review and validate the completeness of the class diagram.



## Interface Name
- [ ] Choose a meaningful and descriptive name for the interface.

## Methods
- [ ] List all the methods that the interface declares.
- [ ] Include the method signatures (name, parameters, return type) in the diagram.

# Grading Criteria for the Application (general and in addition the specific ones given above)
|Criteria/Performance|A|B|C|D/F|
|:----|:----|:----|:----|:----|
| |Outstanding|Proficient|Minimum|Below Expectations|
| | | | | |
|Correctness|program meets all of the specifications|program meets most of the specifications|program executes without errors |program does not execute due to errors|program executes without errors |program executes without errors |program handles some special cases some testing|no error checking code included|program handles all special cases |program handles most special cases |program does not execute due to errors |no testing has been completed|
| |program contains error checking code |thorough testing|no error checking code included | |
| |thorough and organized testing has been completed and output| | no testing has been completed| |
|Readability|The code is exceptionally well organized and very easy to follow.|The code is fairly easy to read.|The code is readable only by someone who knows what it is supposed to be doing. |The code is poorly organized and very difficult to read.Reusability|The code could be reused as a whole or each routine could be reused.|Most of the code could be reused in other programs.|Some parts of the code could be reused in other programs.|The code is not organized for reusability.|
|Documentation|The documentation is well written and clearly explains what the code is accomplishing and how.|The documentation consists of embedded comment and some simple header documentation that is somewhat useful in understanding the code.|The documentation is simply comments embedded in the code with some simple header comments separating routines.|The documentation is simply comments embedded in the code and does not help the reader understand the code.|
