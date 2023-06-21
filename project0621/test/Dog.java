package com.sp.project0621.test;
class Dog({
   String name;
   Food f;

   public void setName(String d) {
		this.name=d;
   }

	public String getName(){
		return name;
	}

   public void setFood(Food fd) {
		this.f=fd;
   }
	
	public Food getFood(){
		return f;
	}
	
}
class UseDog{
	public static void main(String[] args){
		Dog d=new Dog();
		d.setName("»Ç¹Ì");
		d.setFood(new Food());
	}
}

