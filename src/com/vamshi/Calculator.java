/*
 * @author KUSA VAMSHI
 */

/*
 * This is the program for calculator
 * To find addition,subtraction,division,multiplication.
 * Inputs for this program is two numbers and a operator(+,-,*,/). 
 */

package com.vamshi;
public class Calculator {
	double calculation(double first_number, double second_number, char operator) {
		double result;
try {
	    switch(operator)
	    {
	        case '+':result = first_number + second_number;
	                  break;
            case '-':result = first_number - second_number;
	                  break;
	        case '*':result = first_number * second_number;
	                  break;
	        case '/':result = first_number / second_number;
	                  break;
	        default: throw new RuntimeException();
	    }
	    return result;
	 }
catch(RuntimeException e)
{
	System.out.printf("Error! operator is not correct");
	return 1;
}
	}
}
