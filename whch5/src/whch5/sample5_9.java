package whch5;

public class sample5_9 
{
	public static void main(String[] args)
	{
		Car1 car1;
		car1 = new Car1();
		try 
		{
			car1.setCar1(1234,-10.0);
		}
		catch(CarException e)
		{
			System.out.println("拋出"+ e + "了");
		}
		car1.show();
	}
}
class Car1
{
	private int num;
	private double gas;
	public Car1()
	{
		num=0;
		gas=0.0;
		System.out.println("已生產了汽車");
	}
	public void setCar1(int n,double g)throws CarException
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
        super(message); // 呼叫父類別 (Exception) 的建構子
    }
}