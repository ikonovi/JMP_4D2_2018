### JMP_4D2_2018
- [x] 1	Lambdas & Streams (Java 8)
- [x] 2	JVM Internals Part 1: Memory Management and Classloading
- [x] 3	JVM Internals Part 2: Garbage Collection
- [x] 4	Infrastructure: Build Java application with Maven and Gradle
- [x] 5	Infrastructure: Learn Continuous Integration Concepts (Jenkins)
- [x] 6	Testing: JUnit 4 and 5, jmock, TDD, BDD
- [x] 7	Multithreading: Classic Model and Concurrency
- [x] 9	Spring Core Basics
- [x] 11	Spring MVC
- [x] 12	Spring Core Advanced (+ Spring Boot + Spring 5)
## m01-t01:

### A bit of concurrency
Created several instances of Runnable interface with different behavior. 
Used lambda expressions. 
Run these lambdas via Thread API.
## m01-t02

### A person stream
Create:
1.	Person class with name and age fields
2.	A collection of Persons;
3.	Two instances of Comparator<Person> interface using lambda expressions: first one for comparing by name, second one – by age

Then sort them using these comparators.
Use forEach method for printing information about all the persons. 
Try to use method reference if it is possible

