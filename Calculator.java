import java.io.*;
import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter 2 Numbers");
	
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int c=num1+num2;
       System.out.println("Addition is "+c);
    }

}
 