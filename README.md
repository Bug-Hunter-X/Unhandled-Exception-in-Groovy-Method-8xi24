# Unhandled Exception in Groovy Method

This repository demonstrates a common error in Groovy: failing to handle potential exceptions.  The provided Groovy code includes a method that throws an `IllegalArgumentException` if the input is negative, however, it lacks proper exception handling. This makes the program susceptible to unexpected crashes. The solution shows how to effectively catch and manage this exception.

## How to Reproduce
1. Clone this repository.
2. Navigate to the directory containing `bug.groovy`
3. Run the script using Groovy: `groovy bug.groovy`
4. Observe the error when negative input is passed. 
5. Run `groovy bugSolution.groovy` to see how to handle the exception gracefully. 

## Learning Points
* The importance of exception handling in robust application development.
* How to use try-catch blocks to gracefully handle exceptions in Groovy.
* Best practices for writing more resilient and error-tolerant code.