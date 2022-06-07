class Car{
	private int year;
	private String make;
	private double speed
	
	Car(int year,String make,double speed){
		this.year=year;
		this.make=make;
		this.speed=speed;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public String getMake(){
		return this.make;
	}
	
	public double getSpeed(){
		return this.speed;
	}
	
	public double accelerate(){
		speed=1+speed;
	}
}

class RaceTrack{
	public static void main(String[] args){
		Car c1=new Car(2016,"Porsche",40.0);
		System.out.println(c1.getYear());
	}
}