package com.sp.project0621.animal;
//����ȭ��? ������ private���� ����� �� ������ ���� �����̳�
//���� ��ȸ�� ���� �޼��带 �������ִ� Ŭ���� ���Ǳ��
//==encapsulation 
public class Cat{
	//private�� ���������ڸ� �ο��ϸ�, �ܺ��� �׾������
	//�� �����͸� ����� �� ����
	private String name;
	private int age;
	
	//����ȭ�� ������ ���� ������ �޼������ ��� ��Ģ�� �ִ�.
	//1)������ �����Ҷ� ���Ǵ� �޼��带 ������ setter
	//2)���� ��ȸ�ϰ� �� ������ ������ ���Ǵ� �޼���� getter
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
