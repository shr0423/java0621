package com.sp.project0621.bank;
/*���� ��Ű���� �ִ� Ŭ������ import�����ʴ´�*/
class Hacker{
	public static void main(String[] args) {
		Account acc=new Account();
		//acc.balance=0;
		//System.out.println(acc.name+"�� �����ܰ�"+acc.balance);
		acc.setBalance(-5000);
		System.out.println(acc.getBalance());
	}
}
