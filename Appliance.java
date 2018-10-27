import java.util.*;

public class Appliance 
{
	String name;
	int fans;
	int tubelights;
	int ACs;
	int fridges;
	int unitsConsumed;
	boolean domestic,commercial;
	double bill;

	public Appliance()
	{
		this(" " ,0,0,0,0,0);
		bill=(double)0.0;
	}
	public Appliance(String name,int fans,int tubelights,int ACs,int fridges,int units)
	{
		this.name=name;
		this.fans=fans;
		this.tubelights=tubelights;
		this.ACs=ACs;
		this.fridges=fridges;
		this.unitsConsumed=units;
		this.domestic=domestic;
		this.commercial=commercial;
	}
	int getFans()
	{
		return fans;
	}
	int getTubelights()
	{
		return tubelights;
	}
	int getAC()
	{
		return ACs;
	}
	int getFridges()
	{
		return fridges;
	}
	String getName()
	{
		return name;
	}
	void calculate()
	{
		bill=(double)0.0;
		int units=unitsConsumed;
		//double units=(double)2000;
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

		for(;units>0;)
		{
			if((units>0) && (units <=100))
			{
				bill+=(double)(100*1.50);
				units-=100;
			}
			else if((units>100)&&(units<=200))		
			{
				bill+=(double)(100*3.50);
				units-=100;
			}

			else if((units>200)&&(units<=500))
			{
				bill+=(double)(300*4.60);
				units-=300;
			}
			else if(units>500)
			{
				bill+=(double)(500*6.60);
				units-=500;;
			}
		}
		bill-=(double)150;
	}
	int getUnits()
	{
		return unitsConsumed;
	}
	double getBill()

	{
		//System.out.println
		return bill;
	}
}
