package org.example;

import javax.swing.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Scanner scn = new Scanner(System.in);
        ContinueOperation();
    }

    public static void ContinueOperation() {
        String operator = "";
        double number1 = 0, number2 = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        //boolean finishOperation = operator.equals("f");

        System.out.println("Enter a number");
        number1 = input.nextDouble();
        input.nextLine();
        while (!operator.equals("f")) {
            operator = operatorValidation();
            if (!operator.equals("f")){
                System.out.println("Enter a number");
                number2 = input.nextDouble();
                input.nextLine();
            }

            number1 = operation(operator, number1, number2);
        }

        input.close();
    }

    public static String operatorValidation(){
        boolean validOperator = false;
        String operator = "";
        Scanner input = new Scanner(System.in);
        while(!validOperator) {
            System.out.println("Choose an operator: +, -, *, or / (Press 'f' to finish)");
            operator = input.nextLine();
            if((operator.equals("+")) || (operator.equals("-")) || (operator.equals("*")) || (operator.equals("/"))|| (operator.equals("f"))){
                validOperator = true;
            }
            else System.out.println("Operator must be: +, -, *, or / (Press f to finish) - try again");
        }
        return operator;
    }


    public static double operation(String op, double number1, double number2){
        double result = 0;
        switch (op) {

            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;


            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;


            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;


            case "/":
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            case "f":
                System.out.println("thank you for using Capot Calculator");
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        return result;

    }
}
