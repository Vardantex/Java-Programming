package readwrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WriteFile {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("output.txt");
		
		List<String> content = Arrays.asList("Hello ", "java file handling");
		
		try {
			Files.write(filePath, content);
			System.out.println("Data written to the file successfully");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
