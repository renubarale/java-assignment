/*
//Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods 
//with the same name 'printn' having a parameter for each datatype.

class PrintNumber{
	static void printn(boolean a){
		System.out.println(a);
	}
	static void printn(String b){
		System.out.println(b);
	}
	static void printn(int c){
		System.out.println(c);
	}
	static void printn(long d){
		System.out.println(d);
	}
	static void printn(float e){
		System.out.println(e);
	}
	static void printn(char f){
		System.out.println(f);
	}
	static void printn(double g){
		System.out.println(g);
	}
	

	public static void main(String[]args){
		printn(10);
		printn(27.2f);
		printn(15l);
		printn(55.2);
		printn("Hello");
		printn(true);
		printn('A');
		
	}
}
*/

/*
//2.Create a class to print an integer and a character with two methods having the same name but different sequence of the integer
// and the character parameters.

class Print{
	static void m1(char a,int b){
		System.out.println(a+" "+b);
	}
	
	static void m1(int c,char d){
		System.out.println(c+" "+d);
	}
	
	public static void main(String[] args){
		m1('R',2);
		m1(22,'M');
	}
}
*/

/*
//3.Create a class to print the area of a square and a rectangle. 
//The class has two methods with the same name but different number of parameters. 
//The method for printing area of rectangle has two parameters which are length and breadth respetively while
// the other method for printing area of square has one parameter which is side of square.

class Square{
	static void PrintArea(int a,int b){
		float sqr=a*b;
		System.out.println("Area of rectangle ="+sqr);
		
	}
	
	static void PrintArea(int x){
		float sqrr=x*x;
		System.out.println("Area of square ="+sqrr);
		
	}
	
	public static void main(String[] args){
		PrintArea(6);
		PrintArea(5,8);
	}
	
	
}
*/


//4.Create a class 'Student' with three data members which are name, age and address.
// The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available".
// It has two members with the same name 'setInfo'. 
//First method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are 
//assigned to name, age and address respectively. Print the name, age and address of 10 students.




/*
//5.Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". 
//It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name
// that prints "I am an Undergraduate" and "I am a Postgraduate" respectively.
//Call the method by creating an object of each of the three classes.

class Degree{
	void getDegree(){
	System.out.println("I got Degree!!!");
	}
}

class Undergraduate extends Degree{
	void getDegree(){
	System.out.println("I am an Undergraduate");
	}
}

class Postgraduate extends Degree{
	void getDegree(){
	System.out.println("I am a Postgraduate");
	}
}

class PrintDegree{
	public static void main(String[] args){
		Degree d=new Degree();
		d.getDegree();
		
		Degree d1=new Undergraduate();
		d1.getDegree();
		
		Degree d2=new Postgraduate();
		d2.getDegree();
		
		
	}
}
*/


/*
//6.A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
// We have to print the money deposited by him in a particular bank.
//Create a class 'Bank' with a method 'getBalance' which returns 0.
// Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance'
// which returns the amount deposited in that particular bank.
// Call the method 'getBalance' by the object of each of the three banks.


class Bank{
	public int getBalance(){
		return 0;
	}
}

class BankA extends Bank{
	public int getBalance(){
		return 1000;
	}
	
}

class BankB extends Bank{
	public int getBalance(){
		return 1500;
	}
}

class BankC extends Bank{
	public int getBalance(){
		return 2000;
	}
}

class Statement{
	public static void main(String[] args){
		Bank b1=new BankA();
		System.out.println("BankA has balance Rs"+b1.getBalance());
		
		Bank b2=new BankA();
		System.out.println("BankB has balance Rs"+b2.getBalance());
		
		Bank b3=new BankA();
		System.out.println("BankC has balance Rs"+b3.getBalance());
	}
}

*/


/*
//7.A class has an integer data member 'i' and a method named 'printNum' to print thevalue of 'i'.
// Its subclass also has an integer data member 'j' and a method named 'printNum' to print the value of 'j'.
// Make an object of the subclass and use it to assign a value to 'i' and to 'j'. Now call the method 'printNum' by this object.

class Number{
	static int i;
	
	static void printNum(int i){
		System.out.println("Value of i="+i);
	}
}

class Num extends Number{
	static int j;
	
	static void printNum(int j){
		System.out.println("Vaue of j ="+j);
	}
	
}

class CallNum{
	public static void main(String...args){
		Number n1=new Num();
		n1.printNum(5);//i printed
		
		Num n2=new Num();
		n2.printNum(10);//j printed
	}
}

*/



//8.Suppose a class 'A' has a static method to print "Parent". 
//Its subclass 'B' also has a static method with the same name to print "Child". 
//Now call this method by the objects of the two classes. Also, call this method by an object of the parent class refering to the child class 
//i.e. A obj = new B()

class A{
	static void Print(){
		System.out.println("Parent");
	}
}

class B extends A{
	static void Print(){
		System.out.println("child");
	}
}

class Demo{
	public static void main(String[] args){
		A obj=new A();
		obj.Print();
		
		B obj2=new B();
		obj2.Print();
		
		A obj3=new B();
		obj3.Print();
	}
}








