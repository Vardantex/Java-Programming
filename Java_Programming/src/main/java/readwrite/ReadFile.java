package readwrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("sample.text");
		
		try {
			List<String> lines = Files.readAllLines(filePath);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
