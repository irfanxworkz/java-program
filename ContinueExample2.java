//java program to illustrate the use of continue statement
//with label inside an inner loop to continue outer loop
public class ContinueExample2
{
	public static void main(String args[])
	{
	aa:
	   for(int i=1;i<=3;i++)
	   {
		bb:
		   for(int j=1;j<=3;j++)
		   {  
		   	if(i==2 && j==2)
			{
				continue aa;
			}
			System.out.println(i+" "+j);
		   }
   	   }
	}
}