package Features;

import java.io.File;


public class FileInformation {

	public static void main(String[] args) {

		File myobj=new File("C:\\Users\\sakthi.ganesan\\OneDrive - Aspire Systems (India) Private Limited\\Attachments\\DemoFile");
		
		if(myobj.exists()) {
			System.out.println("File name: "+myobj.getName());
			System.out.println("Absolute path : "+myobj.getAbsolutePath());
			System.out.println("Writeable : "+myobj.canWrite());
			System.out.println("Readable : "+ myobj.canRead());
			System.out.println("File size in bytes " +myobj.length());
		}
		else {
			System.out.println("The file does not exixt.");
		}
	}

}
