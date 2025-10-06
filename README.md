# JavaTest

A simple Java Maven project that displays "Hello World" on the console.

## Prerequisites

- Java 25 or higher
- Maven 3.6 or higher

## Project Structure

```
JavaTest/
├── README.md
├── pom.xml                         # Maven configuration
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── HelloWorld.java    # Main application
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── HelloWorldTest.java # Unit tests
└── .gitignore                      # Git ignore file for Maven projects
```

## How to Run

### Using Maven (recommended)

```bash
# Compile the project
mvn compile

# Run tests
mvn test

# Run the application
mvn exec:java -Dexec.mainClass="com.example.HelloWorld"

# Build JAR file
mvn package
```

### Using Java directly

```bash
# Compile first
mvn compile

# Run with Java
java -cp target/classes com.example.HelloWorld
```

## Expected Output

```
Hello World
```

## Maven Goals

- `mvn clean` - Clean build artifacts
- `mvn compile` - Compile the source code
- `mvn test` - Run unit tests
- `mvn package` - Create JAR file
- `mvn exec:java` - Run the main class