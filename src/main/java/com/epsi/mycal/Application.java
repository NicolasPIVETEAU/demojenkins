package com.epsi.mycal;

import java.util.Scanner;

public class Application {

   public static void main(String[] args) {

      System.out.println("Bienvenue dans la calculatrice !");
      Scanner scanner = new Scanner(System.in);

      System.out.println("\n Please enter two numbers");
      System.out.println("\n First numbers : ");
      int firstNumber = scanner.nextInt();
      System.out.print("\n Second number: ");
      int secondNumber = scanner.nextInt();
      System.out.println("\n Select between (*,/,+,-)\n");
      String operation = scanner.next();

      Calculator calculator = new Calculator();
      int result = 0;
      double resultdiv = 0;


      switch (operation){
         case "*":
            result = calculator.mul(firstNumber, secondNumber);
            break;
         case "/":
            resultdiv = calculator.div(firstNumber, secondNumber);
            break;
         case "+":
            result = calculator.add(firstNumber, secondNumber);
            break;
         case "-":
            result = calculator.sub(firstNumber, secondNumber);
            break;
         default :
            System.out.println("Please select a valid operator");
            break;
      }

      if(operation.equals("/")){
         System.out.println("Your result :" + resultdiv);
      }else{
         System.out.println("Your result :" + result);
      }


   }

}
