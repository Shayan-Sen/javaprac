# Java Practice Repository

This repository contains a collection of Java programs designed for practicing fundamental data structures and object-oriented programming (OOP) concepts. It includes implementations of common data structures and examples from Accenture training modules covering various Java topics.

## Author
Shayan Sen

## Prerequisites
- Java Development Kit (JDK) installed on your system (version 8 or higher recommended).
- A terminal or command prompt to compile and run the programs.

## Project Structure

### Data Structures
This section includes implementations of basic data structures with insertion and traversal operations.

#### Binary Tree (`binarytree/`)
- **Files**: `Main.java`, `Tree.java`, `Node.java`
- **Description**: A simple binary search tree implementation with insertion and inorder, preorder, postorder traversals.
- **How to Run**:
  1. Navigate to the `binarytree` directory.
  2. Compile: `javac *.java`
  3. Run: `java Main`
  4. Follow prompts to enter the number of elements and their values.
- **Documentation**: JavaDoc generated in `docs/` folder. Open `docs/index.html` in a browser for detailed API documentation.

#### Linked List (`linkedList/`)
- **Files**: `Main.java`, `LinkedList.java`, `Node.java`
- **Description**: Implementation of a singly linked list with basic operations.
- **How to Run**:
  1. Navigate to the `linkedList` directory.
  2. Compile: `javac *.java`
  3. Run: `java Main`

#### Doubly Linked List (`doublylinkedlist/`)
- **Files**: `Main.java`, `Dll.java`, `Node.java`
- **Description**: Implementation of a doubly linked list.
- **How to Run**:
  1. Navigate to the `doublylinkedlist` directory.
  2. Compile: `javac *.java`
  3. Run: `java Main`

#### Stack (`stack/`)
- **Files**: `Main.java`, `Stack.java`
- **Description**: Array-based stack implementation.
- **How to Run**:
  1. Navigate to the `stack` directory.
  2. Compile: `javac *.java`
  3. Run: `java Main`

#### Circular Linked List (`circularlinkedlist/`)
- **Files**: `Main.java`, `Circular.java`, `Node.java`
- **Description**: Implementation of a circular linked list.
- **How to Run**:
  1. Navigate to the `circularlinkedlist` directory.
  2. Compile: `javac *.java`
  3. Run: `java Main`

### Accenture Training Modules
These modules are based on Accenture's Java training curriculum, covering various Java concepts from basic to advanced.

#### C6_2 (`accenture/C6_2/`)
- Basic Java programs including:
  - `Four.java`: Simple "Hello World" program.
  - `Nine.java`: Basic class instantiation.
  - `Ten.java`: Scanner input example.
  - `Fifteen.java`: More advanced input handling.
  - `Seventeen.java`: Additional examples.
  - `JavaDocExample.java`: Demonstration of JavaDoc comments.
- **How to Run**: Compile and run individual files as needed (e.g., `javac Four.java && java Four`).

#### C6_3 (`accenture/C6_3/`)
- **Creating Classes (`creatingclass/`)**: `Dog.java`, `DogMain.java` - Example of creating a class with constructors, getters, and methods.
- **Working with Objects (`workingwithobjects/`)**: `Person.java`, `PersonTester.java` - Demonstrates object creation and manipulation.
- **How to Run**: Navigate to subdirectories and compile/run the Main files (e.g., `javac DogMain.java Dog.java && java DogMain`).

#### C6_4 (`accenture/C6_4/`)
- **Inheritance (`lesson3/inheritenceExample/`)**: `Person.java`, `Student.java`, `StudentEmployee.java`, `Tester.java` - Shows inheritance hierarchy.
- **Interfaces (`lesson3/interfaceExample/`)**: `Vehicle.java`, `Car.java` - Interface implementation example.
- **Polymorphism (`lesson3/polymorphismExample/`)**: `Vehicle.java`, `Car.java`, `Boat.java`, `Plane.java`, `Tester.java` - Demonstrates polymorphism with arrays of objects.
- **How to Run**: Compile all files in the subdirectory and run the Tester class.

#### C6_5 (`accenture/C6_5/`)
- **Dates and Calendars (`datesAndCalenders/`)**: `DatesAndCalenders.java` - Working with Java Date and Calendar classes.
- **Exceptions (`exceptionExample/`)**: `Phone.java`, `Tester.java` - Custom exception handling and validation.
- **Regular Expressions (`regExExample/`)**: `RegExTester.java` - Pattern matching with regex.
- **Scanner (`scannerExample/`)**: `UserInputTester.java` - User input handling with Scanner.
- **How to Run**: Compile and run the main files in each subdirectory.

## General Instructions
- All programs are console-based and require user input via the terminal.
- Ensure you are in the correct directory when compiling and running programs.
- For programs with multiple files, compile all `.java` files together (e.g., `javac *.java`).
- Run the class containing the `main` method (usually named `Main` or `Tester`).

## Contributing
This is a personal practice repository. Feel free to fork and modify for your own learning purposes.

## License
No specific license applied. Use at your own discretion.
