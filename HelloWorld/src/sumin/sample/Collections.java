package sumin.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		// 배열의 단점
		// 같은 종류의 데이터만 다룸, 크기조정 불가
		
		String[] userid = new String[3];
		userid[0] = "sumin";
		//userid[1] = 123456;
		//userid[2] = 987654.321;
		//userid[3] = "abc123";
		
		//List 인터페이스의 ArrayList
		//배열과 달리 크기를 지정하지 않아도 되고, 어떤 종류의 데이터도 add 가능
		ArrayList list = new ArrayList();
		list.add("sumin");
		list.add(123456);
		list.add(987.654);
		list.add(new SungJukV6DTO());
		
		//문제는 꺼내올 때 발생
		//add시 모든 데이터는 Object 형으로 저장
		//따라서, 꺼낼 때 각 데이터 유형에 맞게 암시적으로 형변환이 발생
		System.out.println((String) list.get(0));
		System.out.println((int) list.get(1));
		System.out.println((double) list.get(2));
		System.out.println((SungJukV6DTO) list.get(3));
		
		//지네릭스
		//컬렉션 객체에 저장할 객체의 종류를 미리 지정
		//따라서, 불필요한 형변환을 막음 - 성능저하 발생
		//즉, 한 종류의 객체만을 저장한다는 지침을 지키자!
		//저장할 객체의 종류는 <> 기호를 사용
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("sumin");
		//list2.add(123456); 
		//list2.add(987.654);
		//list2.add(new SungJukV6DTO());
		//list2는 String만 저장 가능한 객체로 선언
		
		
		//지네릭 예제 - JDK5 이전
		List zoo1 = new ArrayList();
		Rabbit r1 = new Rabbit();
		DesertFox f1 = new DesertFox();
		Zebra z1 = new Zebra();
		
		
		zoo1.add(r1);
		zoo1.add(f1);
		zoo1.add(z1);
		
		//암시적 형변환
		System.out.println(zoo1.get(0));
		System.out.println(zoo1.get(1));
		System.out.println(zoo1.get(2));

		//r1 = zoo1.get(0); // Object 타입으로 들어가니까 형변환 (Rabbit) 필요
		//불필요한 명시적 형변환이 필요!
		r1 = (Rabbit) zoo1.get(0);
		f1 = (DesertFox) zoo1.get(1);
		z1 = (Zebra) zoo1.get(2);
		
		//JDK5 이상 - 지네릭스 사용
		List<Rabbit> zoo2 = new ArrayList<>();
		List<DesertFox> zoo3 = new ArrayList<>();
		List<Zebra> zoo4 = new ArrayList<>();
		
		zoo2.add(r1);
		r1 = zoo2.get(0); // 형변환이 없다!
		
		zoo3.add(f1);
		f1 = zoo3.get(0);
		
		zoo4.add(z1);
		z1 = zoo4.get(0);
		
		//List CRUD 예제
		List<String> namelist = new ArrayList<>();
		
		//데이터 추가: add()
		namelist.add("수지");
		namelist.add("혜교");
		namelist.add("지현");
		
		//데이터 갯수: size()
		System.out.println(namelist.size());
		
		//데이터 부분조회: get(위치값)
		System.out.println(namelist.get(0));
		System.out.println(namelist.get(1));
		System.out.println(namelist.get(2));
		
		//데이터 전체조회 : for
		for(int i=0; i<namelist.size(); ++i){
			System.out.println(namelist.get(i));
		}
		
		// ↓ 위에랑 같은 의미 좀더 쉽게..컬렉션을 다룰 때는 향상된 for 추천!
		for(String val : namelist){
			System.out.println(val);
		}
		
		//데이터 전체조회 : Iterator
		//Iterator : 반복처리자
		//컬렉션에 저장된 데이터에 접근해서
		//반복적으로 무언가를 처리하기 위한 것
		Iterator<String> ir = namelist.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		//수정 : set(위치, 값)
		System.out.println(namelist.get(0));
		namelist.set(0, "중기");
		System.out.println(namelist.get(0));
		
		//찾기 : contains()
		String key = "혜교";
		if(namelist.get(0).contains(key))
			System.out.println("데이터 찾음");
		
		// ↓ 위에꺼 반복문으로 쓰기
		for(int i=0; i<namelist.size(); ++i){
			if(namelist.get(i).contains(key))
				System.out.println((i+1)+"번째에서 데이터 찾음");
		}
		
		
		//삭제 : remove(위치), clear
		System.out.println(namelist.get(0));
		namelist.remove(0);
		System.out.println(namelist.get(0));
		
		namelist.clear(); //모두 삭제
		//System.out.println(namelist.get(0));
	}

}

class Rabbit{
	
}

class DesertFox{
	
}

class Zebra{
	
}










