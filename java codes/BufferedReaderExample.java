import java.io.*;

public class BufferedReaderExample{

public static void main(String args[])

throws Exception{

InputStreamReader in = new InputStreamReader(System.in); BufferedReader br = new BufferedReader (in);

System.out.println("enter the string");

String str = br.readLine();

System.out.println("your string is " + str); System.out.println("enter an integer value");

int a = Integer.parseInt(br.readLine());

System.out.println("integer value is " + a);

System.out.println("enter the float value");

float b = Float.valueOf(br.readLine()).floatValue(); 
System.out.println("your float value is " + b);
}
}