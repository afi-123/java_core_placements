import java.util.Scanner;

public class readinginput{

public static void main(String args[]) throws Exception

{

Scanner sc = new Scanner(System.in);

System.out.println("Enter an integer value");

int a = sc.nextInt();

System.out.println("Enter the float value");

float b = sc.nextFloat();

System.out.println("Enter the string value");

String c = sc.next();

System.out.println("the value of a is int" + a);

System.out.println("the value of b is float" + b); System.out.println("the value of c is string" + c);
}}
