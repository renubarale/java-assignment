/*
interface Mammals{
	void printMammal();
}

interface MarineAnimals{
	void printMarineAnimal();
}

class BlueWhale implements Mammals,MarineAnimals{
	public void print(){
		System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
	}
	
	public void printMammal(){
		System.out.println("I am Mammal");
	}
	
	public void printMarineAnimal(){
		System.out.println("I am Marine Animal");
	}
	
}

class Demo1{
	public static void main(String[] args){
		
		BlueWhale b1=new BlueWhale();
		b1.print();
		
		Mammals m3=new BlueWhale();
		m3.printMammal();
		
		MarineAnimals m4=new BlueWhale();
		m4.printMarineAnimal();
	}
}
*/

/*
Make a class named Fruit with a data member to calculate the number of fruits in a basket.
Create two other class named Apples and Mangoes to calculate the number of apples and mangoes in the basket.
Print the number of fruits of each type and the total number of fruits in the basket


class Fruit{
	static int count=0;
	
	static{
		count++;
	}
}

class Apples{
	static int count;
	
	static{
		count++;
	}
}

class Manoges{
	static int count;
	static{
		count++;
	}
	
}

*/


/*
class Vehicals{
	int mileage;
	double price;
	Vehicals(){
		this.mileage=100;
		this.price=100000;
		System.out.println("Mileage :"+this.mileage+", Price starts from: "+this.price);
	}
}

class Car extends Vehicals{
	double cost;
	int warranty;
	int seating_capacity;
	String fule;
	
	Car(){
		this.cost=500000;
		this.warranty=8;
		this.seating_capacity=5;
		this.fule="Petrol";
		System.out.println("Owneship cost is: "+this.cost+", Warranty(years): "+this.warranty+", seating_capacity: "+this.seating_capacity+", fule(type): "+this.fule);
	}
	
	
}

class Audi extends Car{
	String model_type;
	Audi(){
		this.model_type="AUDI201";
		System.out.println("Model type: "+this.model_type);
	}
	
}

class Ford extends Car{
	String model_type;
	Ford(){
		this.model_type="FORD556";
		System.out.println("Model type: "+this.model_type);
	}
}

class Bike extends Vehicals{
	int no_cylinders;
	int no_gears;
	String cooling_type;
	String wheel_type;
	int fule_tank;
	
	Bike(){
		this.no_cylinders=2;
		this.no_gears=4;
		this.cooling_type="Oil";
		this.wheel_type="alloys";
		this.fule_tank=80;
		System.out.println("no_cylinders: "+this.no_cylinders+", no_gears: "+this.no_gears+", cooling_type: "+this.cooling_type+", wheel_type: "+this.wheel_type+", fule_tank: "+this.fule_tank);
	}
	
}

class Bajaj extends Bike{
	String make_type;
	Bajaj(){
		this.make_type="BAJAJ S";
		System.out.println("make_type: "+this.make_type);
	}
}

class TVS extends Bike{
	String make_type;
	TVS(){
		this.make_type="TVS H";
		System.out.println("make_type: "+this.make_type);
	}
}

class Demo3{
	public static void main(String[] args){
		Car c1=new Audi();
		System.out.println();
		Car c2=new Ford();
		System.out.println();
		Bike b1=new Bajaj();
		System.out.println();
		Bike b2=new TVS();
	}
}
*/

/*
class Shape{
	void print(){
		System.out.println("This is a shape");
	}
}

class Polygon extends Shape{
	void print(){
		System.out.println("Polygon is a shape");
	}
}

class Triangle extends Polygon{
	void print(){
		System.out.println("Triangle is a polygon");
	}
}

class Rectangle extends Polygon{
	void print(){
		System.out.println("Rectangle is a polygon");
	}
}

class Square extends Rectangle{
	void print(){
		System.out.println("Square is a rectangle");
	}
}

class ShapeDemo{
	public static void main(String[] args){
		Shape s1=new Shape();
		s1.print();
		System.out.println();
		
		Polygon p1=new Polygon();
		p1.print();
		System.out.println();
		
		Triangle t1=new Triangle();
		t1.print();
		System.out.println();
		
		Rectangle r1=new Rectangle();
		r1.print();
		System.out.println();
		
		Square sq2=new Square();
		sq2.print();
	}
}
*/