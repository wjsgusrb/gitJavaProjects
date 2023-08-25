package Test0822;
import java.io.File;
import java.io.IOException;
public class B2_1 {
	public static void main(String[] args) {
		String filePath ="myFile.txt";
		
		try {
			File file=new File(filePath);
			boolean isFileCreated =file.createNewFile();
			
			if(isFileCreated) {
				System.out.print(" 파일생성완료."+filePath);
			}else {
				System.out.print(" 파일생성실패.");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
