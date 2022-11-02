import java.util.*;
public class Lab11{ 
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    try {
	        System.out.println("enter integer value:");
	        int i=sc.nextInt();
	        System.out.println(i);
	        int a;
	        a=5/(i-5);
	        System.out.println(a+"value is");
	    } 
	    catch(InputMismatchException e){
	        System.out.println(e);
	    } 
	    catch(ArithmeticException e){
	        System.out.println(e);
	    }
	    finally {
	        System.out.println("execution completed");
	    }
	}}
