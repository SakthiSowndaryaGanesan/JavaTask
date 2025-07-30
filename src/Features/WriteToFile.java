package Features;

import java.io.FileWriter; //Import the file writer class
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {

		try {
			FileWriter fw=new FileWriter("C:\\Users\\sakthi.ganesan\\OneDrive - Aspire Systems (India) Private Limited\\Attachments\\File1");
			
			fw.write("Java is the prominent programming language");
			fw.close(); //If the writing something we need to close then only this will be execute else complier will thing still we are writing something.
		System.out.println("Successfully wrote the file.");
		} 
		catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
