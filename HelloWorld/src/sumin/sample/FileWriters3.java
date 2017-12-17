package sumin.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriters3 {

	public static void main(String[] args) throws IOException {
		//객체를 파일에 써보자!2 - 문자 스트림
				
		
		//객체를 저장할 파일 지정
		String fpath = "c:/java/mydata2.txt";
		
		
		FileWriter fw = new FileWriter(fpath, true);
		BufferedWriter bw = new BufferedWriter(fw);

		SungJukV6DTO sj = new SungJukV6DTO("수지", 74, 65, 87);

		String line = sj.getName() + "/" + sj.getKor() + "/" + sj.getEng() + "/" + sj.getMat() + "\r\n";		
		bw.write(line);
		
		
		
		
		bw.close();
		fw.close(); //파일에 입력내용이 완전히 저장되게 하려면
		
	}

}
