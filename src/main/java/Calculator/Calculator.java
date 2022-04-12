package Calculator;
import java.util.Scanner;
import java.lang.*;

class Calculator {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		    menu();
			choice = sc.nextInt();
			if(choice == 7) {
				System.out.println("Closing calculator...");
			}
			
			switch(choice) {
			    case 1:
				    squareRoot();
				break;
				
			    case 2:
				    factorial();
				    break;
			    case 3:
				    naturalLog();
				    break;
			    case 4:
				    powerFunction();
				    break;
	
			}
		}while(choice!=9);                                                                                                                                                                                                                                                                                                                                                                                                                                                             

	}
    static void menu() {
	    System.out.println("\n*******CALCULATOR*******\n");
	    System.out.println("Press 1 to find square root of a number");
	    System.out.println("Press 2 to find factorial of a number");
	    System.out.println("Press 3 to find the natural logarithm(base e) of a number");
        System.out.println("Press 4 to find the power of a number raised to another number");
	    System.out.println("Press 9 to exit");
	    System.out.print("Enter your choice: ");
    }

    static void squareRoot() {
        double inputNum;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		inputNum = sc.nextDouble();
		System.out.println("Result: "+Math.sqrt(inputNum));
    }
 
    static void factorial() {
        int inputNum;
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
      
        int result = 1;
        for(int i=1; i<=inputNum; i++) {
            result = result*i;
        }
    
        System.out.println("Result: "+result);
    }
  
    static void naturalLog() {
        double inputNum;
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextDouble();
    
        double result = Math.log(inputNum);
        System.out.println("Result: "+result);
    }
  
    static void powerFunction() {
        double baseNumber, powerNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        baseNumber = sc.nextInt();
    
        System.out.print("Enter power: ");
        powerNumber = sc.nextInt();
    
        double result = Math.pow(baseNumber, powerNumber);
        System.out.println("Result: "+result);
    }
}