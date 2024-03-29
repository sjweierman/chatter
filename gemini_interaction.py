import google.generativeai as genai
import sys

#read api key
file = open("api_key.txt", "r")
api_key = file.readline().strip()
file.close()

genai.configure(api_key=api_key)

def generate_response(prompt):
    model = genai.GenerativeModel('gemini-pro')
    response = model.generate_content(prompt)
    return response.text

if __name__ == "__main__":
    # Read the prompt from standard input (stdin)
    prompt = sys.stdin.readline().strip()

    # Call your generate_response function
    response_text = generate_response(prompt)

    # Print the response to standard output (stdout)
    print(response_text)


