public class Temp{
 
	public static void main(String args[])
	{
	double temp1=27.2;
	double temp2=20.0;
	double temp3=20.4;
	double temp4=21.5;
	double temp5=22.8;
	double temp6=20.7;
	double temp7=26.9;
	
	double sum=temp1+temp2+temp3+temp4+temp5+temp6+temp7;
	double average=sum/7;
	
	int nAbove=0;
	if(temp1>average){
		nAbove++;
	}
	 if(temp2>average){
	     nAbove++;
	   }
	   if(temp3>average)
	   {
	   nAbove++;
	   }
	   if(temp4>average){
	   nAbove++;
	   }
	   if(temp5>average){
	   nAbove++;
	   }
	   if(temp6>average){
	   nAbove++;
	   }
	   if(temp7>average)
	   {
	   nAbove++;
	   }
	   System.out.printf("average temperature for %d days: %.1fC\n",7,average);
	   System.out.printf("#days above average: %d\n",nAbove);
	   System.out.printf("#days at or below average: %d\n",7-nAbove);
	}
}