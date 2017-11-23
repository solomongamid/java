import java.util.*;
import Chronometre.java;

public class TestChronometre {

	public static void main (String[] args){
		Chronometre chronometre = new Chronometre();
		System.out.println(chronometre.toString());

		for(int i = 1; i <= 1200; i++){
			chronometre.increment();
		}
		System.out.println(chronometre.toString());

		for(int i = 1; i<= 1000; i++){
			chronometre.decrement();
		}
		System.out.println(chronometre.toString());
	}
}