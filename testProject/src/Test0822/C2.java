package Test0822;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class C2 {
//public void output() {
	//	FileWriter fw=null;
	//	try {
	//		fw=new FileWriter("test.txt");
	//		fw.write(97);
	//		fw.write(65);
	//		
	//		
	//	}catch(FileNotFoundException e) {
	//		e.printStackTrace();
	//	}catch(IOException e) {
	//		e.printStackTRACE();
	//	}

	public void output() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("test.txt");
			fw.write(97);
			fw.write(65);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
				if (fw != null) {
					fw.close();
				
			
		}
	}
}
}



