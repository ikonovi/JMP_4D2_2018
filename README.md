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

# m01-t03

### Functional Interface Sandbox

1.	Implement each of main Java Standard Library functional interfaces (supplier, predicate etc.) using lambda expressions.
2.	Create your own functional interface and add several implementations using both lambda expressions and inner anonymous classes.
3.	Add few default methods to it and use them.
4.	Add few static methods to it and use them. 

# m01-t04

### Custom Functional Interface
1.	Write your own functional interface ThreeFunction (it takes three arguments and produce result).
2.	Implement this with two different lambdas
3.	Provide client code with usage of this lambdas

# m01-t05

##  Collection to stream
1. Create the following classes:
 * Author with fields: 
   * String name
   * short age
   * List<Book> books
 * Book with fields
   * String title
   * List<Author> authors
   * int numberOfPages
2. Create two arrays: Author[] authors and Book[] books. Their elements must use elements from the neighboring array.
3.	Create a stream of books and then:
    1. check if some/all book(s) have more than 200 pages;
    1. find the books with max and min number of pages;
    1. filter books with only single author;
    1. sort the books by number of pages/title;
    1. get list of all titles;
    1. print them using forEach method;
    1. get distinct list of all authors
4.	Use peek method for debugging intermediate streams during execution the previous task.
5.	Use parallel stream with subtask #3.
6.	Analyze with mentor results of previous subtask execution, explain him the difference between stream and parallel stream.
7.	Use the Optional type for determining the title of the biggest book of some author.

  
# m01-t06

### Custom collector
Define a complex class A with a few fields with different types. This class will be an item in collection.
Define a few methods which calculates some stat over the fields of the A class.
Make stream from the collection of A’s instances.
Write custom collector to accumulate the information from elements of your stream.
1. Implement Collector interface +
1. Don’t forget the final transformation +
1. Try to use Characteristics for the optimization purpose. +
1. Add tests for your collector. ??
Test your Collector with the parallel streams for significant amount of items in stream.
Look at the Collector interface and read about combine method if something is going wrong.
# m02-t01

###  Design and implement code that will introduce:

1. java.lang.OutOfMemoryError: Java heap space. You can use different data structures. Do not tune heap size.
2. java.lang.OutOfMemoryError: Java heap space. Create big objects continuously and make them stay in memory. Do not use arrays or collections. 
3. java.lang.OutOfMemoryError: Metaspace. Load classes continuously and make them stay in memory.
4. java.lang.StackOverflowError. Use recursive methods. Don’t tune stack size.
5. java.lang.StackOverflowError. Do not use recursive methods. Don’t tune stack size.
# m02-t03

### MAT for heap dump analysis
1.	Write simple application that consumes memory or take your mentoring pet application
1.	Catch java.lang.OutOfMemoryError: Java heap space
1.	Make heap dump (-XX:+HeapDumpOnOutOfMemoryError or via visualvm)
1.	With Memory Analyzer Tool generate report that shows which classes are consuming the memory
# m02-t04

### Classloading
1.	Create a new abstract class (or interface) Animal with methods: "Play", "Voice".
2.	Inherit Cat and Dog from the Animal class.
3.	Compile the classes.
4.	Create your own ClassLoader by extension of the standard ClassLoader.
5.	Load the classes Cat and Dog into an array or collection Animals by your own class loader and run the methods "Play", "Voice".
6.	Output data to console by log4j library (logger).
Note: Methods should just print a text message.
