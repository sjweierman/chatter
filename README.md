# Chatter: A REPL for connecting to Google Gemini

A simple, text-based REPL (Read-Evaluate-Print Loop) application that connects to the Gemini API using Java and Python.

## Project Goals

* Demonstrate hybrid development using the strengths of Java and Python.
* Explore basic API interaction with the Gemini AI platform.
* Provide a foundation for building more sophisticated AI-powered text-based applications.

## Prerequisites

* Java Development Kit (JDK) – Installation instructions vary based on your OS. 
* Python 3 – Download from https://www.python.org/downloads/
* `google-generativeai` Python library: Install using `pip install google-generativeai`
* A Gemini API key: Obtain from https://ai.google.dev (sign-up may be required)

## Setup

1. **Clone or download this repository.**
2. **Set up your Gemini API key:**
    Create a file named `api_key.txt` in the project's root directory and place your API key inside. Ensure this file is *not* committed to version control.
4. **Install the `google-generativeai` library in your Python environment:**  
   `pip install google-generativeai`
   
## Running the Application
1.  Navigate to the directory in your terminal.
2.  Compile the code using `javac Chatter.java`
3.  Run the program using `java Chatter`

## Usage
Type in a prompt or a question and press Enter. The REPL will send your input to the Gemini API and display the response. Type 'goodbye' to exit the REPL.

## Notes

* This project is intended for demonstration and learning purposes.
* For production applications, explore more robust API key management and error handling.
* Consider using tools like gRPC for potentially more efficient communication between Java and Python processes.

## Potential Enhancements

* Improve the user interface with a Java library like Swing or JavaFX.
* Add advanced error handling and input validation.
* Implement a command-line argument parser for customization options.

## Disclaimer

**This project is not directly affiliated with or endorsed by Gemini AI or Google.  Use the Gemini API in accordance with their terms of service.**
