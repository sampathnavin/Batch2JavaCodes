package day28;

import java.io.File;
import java.io.IOException;

public class FileOperationsCreatingFile {

	public static void main(String[] args) {
		
		// File is a class inbuild in java and we have to overload the file path
		
		
		File f  = new File("C:\\Users\\DELL\\eclipse-workspace\\JavaTrainingBatch2\\src\\test\\resources\\dummy.txt");
		
		// Inbuild Methods 
		
		// To create a file 
		
		try {
			if(f.createNewFile())
			{
				System.out.println("File Created");
			}
			else 
			{
				System.out.println("File already exits");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
