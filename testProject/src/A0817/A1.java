package A0817;
import java.io.*;
public class A1 {
//스트림, FILE클래스, 
	public static void main(String[]args) {
		String filePath ="myFile.txt";
		
		try {
			File file= new File(filePath);
			boolean isFileCreated =file.createNewFile();
			
			if(isFileCreated) {
				System.out.print("파일생성성공");
				
			}else {
				System.out.print("파일생성실패");
			}
		}catch(IOException e) {
				e.printStackTrace();
			}
		try {
			OutputStream out=new FileOutputStream(filePath);
			out.write(7);
		}catch(IOException e) {
			e.printStackTrace();
		}
//			file.createNewFile();
		try {
		InputStream in=new FileInputStream(filePath);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
			
//		catch(IOException e) {
//			e.printStackTrace();
//		}
	
	}
}
	
	
	

