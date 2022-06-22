package assign1;

import java.util.Scanner;

public class test {
  public static void main(String[]args) {
	  
	  Scanner myobj = new Scanner(System.in);
	  System.out.println("enter your id:\n");
	  int id = myobj.nextInt();
	  
	  System.out.println("Enter your name:\n");
	   String name = myobj.next();
	   
	   System.out.println("Enter your age:\n");
	   int age = myobj.nextInt();
	   
	   System.out.println("now enter six(6) number from 1-9 \n");
	   System.out.println("enter number 1:\n");
	   int one = myobj.nextInt();
	   System.out.println("enter second number:\n");
	   int two = myobj.nextInt();
	   System.out.println("enter third number:\n");
	   int three = myobj.nextInt();
	   System.out.println("enter forth number:\n");
	   int four = myobj.nextInt();
	   System.out.println("enter fifth number:\n");
	   int five = myobj.nextInt();
	   System.out.println("enter sixth number:\n");
	   int six = myobj.nextInt();
	  
	  lottery.addlottery(id,name,age,one,two,three,four,five,six);
	  
	  
  }
}
