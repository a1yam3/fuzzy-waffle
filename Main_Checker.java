import java.util.Scanner;
class OddNumberException extends Exception 
{
    public OddNumberException(String msg) 
	{
        	super(msg);
    	}
}


 class CheckEvenNumber 
{
	void checkEvenNumber(int number) throws OddNumberException 
	{
        	if (number % 2 != 0) 
		{
            		throw new OddNumberException("Number " + number + " is odd. Even number expected.");
        	} 
		else 
		{
        		System.out.println("Number " + number + " is even.");
        	}
	}
}


 class Main_Checker
{
    public static void main(String[] args) 
    {	
	CheckEvenNumber obj=new CheckEvenNumber();
        
	try {
            
            obj.checkEvenNumber(4);

            
            obj.checkEvenNumber(7);
        } 
	
	catch (OddNumberException e) 
	    {
            System.out.println("Exception: " + e.msg());
        }
    }
}
