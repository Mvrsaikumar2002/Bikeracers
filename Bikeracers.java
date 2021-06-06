import java.util.Scanner;
public class Bikeracers {
	public static void main(String[] args) {
		double racer1,racer2,racer3,racer4,racer5,avg;
		Scanner race =new Scanner(System.in);
		System.out.println("Enter the speeds of five racers:");
		racer1=race.nextDouble();
		racer2=race.nextDouble();
		racer3=race.nextDouble();
		racer4=race.nextDouble();
		racer5=race.nextDouble();
		avg=(racer1+racer2+racer3+racer4+racer5)/5;
		System.out.println("The avg speed to Qualify race is +avg");
		
		if(racer1>avg)
		{
			System.out.println("Racer1 is qualified with speed"+" "+racer1);
		}
		if(racer2>avg)
		{
			System.out.println("Racer2 is qualified with speed"+" "+racer2);
		}
		if(racer3>avg)
		{	
			System.out.println("Racer3 is qualified with speed"+" "+racer3);
		}

		if(racer4>avg)
		{	
			System.out.println("Racer4 is qualified with speed"+" "+racer4);
		}
		
		if(racer5>avg)
		{	
			System.out.println("Racer5 is qualified with speed"+" "+racer5);
		}
		
	}
}


