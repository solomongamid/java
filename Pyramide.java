//un programme qui affiche une pyramide d’étoiles

import java.util.*;

public class Pyramide{

	public static void main(String args[]){
		Scanner clavier = new Scanner(System.in);
		int i, j, n;

		System.out.println("Saisie d'un entier de référence : ");
		n = clavier.nextInt();

		
		i = 1;
		while(i<=n){
			for(j=1; j<=(2*i-1); j++)
				System.out.print("*");
				System.out.println("");
				i++;
			}
			System.out.println("");
		
	}
}