import java.util.*;
class While_code
{
	public static void main(String args[])
	{
	   Scanner input=new Scanner(System.in);
	   int year;
	   do
	   {
		   System.out.print("Enter a year or zero to quit");
	       year=input.nextInt();
	      if((year%4==0) && (year % 100 != 0)|| (year%400==0))
	      {
	         System.out.printf("%d is a leap year \n",year);
	      }
		  else
		  {
		      System.out.printf("%d is not a leap year \n",year);
		  }
		  System.out.print("Enter Another year or zero to quit:");
		  year=input.nextInt();
	   }while(year != 0);
	System.out.println("Finished");
	}
	

}