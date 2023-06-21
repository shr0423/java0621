package com.sp.project0621.use;
import com.sp.project0621.animal.Cat;

class UseCat{
	public static void main(String[] args) {
		Cat c=new Cat();
		
		c.setAge(5);//setter을 통해 데이터 변경
		int age=c.getAge();//getter을 통해 데이터 접근
		System.out.println("나이는"+age);

		c.setName("뮤");
		String name=c.getName();
		System.out.println("이름은"+ name);
	}
}
