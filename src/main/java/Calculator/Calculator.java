package Calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {}
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
                    double inputNum1;
                    System.out.print("Enter number: ");
                    inputNum1 = sc.nextDouble();
				    double result = squareRoot(inputNum1);
                    System.out.println("Result: "+result);
				break;

			    case 2:
                    int inputNum2;
                    System.out.print("Enter Number: ");
                    inputNum2 = sc.nextInt();
                    System.out.println("Result: "+factorial(inputNum2));
				    break;
			    case 3:
                    double inputNum3;
                    System.out.print("Enter number: ");
                    inputNum3 = sc.nextDouble();
                    System.out.println("Result: "+naturalLog(inputNum3));
				    break;
			    case 4:
                    double baseNumber, powerNumber;
                    System.out.print("Enter base number: ");
                    baseNumber = sc.nextInt();

                    System.out.print("Enter power: ");
                    powerNumber = sc.nextInt();
				    double retVal = powerFunction(baseNumber, powerNumber);
                    System.out.println("Result: "+retVal);
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

    public static double squareRoot(double inputNum) {
        logger.info("Finding square root of "+inputNum+"\tResult: "+ Math.sqrt(inputNum));
        return Math.sqrt(inputNum);
    }

    public static double factorial(int inputNum) {
        if(inputNum < 0) {
            logger.info("Can't calculate factorial of negative number! "+inputNum);
            return Double.NaN;
        }
        double result = 1;
        for(int i=1; i<=inputNum; i++) {
            result = result*i;
        }
        logger.info("Calculating factorial value of "+inputNum+"\tResult: "+result);
        return result;
    }

    public static double naturalLog(double inputNum3) {
        if(inputNum3 == 0) {
            logger.info("Natural log of 0 is undefined!");
            return Double.NaN;
        }
        double result = Math.log(inputNum3);
        logger.info("Calculating the natural logarithm of " +inputNum3 + "\tResult: " + result);
        return result;
    }

    public static double powerFunction(double baseNumber, double powerNumber) {
        double result = Math.pow(baseNumber, powerNumber);
        logger.info("Calculating " + powerNumber + "th power of " + baseNumber + "\tResult: "+result);
        return result;
    }
}