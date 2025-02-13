# Mini-Lecture: Lambda Expressions

*Duration: 30 minutes*


## What is a Lambda Expression?

- An anonymous function in Java
- Basic syntax: `(parameters) -> expression`
- Simplifies code by removing boilerplate

### Code Examples
 - MainNoLambda.java (student code)
 - MainLambda.java (finished code)


## Functional Interfaces
Unlike JavaScript, where arrow functions (=>) are standalone, Java requires a specific target type. That target type must be a functional interface because:

- Java is statically typed – Every lambda must be assigned to a well-defined type at compile time.
- Lambda expressions are essentially anonymous implementations of functional interfaces – Java needs a way to infer the method signature.
- Java doesn't have function types (like JavaScript) – Instead, it relies on functional interfaces.

### Code Examples
#### MainLambda.java 
- .sort() uses Comparator<T> is part of java.util, and it is used to define custom sorting logic.
- .forEach is a Method from Iterable, which is a superclass of List. Iterable<T>  <--  Collection<T>  <--  List<T>, and Iterable<T> is NOT a Functional Interface
However, inside the Iterable interface, there is a default method: default void forEach(Consumer<? super T> action) Consumer<T> is a functional interface in Java that represents an operation that takes one input and returns nothing (void).

#### MainPredicate.java 
- (Predicate<T> is part of java.util.function, and it is used to define a boolean-valued function of one argument.)


## Stream API
Streams allow us to process collections without modifying the original data.

API (Application Programming Interface) is a collection of classes, interfaces, and methods that provide functionality for developers. 

The Stream API in Java is called an API because it provides a set of interfaces and methods for working with sequences of data in a functional, declarative way.

The Stream API is a part of the java.util.stream package.
It defines methods for operations like filtering, mapping, reducing, and collecting data.
It helps process collections (e.g., List, Set) in a functional and lazy manner.

### Stream Operations:

#### Intermediate Operations (Modify the Stream)
- .map(Function<T, R>) → Transform elements
- .filter(Predicate<T>) → Remove elements
- .sorted() → Sort elements

#### Terminal Operations (End the Stream)
- .reduce() → Aggregate to a single result
- .collect() → Convert to List, Set, etc.
- .forEach() → Iterate over elements


### Code Examples
- MainNoStreams.java (student code)
- MainStreams.java (finished code)


## Alternative: Using Method References Instead of Lambdas

### Code Examples
- MainNoMethodReference.java (student code)
- MainReduce.java (finished code)



