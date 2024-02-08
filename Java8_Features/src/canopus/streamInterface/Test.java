package canopus.streamInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test
 {
	 public static void main(String args[])
	 {
		 
		 ArrayList<Integer> l=new ArrayList<>();
		 l.add(12);
		 l.add(7);
		 l.add(88);
		 l.add(6);
		 
		 //		 for(int i=1;i<=100;i++)
//		 {
//			 l.add(i);
//			 
//		 }
//		 System.out.println(l);
//		 ArrayList< Integer> l2=new ArrayList<>();  
//		 for(Integer i:l)
//		 {
//			 if(i%2==0)
//			 {
//				 l2.add(i);
//				 System.out.println(l2);
//
//			 }
					 
		 //With Stream
//		 List<Integer>l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		 
		 
		 
		 		 
//		 List<Integer>l2=l.stream().filter(i->i%8==0).collect(Collectors.toList());
//		 System.out.println(l2);
//		 
		 
		 
		 
		 
		 List<Integer>l2=l.stream().filter(i->i%3==0).collect(Collectors.toList());
		 System.out.println(l2);
		 
		 
		 
		 
	 
//			 List<Integer>l2=l.stream().filter(i->i<15).collect(Collectors.toList());
//	    System.out.println(l2);
//		 
		    
	 }
	 }
	 
 




