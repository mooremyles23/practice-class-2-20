import java.util.Scanner;
public class calculator {
	
	public static void main (String[]args){
	
		Scanner input = new Scanner(System.in);	
		System.out.println("What method would you like to use");

		System.out.println("For addition enter 1");
		
		System.out.println("Subtraction enter 2 ");
		
		System.out.println("Multiplication enter 3");
		
		System.out.println("Division enter 4");
		
		int answer= input.nextInt();
		System.out.println("Please enter your numbers");
		int num1= input.nextInt();
		int num2= input.nextInt();
		
if (answer==1){
	System.out.println(addnumbers(num1,num2));
}

else
{
	System.out.println (subtractnumbers(num1,num2));
}

{
	System.out.println (multiplynumbers(num1,num2));
}	
	
{
	System.out.println (dividenumbers(num1,num2));}
}		
	
		
	
	public static int addnumbers (int num1,int num2){

		int sum= num1+num2;
		return sum;
					
	}
		
	public static int subtractnumbers (int num1,int num2){

		int sum= num1+num2;
		return sum;		
			
	}
	public static int multiplynumbers (int num1,int num2){

		int product= num1*num2;
		return product;
				
	}
	public static int dividenumbers (int num1,int num2){

		int quotient= num1/num2;
		return quotient;
		
	}
	
	
	}
