# solutions for cs680 
## Overview
This Repo contains a set of solutions for Homework  cs680.
## Build Process

- **Initialization**: Prepares the necessary directories for the build.
- **Main Compilation**: Compiles the source files of the main application.
- **Test Compilation**: Compiles the test source files.

## Test Execution
Tests are executed using the JUnit 5 framework with the `junitlauncher` task in Ant:
- **Class - Test**: Verifies the functionality of the `Main Class` for the Homework's Program.
- **"Program" Class**: The Main Class which is the entrypoint to the Homework's program, which is the one(s) being tested.

## Output
Successful Compilation and Building indicates that all tests for both components have passed without any failures.

## How to Run
To execute the build and test process, use the following command:
```bash
ant -f build.xml(or the specified build script)
