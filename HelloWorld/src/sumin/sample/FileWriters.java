package sumin.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriters {

	public static void main(String[] args) throws IOException {
		//파일쓰기 테스트
		//키보드로부터 입력받은 문자를 파일에 저장
		
		//입력받은 문자를 저장할 파일 지정
		String fpath = "c:/java/mydata.txt";
		
		Scanner sc = new Scanner(System.in);
		//FileWriter fw = new FileWriter(fpath);
		FileWriter fw = new FileWriter(fpath, true);
		//fpath에 지정된 경로에 파일을 만들도록 객체 생성
		
		BufferedWriter bw = new BufferedWriter(fw);
		// 버퍼기능이 지원되는 파일쓰기 클래스 사용
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요 (종료는 q:)");
			String msg = sc.nextLine();
			
			if(msg.equals("q:")) break;			
			else 
				//fw.write(msg + "\r\n");
				bw.write(msg + "\r\n");
			
		}
		
		bw.close();
		fw.close(); //파일에 입력내용이 완전히 저장되게 하려면
		sc.close();
	}

}
