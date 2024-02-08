package canopus.streamInterface;

public class StreamAPI {

	
		public void m1()
		{
			System.out.println(" m1 - method");
		}
		public int m2()
		{
			System.out.println("m2-method");
			return 1;
			
		}
		public static void main(String[] args) {
			StreamAPI api=new StreamAPI();
			api.m1();
			api.m2();
		}
		
	}

