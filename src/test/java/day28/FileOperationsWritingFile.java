package day28;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationsWritingFile {

	public static void main(String[] args) {
		
		File f  = new File("C:\\Users\\DELL\\eclipse-workspace\\JavaTrainingBatch2\\src\\test\\resources\\dummy.txt");
		
		// Writing datas inside the file 
		
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("This is the first piece of code in File Handling");
			fw.close();
		} catch (IOException e) {
			
		}
		
	}

}
