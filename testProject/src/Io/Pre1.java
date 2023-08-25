package Io;
import java.io.*;
public class Pre1 {

	public static void main(String[] args) {
		String filePath = "myFile1.txt";

		try {
			File file = new File(filePath);
			boolean isFileCreated = file.createNewFile();

			if (isFileCreated) {
				System.out.print("파일 생성 완료 : " + filePath);
			} else {
				System.out.print("파일 생성 실패");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (OutputStream out = new FileOutputStream(filePath);){
			
			//-----------------------
			String data = "723213";
			out.write(data.getBytes());
			//-----------------------
			
		} catch(IOException e) {
			e.printStackTrace();
		}

		try {
			InputStream in = new FileInputStream(filePath);
			//-----------------------
			int readByte = in.read();
			System.out.println((char) readByte);
			//-------------
		} catch (IOException e) {
			e.printStackTrace();
		}



	}
}

