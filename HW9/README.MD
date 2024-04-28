# Composite File Application

## Overview
This project demonstrates the Composite design pattern through a simple file system simulation.
 The pattern is utilized to treat files and folders in a uniform manner, allowing for a hierarchical structure similar to actual file systems.

## Implementation
The implementation consists of the following components:
- `FileSystemComponent`: An abstract class that defines common behaviors for files and folders.
- `File`: A concrete class representing a file in the file system.
- `Folder`: A concrete class representing a folder that can contain both files and other folders.

## Composite Pattern Structure
- **Component**: `FileSystemComponent` acts as the base component with common operations like `display()` and `getSize()`.
- **Leaf**: `File` represents the leaf nodes in the composite structure, which do not have any children.
- **Composite**: `Folder` represents the composite nodes, which can contain both leaves and other composites.

## Testing
The test suite (`FileSystemComponentTest`) verifies the functionality of the file system components, ensuring the correct behavior of both files and folders, including nested folders.

## Running the Tests
To run the tests, use the provided Ant script with the command:
```bash
ant run-tests

This will compile the source files and execute the test cases.
 ```

## Conclusion
The Composite design pattern allows for simple and efficient management of complex tree structures, as demonstrated by this file system example. It simplifies client code and supports easy scalability.