/*��ü���� ����� Ư¡
1)���
2)����ȭ(���θ� ���������ʴ°�)
3)�߻�ȭ(������ �ڵ带 ����ȭ��Ų��)
4)������(polymorphism)
*/

package com.sp.project0621.bank;

//���� ���¸� �����Ѥ�.
public class Account{
	//�ڹٿ����� �����ڰ� �ƹ��� ���������ڸ� ������� ������
	//����Ʈ�� default���������ڰ� ����ȴ�.
	//public ����X
	//< protected ��Ӱ��迡 �������� ���� ��Ű���� ������ ���
	//<default(���� ���� ��Ű�������� ���ٰ���)
	//<private(���� �� �� Ŭ������������ ���ٰ���-�޼��忡�� ������)
	private String num="082-084577-06-087";
	private int balance=1000000;
	private String name="batman";
	
	//�ܰ� ����
	public void setBalance(int b){
		//�ܺο��� ���޵� ���� ������� �̵����͸� ��ŷ���κ���
		if(b>0){
			balance=b;
		}
	
	}
	public int getBalance(){
		return balance;
	}
}
