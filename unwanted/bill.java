import java.util.*;
public class bill
{
	public static void main(String[] args)
	{
		double bill=(double)0.0;
		//int units=unitsConsumed;
		double units=(double)2000;
		if(units>500)
		{
			bill=(double)50;
		}
		else if(units<=500)
		{
			bill=(double)30;
		}
		else if(units<=200)
		{
			bill=(double)20;
		}
		else if(units<=100)
		{
			bill=(double)0;
		}

		System.out.println(bill);
		for(;units>0;)
		{
		System.out.println(bill);
		System.out.println(units);
			if((units>0) && (units <=100))
			{
		System.out.println(units);
				bill+=(double)(100*1.50);
				units-=100;
			}
			else if((units>100)&&(units<=200))		
			{
		System.out.println(units);
				bill+=(double)(100*3.50);
				units-=100;
			}

			else if((units>200)&&(units<=500))
			{
		System.out.println(units);
				bill+=(double)(300*4.60);
				units-=300;
			}
			else if(units>500)
			{
		System.out.println(units);
				bill+=(double)(500*6.60);
			units-=500;;
			}
		}
		bill-=(double)150;
		System.out.println(bill);
	}
}
