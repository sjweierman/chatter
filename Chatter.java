import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Chatter {
    public static void main(String[] args) {
		//ASCII art banner
		String banner = "\n/=====\\ |     |   /\\  ======= ======= +====  +====+\n" +
						"|       |     |  /  \\    |       |    |      |     |\n" +
						"|       +=====+ |====|   |       |    +===   +\\===+\n" +
						"|       |     | |    |   |       |    |      | \\ \n" +
						"\\=====/ |     | |    |   |       |    +====  |  \\__\n" +
						"Powered by Google Gemini\n";

	    Scanner in = new Scanner(System.in);
        String input = "";
		System.out.println(banner);

        while (!input.equalsIgnoreCase("goodbye")) {
            System.out.print("> ");
            input = in.nextLine();

            String response = processInput(input);

            System.out.println(response); // Display the response
        }

        System.out.println("Thank you for using Chatter!");
        in.close(); // Close the input Scanner
    }

    private static String processInput(String input) {
		try {
			Process p = new ProcessBuilder("py3env/bin/python", "gemini_interaction.py")
            .redirectErrorStream(true) // Combine error messages with output
            .start();

            // Send input to Python
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
        writer.write(input + "\n"); // Include a newline
        writer.flush();

            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        StringBuilder responseBuilder = new StringBuilder(); // Store response over multiple lines if needed
        String line;
        while ((line = reader.readLine()) != null) {
            responseBuilder.append(line);
        }

			// Close resources
			writer.close();
			reader.close();

			return responseBuilder.toString();
		} catch (Exception e) {
			return "Error communicating with Python: " + e.getMessage();
		}
	}
}
