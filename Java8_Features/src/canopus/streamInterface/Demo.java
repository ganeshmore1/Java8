package canopus.streamInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) { 
		
//		 
//	int n=3;
//	int fact=0;
//		for(int i=1;i<=n;i++)
//		{
//			fact=n*i;
//			System.out.println(fact);
	//	}
		
			 List<String> l = new ArrayList<String>(); 
			 l.add("ram"); 
			 l.add("Anand"); 
			 l.add("raghav"); 
			 l.add("raju");
			 l.add("amit");
			 System.out.println(l);
			 List<Integer>l1=new ArrayList<>();
			 l1.add(22);
			 l1.add(33);
			 l1.add(3);
			 l1.add(6);
////			 
////			 Stream< String> stream=l.stream();
////                   l. stream().forEach(e -> {
////		 
////		 System.out.println(e); 
////		 });
//			 Stream<Stringd>stream=l.stream();
//			 l.stream().forEach(e->{
//				 System.out.println(e);
//			 });
			 
			 //USING FILTER
			//RETURN PREDICATE BOLEAN VALUE
//			 
//			List<Integer>l2=l1.stream().filter(ee->ee>10s).collect(Collectors.toList());
//			System.out.println(l2);
		
			 
		System.out.println(l1);
//		Stream<String>ss=l.stream();
//	l.stream().filter(a->a.startsWith("r")).forEach(w->{System.out.println(w);
//		});
	//	Stream<Integer>ser=l1.stream();
//		l1.stream().filter(i->i>10).forEach(i->{
//			System.out.println(i);
	
		//l.stream().filter(i->i.contains(i)).forEach(e->{System.out.println(e);});
		
		
		//USING MAP 
		//RETURN FUNCTION VALUE
		//RETURN NUMBER ANY FORM
//		List<Integer>lll=l1.stream().map(i->i*i).collect(Collectors.toList());
//		System.out.println(lll);
		//USING FOR EACH METHOD
//		l1.stream().map(m->m*4).forEach(a->{System.out.println(a);
//			
//		});
//		}
		
		
		
		//BY USING METHOD REFERANCE FOR EACH
	//l1.stream().forEach(System.out::println);
	
	//SORTED METHOD
		//l1.stream().sorted().forEach(System.out::println);
//	
//		l.stream().sorted().forEach(a->{System.out.println(a);
//		});                                                                                                                          
//		
		//MAX METHOD
	Integer al=	l1.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("MAX--"+al);
	//Min Method
		
		
		Integer min=l1.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Minumum number="+min);
		Integer minimum=l1.stream().min((a,b)->a.compareTo(al)).get();
		System.out.println("min:-"+minimum);
		
		
		
		
		
		
		
		List<Integer>stream=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Start-"+stream);
		
		Integer stream2=l1.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("nin latest-"+stream2);
		
		Integer stream2=l1.stream().forEach(i->{System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

