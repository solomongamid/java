import java.util.*;

public class Hours{
	public static void main(String args[]){
		int h1,m1,s1;
		int h2,m2,s2;
		int h,m,s;

		Scanner clavier = new Scanner(System.in);
		// enter the first time
		System.out.println("enter the first time like 'HH/MM/SS' !");
		System.out.println("HH :");
		h1 = clavier.nextInt();
		System.out.println("MM :");
		m1 = clavier.nextInt();
		System.out.println("SS :");
		s1 = clavier.nextInt();
		System.out.println("The first time is:" + h1 +"/"+ m1 +"/"+ s1);
		//enter the second time 
		System.out.println("enter the first time like 'HH/MM/SS' !");
		System.out.println("HH :");
		h2 = clavier.nextInt();
		System.out.println("MM :");
		m2 = clavier.nextInt();
		System.out.println("SS :");
		s2 = clavier.nextInt();
		System.out.println("The second time is:" + h2 +"/"+ m2 +"/"+ s2);	
		
		//The sum of the two times
		h = h1 + h2;
		m = m1 + m2;
		s = s1 + s2;
		System.out.println("The sum of the two time is: " + h + "/" + m +"/"+ s);


	}
}