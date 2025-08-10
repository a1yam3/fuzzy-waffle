//Pollution control program, monitors emission for three different types of vehicles

//class file

public class Main_Vehicle 
{
	public static void main(String[] args) 
	{
		Car car=new Car();
		Bike bike=new Bike();
		Truck tru=new Truck();
		AirQuality aq=new AirQuality();
        	Scanner in = new Scanner(System.in);
		int n;
        	while (n>0) 
	{
        	System.out.println("Vehicle Emission Monitoring System");
            	System.out.println("1. Input Vehicle Emission Data");
            	System.out.println("2. View Pollution Levels");
            	System.out.println("3. View Emission Alerts");
            	System.out.println("4. View Pollution Control Device Malfunctions");
            	System.out.println("5. Log Historical Emission Data");
            	System.out.println("6. Analyze Trends in Pollution Levels");
            	System.out.println("0. Exit");
              System.out.print("Enter your choice: ");
            	int choice = in.nextInt();

          switch (choice) 
		  {
                case 1:
                    VehicleEmissionData()
                    break;
                case 2:
                    viewPollutionLevels();
                    break;
                case 3:
                    viewEmissionAlerts();
                    break;
                case 4:
                    viewPollutionControlMalfunctions();
                    break;
                case 5:
                    logHistoricalEmissionData();
                    break;
                case 6:
                    analyzePollutionTrends();
                    break;
                case 0:
                    System.out.println("Exiting the system. Goodbye!");
                    n=0;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

	public static void VehicleEmissionData() 
	{
        System.out.print("Enter vehicle type (car/truck/bike): ");
        String vehicleType = scanner.next().toLowerCase();
	
	    if(vehicleType=="car")
	    {
		    System.out.println("Enter Car emission");
		    double em=in.nextDouble();
		    Car car=new Car(em);
    	    car.record_Em();
	    }
	    else
	    if(vehicleType=="bike")
	    {
		    System.out.println("Enter Bike emission");
		    double em=in.nextDouble();
		    bike.set_em(em);
		    bike.record_Em();
		}
	    else
	    if(vehicleType=="truck")
	    {
		    System.out.println("Enter Truck emission");
		    double em=in.nextDouble();
		    truck.set_em(em)
		    truck.record_Em();
	    }

        System.out.print("Enter carbon monoxide level: ");
        double coLev = in.nextDouble();

        System.out.print("Enter nitrogen oxides level: ");
        double noLev = in.nextDouble();

        System.out.print("Enter particulate matter level: ");
        double pmLev = scanner.nextDouble();
        AirQuality aq1= new AirQuality(coLev,noLev,pmLev);

    }
    
//Java file
import java.io.*;
import java.util.Scanner;


public class HighEmissionAlertException extends Exception 
{
	public void HighEmissionAlertException(String msg) 
	{
        	super(msg);
    	}
}

public class PollutionControlFailiureException extends Exception
{
	public void PollutionControlFailiureException(String msg)
	{
		super(msg);
	}
}

public interface EmissionMonitoring 
{
    	void monitor_Em();
    	void record_Em();
	void assess_PoLev();
	boolean device_check();
	boolean device_Func();
	boolean emission_Auth();
}

public class Car implements EmissionMonitoring 
{

	private String name;
	private double emissions;
	boolean Em_standard;
	public Car()
	{
		this.name="Car";
		emissions=0.0;
	}
	public Car(double emissions)
	{
		this.emissions = emissions;
	}
    
    public void monitor_Em() 
	{
        	System.out.println("Monitoring emissions for the car.");
		if ((emission<4.7))
		{
		System.out.println("Emissions levels are below the permissile level: "+get_m());	
		}
		else
		{
			Em_standard=false;
			try{
			throws new HighEmissionAlertException("High Emission levels. Exceeds permissible level for "+get_name());
			}
			catch(HighEmissionAlertException e){
			System.out.println(e.printStackTrace());
			}
		}
    	}
    	
	boolean emission_Auth();
	{
		if (Em_standard=="false") 
		{
            		System.out.println("Alert: The vehicle does not meet required emission standards!");
            	}
       
	 	else 
		{
            		System.out.println("Vehicle emission data recorded successfully.");
        	}
    	}
	
    	public void record_Em() 
	{
        	System.out.println("Recording emission data for the car.");
    	}

    	public void assess_PoLev() 
	{
        	System.out.println("Assessing pollution levels for the car.");
		
    	}

	    
    	public boolean device_Func() 
	{
		private PollutionControlDevice catalyticConverter = new CatalyticConverter();
    		private PollutionControlDevice particulateFilter = new ParticulateFilter();
        	return catalyticConverter.isFunctioning() && particulateFilter.isFunctioning();
			
   	}
}

public class Bike implements EmissionMonitoring 
{

	private String name;
	private double emissions;
	boolean Em_standard;
	
	public Bike()
	{
		this.name="Bike";
		emissions=0.0;
	}
	public set_em(double emissions)
	{
		this.emissions = emissions;
	}
    
    public void monitor_Em() 
	{
        	System.out.println("Monitoring emissions for the bike.");
		if ((emission<3.5))
		{
		System.out.println("Emissions levels are below the permissile level: "+get_m());	
		}
		else
		{
			Em_standard=false;
			try{
			throws new HighEmissionAlertException("High Emission levels. Exceeds permissible level for "+get_name());
			}
			catch(HighEmissionAlertException e){
			System.out.println(e.printStackTrace());
			}
		}

    	}
	
	boolean emission_Auth();
	{
		if (Em_standard=="false") 
		{
            		System.out.println("Alert: The vehicle does not meet required emission standards!");
            	}
       
	 	else 
		{
            		System.out.println("Vehicle emission data recorded successfully.");
        	}
    	}
    
    	public void record_Em() 
	{
        	System.out.println("Recording emission data for the bike.");
    	}

    	public void assess_PoLev() 
	{
        	System.out.println("Assessing pollution levels for the bike.");
	}

    	
	public boolean device_Func() 
	{
		private PollutionControlDevice catalyticConverter = new CatalyticConverter();
        	return catalyticConverter.isFunctioning()
			
   	}

			
   }
    
public class Truck implements EmissionMonitoring 
{

	private String name;
	private double emissions;
	boolean Em_standard;
	public Truck()
	{
		this.name="Truck";
		emissions=0.0;
	}
	public set_em(double emissions)
	{
		this.emissions = emissions;
	}
    
    	public void monitor_Em() 
	{
        	System.out.println("Monitoring emissions for the truck.");
		if ((emission<7.9))
		{
		System.out.println("Emissions levels are below the permissile level: "+get_m());	
		}
		else
		{
			Em_standard=false;
			try{
			throws new HighEmissionAlertException("High Emission levels. Exceeds permissible level for "+get_name());
			}
			catch(HighEmissionAlertException e){
			System.out.println(e.printStackTrace());
			}
		}

    	}

    	public void record_Em() 
	{
        	System.out.println("Recording emission data for the truck.");
    	}

    	public void assess_PoLev() 
	{
        	System.out.println("Assessing pollution levels for the truck.");
    	}

	public boolean device_Func() 
	{
		private PollutionControlDevice catalyticConverter = new CatalyticConverter();
    		private PollutionControlDevice particulateFilter = new ParticulateFilter();
        	return catalyticConverter.isFunctioning() && particulateFilter.isFunctioning();
   	}
			
}

public class CatalyticConverter implements EmissionMonitoring 
{    
    	public boolean device_check() 
	{	
		int a=Math.round(Math.random())
		if(a==1)
		{
        	return true;
		}
		else
		{
			return false;
			try
			{
				throws new PollutionControlFailiureException("Catalytic Converter failed to function! Check device."+get_name());
			}
			catch(HighEmissionAlertException e)
			{
				System.out.println(e.printStackTrace());
			}
		}
    	}
}


public class ParticulateFilter implements EmissionMnitoring
{
    	public boolean device_check() 
	{
		int b=Math.round(Math.random())
		if(b==1)
		{
        		return true;
		}
		else
		{ 
			return false;
			try
			{
				throws new PollutionControlFailiureException("Particulate Filter failed to function! Check device.");
			}
			catch(HighEmissionAlertException e)
			{
				System.out.println(e.printStackTrace());
			}
    		}
	}
}


public class AirQuality
{
    	private double co_Lev;
    	private double no_Lev;
    	private double pm_Lev;

    	public AirQuality(double co_Lev, double no_Lev, double pm_Lev) 
	{
        	this.co_Lev = co_Lev;
        	this.no_Lev = no_Lev;
        	this.pm_Lev = pm_Lev;
    	}

    	public double getco_Lev() 
	{
        	return co_Lev;
    	}

    	public double getno_Lev() 
	{
        	return no_Lev;
    	}

    	public double getpm_Lev() 
	{
        	return pm_Lev;
    	}

    	public void displayAirQuality() 
	{
        	System.out.println("Air Quality Information:");
        	System.out.println("Carbon Monoxide Level: " + co_Lev);
        	System.out.println("Nitrogen Oxides Level: " + no_Lev);
        	System.out.println("Particulate Matter Level: " + pm_Lev);
    	}

    
}




public class Main_Vehicle 
{
	public static void main(String[] args) 
	{
		Car car=new Car();
		Bike bike=new Bike();
		Truck tru=new Truck();
		AirQuality aq=new AirQuality();
        	Scanner in = new Scanner(System.in);
		int n;
        	while (n>0) 
	{
        	System.out.println("Vehicle Emission Monitoring System");
            	System.out.println("1. Input Vehicle Emission Data");
            	System.out.println("2. View Pollution Levels");
            	System.out.println("3. View Emission Alerts");
            	System.out.println("4. View Pollution Control Device Malfunctions");
            	System.out.println("5. Log Historical Emission Data");
            	System.out.println("6. Analyze Trends in Pollution Levels");
            	System.out.println("0. Exit");

            	System.out.print("Enter your choice: ");
            	int choice = in.nextInt();

            	switch (choice) 
		{
                case 1:
                    VehicleEmissionData()
                    break;
                case 2:
                    viewPollutionLevels();
                    break;
                case 3:
                    viewEmissionAlerts();
                    break;
                case 4:
                    viewPollutionControlMalfunctions();
                    break;
                case 5:
                    logHistoricalEmissionData();
                    break;
                case 6:
                    analyzePollutionTrends();
                    break;
                case 0:
                    System.out.println("Exiting the system. Goodbye!");
                    n=0;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

     	public static void VehicleEmissionData() 
	{
        System.out.print("Enter vehicle type (car/truck/bike): ");
        String vehicleType = in.next().toLowerCase();
	
	    if(vehicleType=="car")
	    {
		    System.out.println("Enter Car emission");
		    double em=in.nextDouble();
		    Car car=new Car(em);
    	    car.record_Em();
	    }
	    else
	    if(vehicleType=="bike")
	    {
		    System.out.println("Enter Bike emission");
		    double em=in.nextDouble();
		    bike.set_em(em);
		    bike.record_Em();
		}
	    else
	    if(vehicleType=="truck")
	    {
		    System.out.println("Enter Truck emission");
		    double em=in.nextDouble();
		    truck.set_em(em)
		    truck.record_Em();
	    }

        System.out.print("Enter carbon monoxide level: ");
        double coLev = in.nextDouble();

        System.out.print("Enter nitrogen oxides level: ");
        double noLev = in.nextDouble();

        System.out.print("Enter particulate matter level: ");
        double pmLev = scanner.nextDouble();
        AirQuality aq1= new AirQuality(coLev,noLev,pmLev);

    }

    private static void viewEmissionAlerts() 
    {
        System.out.println("High Emission Alert");
        System.out.print("Enter vehicle type (car/truck/bike): ");
        String vehicleType = scanner.next().toLowerCase();
	
	    if(vehicleType=="car")
	    {
		    car.monitor_Em();
		    car.emission_Auth();
	    }
	    else
	    if(vehicleType=="bike")
	    {
		    bike.monitor_Em();
		    bike.emission_Auth();
    	}
	    else
	    if(vehicleType=="truck")
	    {
		    truck.monitor_Em();
		    truck.emission_Auth();
    	}
    }

    private static void viewPollutionLevels() 
    {
        System.out.println("view Pollution Levels");
        System.out.print("Enter vehicle type (car/truck/bike): ");
        String vehicleType = scanner.next().toLowerCase();
	
	    if(vehicleType=="car")
	    {
		    car.assess_PoLev();
	    }
	    else
	    if(vehicleType=="bike")
	    {
		    bike.assess_PoLev();
    	}
	    else
	    if(vehicleType=="truck")
	    {
		    truck.assess_PoLev();
    	}
    }
    
    private void viewPollutionControlMalfunctions()
    {
      System.out.println("view Pollution Control Malfunction");
        System.out.print("Enter vehicle type (car/truck/bike): ");
        String vehicleType = scanner.next().toLowerCase();
	
	    if(vehicleType=="car")
	    {
		    car.device_Func();
	    }
	    else
	    if(vehicleType=="bike")
	    {
		    bike.device_Func();
    	}
	    else
	    if(vehicleType=="truck")
	    {
		    truck.device_Func();
    	}  
    }
    private static void logHistoricalEmissionData() 
    {
        System.out.println("Historical Emission Data");
            
            System.out.println("Vehicle Type: " + car.get_name()+"   Emission: "car.get_m());
            System.out.println();
            System.out.println("Vehicle Type: " + bike.get_name()+"   Emission: "bike.get_m());
            System.out.println();
            System.out.println("Vehicle Type: " + truck.get_name()+"   Emission: "truck.get_m());
            System.out.println();
    
    }

    private static void analyzePollutionTrends() 
    {
        System.out.println("Analyzing Trends in Pollution Levels");
        System.out.println("Carbon Monoxide levels: "aq1.getco_Lev());
        System.out.println("Nitrgen Dioxide levels: "aq1.getno_Lev());
        System.out.println("Particulate Matter levels: "aq1.getpm_Lev());
        }
    }
}


    
