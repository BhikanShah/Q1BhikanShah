import java.util.*;
import java.lang.*;
class positiveN 
{
	public static void main(String[] args) 
	{
		int i,n;
        Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:-");
		n=s.nextInt();
        for (i=0; i<=n; i++)
        {
               if (i%3==0)
			   System.out.println(i);
        }
	}
}
