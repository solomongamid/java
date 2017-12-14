//un programme qui calcule x à la puissance n (x et n étant des entiers positifs).

import java.util.*;

public class Puissance{
	public static void main(String args[]){
		int p, n, i, resultat;
		Scanner clavier = new Scanner(System.in);

		System.out.println("Saisir d'un entier de référence : ");
		n = clavier.nextInt();
		System.out.println("Saisir la puissance : ");
		p = clavier.nextInt();

		i = 0;
		resultat = 1;
		while(i<p){
			resultat = resultat * n;
			i++;
		}

		System.out.println("\t"+n+" ( "+p+" ) = "+resultat);
	}
}