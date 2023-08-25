public void output {
	
	BufferedWriter bw =null;
	try {
		bw =new BufferedWriter(new FileWriter("test.txt",true));
		bw.write("안녕하세요");
		bw.write("반갑습니다");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}

}
