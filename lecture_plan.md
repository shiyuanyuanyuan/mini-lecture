# Mini-Lecture: Lambda Expressions
*Duration: 30 minutes*

## 1. Introduction to Lambda Expressions

### What is a Lambda Expression?
- An anonymous function in Java
- Basic syntax: `(parameters) -> expression`
- Simplifies code by removing boilerplate

### Benefits of Lambda Expressions
- Improves code readability
- Encourages functional programming principles
- Enhances work with Streams and Collections APIs

### Method References: A Cleaner Alternative to Lambdas (5 min)
- Syntax: `ClassName::methodName`
- Example: `System.out::println`
- Benefits:
  - Cleaner code
  - Reduced verbosity


### Code Examples
(I plan to find some cases from the movie and linklist class exercise to give let them understand the use and benefits of lambda case by case)

### Reducing Boilerplate Code in OOP
Without Lambda (using an anonymous class) Approach
```java
movieList.sort(new Comparator<Movie>() {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getTitle().compareTo(m2.getTitle());
}
});
```Lambda Expression Approach
```java
movieList.sort((m1, m2) -> m1.getTitle().compareTo(m2.getTitle()));
```
### Making Object-Oriented Design More Flexible - Encouraging Composition Over Inheritance

### Streamlining Event-Driven Programming

###Enhancing the Power of Functional Interfaces

###functional interface is an interface with one abstract method, making it perfect for lambdas.
A. Before: Implementing Interfaces Traditionally
```java
class PrintTitle implements Consumer<Movie> {
    @Override
    public void accept(Movie movie) {
        System.out.println(movie.getTitle());
    }
}
```
B. After: Using a Lambda Expression
```java
movieList.forEach(movie -> System.out.println(movie.getTitle()));
```
### Improving Readability and Maintainability
When dealing with collections, Java traditionally used loops to process data. Lambdas, combined with Streams, allow declarative data manipulation.

Before: Traditional Loop for Filtering
``` java
List<Movie> classics = new ArrayList<>();
for (Movie movie : movieList) {
    if (movie.getYear() < 2000) {
        classics.add(movie);
    }
}
```
After: Functional Approach with Streams
``` java
List<Movie> classics = movieList.stream()
    .filter(movie -> movie.getYear() < 2000)
    .toList();
```
### 6. Simplifying Comparator Logic
Java OOP traditionally relies on custom comparator classes. Lambdas replace unnecessary class definitions with in-place logic.

Before: Custom Comparator Class
``` java
class CompareMoviesByYear implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getYear(), m2.getYear());
    }
}
```
After: Lambda Replacement
``` java
movieList.sort(Comparator.comparing(Movie::getYear));
```

### Using Lambdas to Encourage Immutability
OOP often deals with mutable objects, leading to potential bugs. Lambdas encourage immutable operations.

Before: Summing Years with Mutable Variable
``` java
int totalYears = 0;
for (Movie movie : movieList) {
    totalYears += movie.getYear();
}
```
After: Using reduce()
``` java
int totalYears = movieList.stream()
    .map(Movie::getYear)
    .reduce(0, Integer::sum);
```

## 2. Understanding Functional Interfaces

### Definition: A functional interface has exactly one abstract method.

### Java built-in functional interfaces:
- Predicate<T> – returns boolean
- Function<T, R> – maps T to R
- Consumer<T> – consumes T (used in forEach)
- Supplier<T> – provides T without input

### Code Examples
#### Predicate Example
```java
Predicate<Movie> isClassic = movie -> movie.getYear() < 2000;
movieList.stream().filter(isClassic).forEach(System.out::println);
```









