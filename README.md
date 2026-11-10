# Morse Code Converter

### About the Project

This is a simple Java application that converts English text into international Morse code and Morse code back into English text.

### Features

- Convert English text to Morse code.
- Convert Morse code to English text.
- Support uppercase and lowercase letters.
- Handle invalid characters and incorrect Morse code.
- Simple menu in the console.

### Technologies Used

- Java 17
- Maven
- JUnit 5
- IntelliJ IDEA

### How to Run

1. Open the project in IntelliJ IDEA.
2. Open `Main.java`.
3. Run the `main` method.
4. Choose an option in the console:

   - **1** – Convert English text to Morse code.
   - **2** – Convert Morse code to English text.

### Testing

The project contains JUnit 5 tests to check that the conversions work correctly and that errors are handled.

To run the tests, open the Maven window in IntelliJ IDEA, expand **Lifecycle** and click **test**.

### Project Structure

- `Main.java` – Handles user input and output.
- `MorseCode.java` – Contains the conversion logic.
- `MorseCodeTest.java` – Contains unit tests.
- `pom.xml` – Contains Maven dependencies and project settings.

