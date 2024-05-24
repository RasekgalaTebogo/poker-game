#!/bin/bash -x

# Exit immediately if a command exits with a non-zero status.
set -e

LOG_FILE="output.log"

# Compile the project and run tests
echo "Compiling the project and running tests..."
mvn clean compile test > "$LOG_FILE" 2>&1

# Package the application into a JAR file
echo "Packaging the application..."
mvn package

# Run the application
echo "Running the application..."
java -jar target/poker-game-1.0-SNAPSHOT.jar
