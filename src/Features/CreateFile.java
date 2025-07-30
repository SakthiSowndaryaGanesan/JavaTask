package Features;

import java.io.File;  //Import the file class
import java.io.IOException;  //Import the IOException the handle errors.

public class CreateFile {

	public static void main(String[] args) {

		
		try {
			File f=new File("C:\\Users\\sakthi.ganesan\\OneDrive - Aspire Systems (India) Private Limited\\Attachments\\DemoFile"); //IOException usually throws an error so added unimplemented method for try catch block
			if(f.createNewFile()) {
				System.out.println("File created successfully : " +f.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred"+e);
			e.printStackTrace();
		}
	}

}
