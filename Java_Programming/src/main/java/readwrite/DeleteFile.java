package readwrite;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class DeleteFile {

	public static void main(String[] args) {
		
		
		List<String> fileName = Arrays.asList("file.txt1", "file2.txt");
		
		for(String file : fileName) {
			Path filePath = Paths.get(file);
			
		
		
		try {
			Files.delete(filePath);
			System.out.println("File " + file + " deleted successfully");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();   
			}
		}
	}
}
