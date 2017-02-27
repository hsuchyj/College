
import java.util.Scanner;
public class college 

{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Cost of tuition?");
		double tui = s.nextDouble();
		System.out.println("Percentage increase? (enter in decimal form)");
		double per = s.nextDouble();
		
		double tot = tui;
		double sum = tui;
		
		for(int i = 1; i <= 4; i++)
		{
			if(i == 1)
			{
				//don't add percent increase on first year
				continue;
			}
			
			//assuming percent increase is compounding
			tot = tot + (tot * per);
			sum = sum + tot;
		}
		
		System.out.printf("The cost of 4 years is $%.2f", sum);
	}
	
	
}
