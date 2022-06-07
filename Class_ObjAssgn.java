/*
//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
class Student{
	String name;
	int roll_no;
	
	void print(){
		System.out.println(name+" "+roll_no);
	}
}

class StudentDemo{
	public static void main(String[] args){
		Student s1=new Student();
		s1.name="John";
		s1.roll_no=2;
		s1.print();
		
		s1=new Student();
		s1.name="Harry";
		s1.roll_no=1;
		s1.print();
	}
}
*/

/*
//Assign and print the roll number, phone number and 
//address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

class Student1{
	String name;
	int phn_no;
	int roll_no;
	String address;
	
	void print(){
		System.out.println(name+"'s Roll no is,"+roll_no+" Phone no is "+phn_no+"and address is "+address);
	}
}

class Student1Demo{
	public static void main(String[] args){
		Student1 s1=new Student1();
		s1.name="John";
		s1.roll_no=2;
		s1.phn_no=12345678;
		s1.address="New York";
		
		Student1 s2=new Student1();
		s2.name="sam";
		s2.roll_no=1;
		s2.phn_no=125645678;
		s2.address="New York";
		
		s1.print();
		s2.print();
	}
}
*/

/*
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
// by creating a class named 'Triangle' without any parameter in its constructor.

class Triangle{
	int a=3;
	int b=4;
	int c=5;
	
	Triangle(){
		double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
		System.out.println((a+b+c));
	}
}

class Output{
	public static void main(String []args){
		Triangle t=new Triangle();
		
	}
}
*/


/*
//4.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
// by creating a class named 'Triangle' with constructor having the three sides as its parameters.

class Triangle2{
	int a,b,c;
	
	Triangle2(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		
		int perimeter=a+b+c;
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("perimeter= "+perimeter+" area= "+area);
		
	}
	
}

class output{
	public static void main(String[] args){
		Triangle2 t1=new Triangle2(3,4,5);
		
		
	}
}
*/

/*
//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively 
//by creating a class named 'Rectangle' with a method named 'Area' 
//which returns the area and length and breadth passed as parameters to its constructor.

class Rectangle{
	int Area(int a,int b){
		int area=a*b;
		return area;
	}
}

class Area_Rect{
	public static void main(String[] args){
		Rectangle r1=new Rectangle();
		int val=r1.Area(4,5);
		System.out.println("Area of rectangle1= "+val);
		int val1=r1.Area(5,8);
		System.out.println("Area of rectangle2= "+val1);
		
		
	}
}
*/


/*
//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
//First method named as 'setDim' takes length and breadth of rectangle as parameters 
//and the second method named as 'getArea' returns the area of the rectangle. 
//Length and breadth of rectangle are entered through keyboard.

//Note- Encpsulations concept
class Area{
	
	private int length,breadth,area;
	
	public void setDim(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		this.area=this.length*this.breadth;
	}
	
	public int getArea(){
		return this.area;
	}
}

class Area_d{
	public static void main(String[] args){
		Area a1=new Area();
		a1.setDim(4,5);
		System.out.println(a1.getArea());
	}
}
*/

/*
//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of 
//its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.

//parametorised constructor
class Area{
	int length,breadth,area;
	
	Area(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		this.area=length*breadth;
		
	}
	
	void returnArea(){
		System.out.println("Area ="+this.area);
	}
}

class Area2_Out{
	public static void main(String[] args){
		Area a2=new Area(6,5);
		a2.returnArea();
	}
}
*/

/*
//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

class Average{
	int a,b,c;
	double avg;
	void Calculate(int a,int b,int c){
		avg=(a+b+c)/3;
	}
	
	double print(){
		return avg;
	}
}

class Avg_Out{
	public static void main(String[] args){
		Average a1=new Average();
		a1.Calculate(4,5,6);
		double val=a1.print();
		System.out.println(val);
	}
}
*/


//9. Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods
// for each operation whose real and imaginary parts are entered by user.


/*
10. Write a program that would print the information (name, year of joining, salary, address) of three employees
 by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
*/


class Employee{
	String name;
	int yr_of_joining;
	String address;
	
	Employee(String name,int yr_of_joining,String address){
		this.name=name;
		this.yr_of_joining=yr_of_joining;
		this.address=address;
	}
	
	void print(){
		System.out.println(this.name+"  "+this.yr_of_joining+"  "+this.address);
	}
}

class Demo{
	public static void main(String[] args){
		Employee e1=new Employee("Robert",1994,"64C-WallsStreatR");
		e1.print();
		Employee e2=new Employee("Sam",2000,"68D- WallsStreat");
		e2.print();
		Employee e3=new Employee("John",1999,"26B- WallsStreat");
		e3.print();
	}
}