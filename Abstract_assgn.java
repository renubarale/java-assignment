/*
abstract class Animals{
	abstract void cats();
	abstract void dogs();
}

class Cats extends Animals{
	public void cats(){
		System.out.println("Cats meow");
	}
	void dogs(){
  
	}

}

class Dogs extends Animals{
	public void dogs(){
		System.out.println("Dogs bark");
	}
	void cats(){
  
	}
}

class Demo5{
	public static void main(String[] args){
		Cats c = new Cats();
		Dogs d = new Dogs();
  
		c.cats();
		d.dogs();
 }
}
*/

/*
abstract class Parent{
	abstract void messege();
}

class Child1 extends Parent{
	void messege(){
		System.out.println("This is first subclass");
	}
}

class Child2 extends Parent{
	void messege(){
		System.out.println("This is second subclass");
	}
}

class ParentDemo{
	public static void main(String[] args){
		Parent p=new Child1();
		p.messege();
		
		Parent p1=new Child2();
		p1.messege();
		
		//Parent p2=new Parent(); abstract class can not instanciated
		//p2.messege();
	}
}
*/

/*
abstract class Bank{
	abstract void getBalance();
}

class Bank1 extends Bank{
	void getBalance(){
		System.out.println("100$");
	}
}

class Bank2 extends Bank{
	void getBalance(){
		System.out.println("150$");
	}
}

class Bank3 extends Bank{
	void getBalance(){
		System.out.println("200$");
	}
	
}

class BankDemo{
	public static void main(String[] args){
		Bank b1=new Bank1();
		b1.getBalance();
		
		Bank b2=new Bank2();
		b2.getBalance();
		
		Bank b3=new Bank3();
		b3.getBalance();
	}
}
*/


/*
abstract class Marks{
	abstract void getPercentage();
}

class A extends Marks{
	int a;
	int b;
	int c;
	double per,total;
	A(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		total=this.a+this.b+this.c;
		per=(total/300)*100;
	}
	
	void getPercentage(){
		System.out.println("Percentage of student A: "+this.per);
	}
}

class B extends Marks{
	int a;
	int b;
	int c;
	int d;
	double per1,total;
	B(int a,int b,int c,int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		total=this.a+this.b+this.c+this.d;
		per1=(total/400)*100;
	}
	
	void getPercentage(){
		System.out.println("Percentage of student B: "+this.per1);
	}
}

class PercentageDemo{
	public static void main(String[] args){
		Marks p1=new A(85,90,90);
		p1.getPercentage();
		
		Marks p2=new B(80,90,90,85);
		p2.getPercentage();
	}
}
*/

/*
abstract class Prac{
	Prac(){
		System.out.println("This is constructor of abstract class");
	}
	
	abstract void a_method();
	
	void non_abstract(){
		System.out.println("This is a normal method of abstract class");
	}
}

class SubClass extends Prac{
	void a_method(){
		System.out.println("This is abstract method");
	}
}

class PracDemo{
	public static void main(String[] args){
		SubClass s1=new SubClass();
		s1.a_method();
		s1.non_abstract();
	}
}
*/


/*
abstract class Shape{
	abstract double RectangleArea(double l,double b);
	abstract double SquareArea(double s);
	abstract double CircleArea(double r);
}

class Area extends Shape{
	
	double RectangleArea(double l,double b){
		double area;
		return area=l*b;
	}
	
	double SquareArea(double s){
		double area;
		return area=s*s;
		//System.out.println("Area of Square :"+area);
	}
	
	double CircleArea(double r){
		double area;
		return area=3.14*r*r;
		//System.out.println("Area of Circle :"+area);
	}
}

class ShapeDemo{
	public static void main(String... args){
		Area s1=new Area();
		System.out.println("Area of Rectangle :"+s1.RectangleArea(6.0,5.0));
		
		Area s2=new Area();
		System.out.println("Area of Square :"+s2.SquareArea(6.0));
		
		Area s3=new Area();
		System.out.println("Area of Circle :"+s3.CircleArea(3.0));
		
		
	}
}
*/


abstract class Shape{
	abstract double RectangleArea(double l,double b);
	abstract double SquareArea(double s);
	abstract double CircleArea(double r);
}

class Area extends Shape{
	
	double RectangleArea(double l,double b){
		double area;
		area=l*b;
		return area;
	}
	
	double SquareArea(double s){
		double area;
		return area=s*s;
		//System.out.println("Area of Square :"+area);
	}
	
	double CircleArea(double r){
		double area;
		return area=3.14*r*r;
		//System.out.println("Area of Circle :"+area);
	}
}

class ShapeDemo1{
	public static void main(String... args){
		Area s1=new Area();
		double val=s1.RectangleArea(6.0,5.0);
		double val1=s1.RectangleArea(4.0,5.0);
		double val2=s1.RectangleArea(8.0,6.0);
		double val3=s1.RectangleArea(9.0,10.0);
		
		double sq1=s1.SquareArea(4.0);
		double sq2=s1.SquareArea(5.0);
		double sq3=s1.SquareArea(6.0);
		double sq4=s1.SquareArea(7.0);
		
		double c1=s1.CircleArea(3.0);
		double c2=s1.CircleArea(3.0);
		double c3=s1.CircleArea(3.0);
		double c4=s1.CircleArea(3.0);
		double c5=s1.CircleArea(3.0);
		
		Object arr[]={val,val1,val2,val3,sq1,sq2,sq3,sq4,c1,c2,c3,c4,c5};
		
		for(Object ar: arr){
			System.out.println("Area :"+ar);
		}
		
		
		
		
	}
}
