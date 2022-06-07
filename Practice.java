class Car{
	int year;
	String make;
	double speed;
	
	Car(int year,String make,double speed){
		this.year=year;
		this.make=make;
		this.speed=speed;
	}
	
	public String getMake(){
		return this.make;
	}
	
	public int getYear(){
		return this.year;
	}
	public double getSpeed(){
		return this.speed;
	}
	
	double Accelerate(){
		double acc=1+this.speed;
		return acc;
	}
}

class RaceRank{
	public static void main(String[] args){
		Car c1=new Car(2010,"Porche",25.0);
		System.out.println(c1.getYear()+" "+c1.getMake()+" "+c1.getSpeed());
		double speed1=c1.Accelerate();
		System.out.println(speed1);
	}
}