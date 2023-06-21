package com.sp.project0621.test;
public class Hero {
	int hp=10;
	boolean fly=false;
	String name="메가맨";
	Bullet bullet;
	
	public void setHp(int hp) { //(가)멤버변수 hp 값을 변경하고 싶다 
		this.hp=hp;
	}
	public void setFly(boolean fly) {//(나)멤버변수 fly 값을 변경하고 싶다
		this.fly=fly;
	}
	public void setName(String name) {//(다)멤버변수 name 값을 변경하고 싶다		
		this.name=name;
	}
	public void fire(Bullet bullet){//(라)멤버변수 bullet 을 다른 총알로 변경하고 싶다
		this.bullet=bullet;
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setHp(100); //데이터
		hero.setFly(false);//데이터
		hero.setName("batman");//인스턴스
		hero.fire(new Bullet());//인스턴스
	}	
}

