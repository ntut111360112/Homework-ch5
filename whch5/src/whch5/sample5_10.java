package whch5;

public class sample5_10
{
	public static void main(String[] args)throws CarException
	{
		Car2 car1;
		car1 = new Car2();
		
		car1.setCar2(1234,-10.0);

		car1.show();
	}
}
class Car2
{
	private int num;
	private double gas;
	public Car2()
	{
		num=0;
		gas=0.0;
		System.out.println("已生產了汽車");
	}
	public void setCar2(int n,double g)throws CarException
	{
		if(g<0)
		{
			throw new CarException("" );
		}
		else
		{
			num = n;
			gas = g;
			System.out.println("將車號設為"+num+"汽油量設為"+gas);
		}
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class CarException extends Exception {
    public CarException(String message) {
        super(message); 
    }
}