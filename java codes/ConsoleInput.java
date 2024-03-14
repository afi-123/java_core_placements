import java.io.*;

public class ConsoleInput

{

public static void main(String args[])


throws Exception {

System.out.println("enter the string");


String name = System.console().readLine();

System.out.println("your name is " + name);

System.out.println("enter the integer");

int a = Integer.parseInt(System.console().readLine());

System.out.println("Integer value is " + a);

float b = Float.valueOf(System.console().readLine()).floatValue();

System.out.println("Float value is " + b);
}
}
