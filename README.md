## Java_Program

## Parameterized Constructor in Java

A **parameterized constructor** is a special type of constructor that allows you to create objects with specific initial values. Unlike the default constructor (which has no parameters), a parameterized constructor lets you pass arguments when creating an object, making your code more flexible and readable.

### Key Features:
- Initializes object properties at the time of creation.
- Can have multiple parameters.
- Supports constructor overloading (more than one constructor with different parameter lists).
- Reduces the need for extra setter methods.
- Helps prevent uninitialized object states.

## Output
<img width="464" height="304" alt="image" src="https://github.com/user-attachments/assets/1f618401-009e-47b6-ab79-ac03caedfb57" />

---

## Multilevel Inheritance in Java

Multilevel inheritance is a type of inheritance where a class is derived
from another class, which is also derived from another class.

##Structure:
    Class A (Parent)
        ↓
    Class B (Child of A)
        ↓
    Class C (Child of B)

## Key Points:
- Achieved using the 'extends' keyword
- Supports code reusability
- Child class can access methods and properties of all its parent classes
- Java allows multilevel inheritance but does not support multiple inheritance with classes

## Output
<img width="255" height="73" alt="image" src="https://github.com/user-attachments/assets/afe61936-d81f-45a9-baa5-75c981c89fb5" />

---

## String Function in Java

 Overview
The program:
- Uses `Scanner` to read input from the user
- Applies built-in Java `String` methods
- Prints results of each operation to the console

##  String Methods Used

- `toLowerCase()`
- `toUpperCase()`
- `length()`
- `replace()`
- `trim()`
- `equals()`
- `equalsIgnoreCase()`
- `charAt()`
- `concat()`
- `substring()`
- `indexOf()`
- `lastIndexOf()`

## Output
<img width="461" height="429" alt="image" src="https://github.com/user-attachments/assets/e7eeba28-14d9-46df-8828-ae1ce66e5429" />

---

## Exception Handling in Java (ArithmeticException – Divide by Zero)

Exception handling in Java is a mechanism used to handle runtime errors and maintain the normal flow of a program.

When a number is divided by zero, Java throws an **ArithmeticException**. This exception can be handled using the **try**, **catch**, and **finally** blocks to prevent the program from crashing.

## try Block
The `try` block contains code that may cause an exception.  
In a division operation, dividing a number by zero is a risky operation and can trigger an `ArithmeticException`.

## catch Block
The `catch` block is used to handle the exception.  
When division by zero occurs, the `catch (ArithmeticException e)` block executes and displays an error message instead of terminating the program.

## finally Block
The `finally` block always executes, regardless of whether an exception occurs or not.  
It is commonly used to display confirmation messages or perform cleanup operations.

## Output 
<img width="273" height="112" alt="image" src="https://github.com/user-attachments/assets/12dee12f-392e-43f1-b17a-8b6f8f8efe08" />



