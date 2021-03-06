package sumin.sample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileWriteStream {

	public static void main(String[] args) throws IOException {
		// 객체를 스트림 형태로 파일에 기록
		// 클래스에 대한 객체를 만들고 그것을 파일에 저장
		
		String fpath = "c:/java/users.data";
		FileOutputStream fos = new FileOutputStream(fpath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		// 스트림으로 저장할 클래스의 객체 만들기
		Users u = new Users("sumin", "123456", "수민", 26);
		
		//생성된 객체를 파일에 쓰기
		oos.writeObject(u);

		oos.close();
		fos.close();
		
		

	}

}


//클래스의 객체를 파일에 기록하려면 
//클래스 선언시 Serializable 을 구현해야함
class Users implements Serializable{
	
	
	private static final long serialVersionUID = 5215373361759759290L;
	
	private String userid;
	private String passwd;
	private String name;
	private int age;
	
	public Users(){
		
	}
	
	public Users(String userid, String passwd, String name, int age) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}



	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getPasswd() {
		return passwd;
	}



	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Users [userid=" + userid + ", passwd=" + passwd + ", name=" + name + ", age=" + age + "]";
	}
	
	
}