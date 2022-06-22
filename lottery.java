package assign1;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class lottery {
    static ArrayList<customer> customers=  new ArrayList<customer>();
   public static void addlottery(int id, String name, int age, int num1, int num2, int num3, int num4, int num5, int num6) {
	   customer customer = new customer(id, name, age, num1, num2, num3, num4, num5, num6);
	   
	   customers.add(customer);
	   System.out.println(customers);
	   System.out.println(customer);
   
   
   
	   ArrayList<Integer> one = new ArrayList<Integer>();
      one.add(num1);
      one.add(num2);
      one.add(num3);
      one.add(num4);
      one.add(num5);
      one.add(num6);
	   System.out.println(one);
	   
	   
	   ArrayList<Integer> arr2= new ArrayList<>();
	   for(int i=0;i<=5;i++){
	       int y = (int)(Math.random()*((9-1)+1))+1;
	      
	       arr2.add(i, y);
	      
	  
   }  
	   System.out.println(arr2);
   
	   
	   

		     
		     one.retainAll(arr2);
		     System.out.println(one);

		        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(one);
		         
		        ArrayList<Integer> newlist = new ArrayList<>(hashSet);
		         
		        System.out.println(newlist);
		      
		        
		        if(newlist.size()==4) {
		        	System.out.println(name+" constritaion you won 10000");
		        	
		        }
		        else if(newlist.size()==5) {
		        	System.out.println(name+" constritaion you won 100000");
		        	
		        }
		        else if(newlist.size()==6) {
		        	System.out.println(name+" constritaion you won 1000000");
		        	
		        }
		        else {
		        	
				        	System.out.println(name+" soo sorry you did not get nothing");
				        	
				        
		        }
		   

		        
   }

   
   }
