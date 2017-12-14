//un programme qui remplace dans un tableau d’entiers tous les nombres par leur valeur au carré

import java.util.*;

public class ValeurAuCarre{
	public static void main(String args[]){
		Scanner clavier = new Scanner(System.in);
		int i, n;
		int tab[];

		System.out.println("Saisie de nombre d'element du tableau : ");
		n = clavier.nextInt();
		tab = new int[n];

		System.out.println("Saisie d'element de tableau : ");
		i = 0;
		while(i<n){
			System.out.println("[ "+i+" ]");
			tab[i] = clavier.nextInt();
			i++;
		} 

		i = 0;
		while(i<n){
			tab[i] *= tab[i];
			i++;
		}
		System.out.println("");

		i = 0;
		while(i<n){
			System.out.println("[ "+i+" ] " +tab[i]);
			i++;
		}

		System.out.println("--------------");
		//seulement les nombres pairs soient remplacés par leur valeur au carré
		System.out.println("Saisie de nombre d'element du tableau : ");
		n = clavier.nextInt();
		tab = new int[n];

		System.out.println("Saisie d'element de tableau : ");
		i = 0;
		while(i<n){
			System.out.println("[ "+i+" ]");
			tab[i] = clavier.nextInt();
			i++;
		} 

		i = 0;
		while(i<n){
			if((tab[i]%2) == 0)
				tab[i] *= tab[i];
				i++;
		}
		System.out.println("");

		i = 0;
		while(i<n){
			System.out.println("[ "+i+" ] " +tab[i]);
			i++;
		}
		System.out.println("");
	}
}