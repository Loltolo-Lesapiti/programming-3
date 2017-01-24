/**
 * This class presents a simple calculator that only 
 * implements two numbers. 
 * @ author Loltolo Petro Lesapiti and Gedeon Niyonkuru
 */ 
import java.util.*;

//Main method.
public class Main
{
 public static void main(String[]args){
  Scanner input=new Scanner(System.in);

  System.out.println("Please enter the first number:");
  double first= input.nextDouble();

  System.out.println("Please enter the second number:");
  double second=input.nextDouble();

  System.out.println("Please enter the expression type(like *,+,-, or /):");
  String expression=input.next();
  System.out.println("The two number are: "+first +" "+ second);
  if(expression.equalsIgnoreCase("+"))
   System.out.println(addition(first,second));
  if(expression.equalsIgnoreCase("-"))
   System.out.println(subtraction(first,second));
  if(expression.equalsIgnoreCase("*"))
   System.out.println(multiplication(first,second));
  if(expression.equalsIgnoreCase("/"))
   System.out.println(division(first,second));
 }

// A method to compute addition
 public static double addition(double first, double second){


  return(first+second); 
 }
 //A method to compute subtraction
 public static double subtraction(double first, double second){


  return(first-second); 
 }
 //A method to compute multiplication
 public static double multiplication(double first, double second){


  return(first*second); 
 }
 // A method to compute divison
 public static double division(double first, double second){

  if(first==0)
   return -1;
  else
   return(first/second); 
 }
}
