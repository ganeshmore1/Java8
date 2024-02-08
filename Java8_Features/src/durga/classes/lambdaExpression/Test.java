package durga.classes.lambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test implements I  {
	
	 public static void main(String[] args) {
	 	

//	 	I i=(a,b)-> {
//	 	System.out.println(a+b);
//	 	return 7;
//	 	};
//	 	
//	 	i.m1(5,15);
//	 	
	 
//		 Runnable r=() ->{
//			 for(int i=1;i<=10;i++)
//			 {
//			 System.out.println("Runnable");
//			 }};
//	Thread t=new Thread(r);
//	t.start();
//		 for(int i=1;i<=10;i++)
//		 {
//			 System.out.println("Main Thread");
//		 }

//	 	
//		 List<Integer> l=new ArrayList<>();
//		 l.add(2);
//		 l.add(4);
//		 l.add(88);
//		 l.add(10);
//		 System.out.println(l);
   
		
	    I i=()->System.out.println("method Executed");
	     i.method();

	
		
	}

		
	}

	

