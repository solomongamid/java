/*un programme qui remplace dans un tableau à deux dimensions le contenu de la première ligne
par celui de la dernière et vice-versa, le contenu de la deuxième ligne par celui de l’avant dernière et vice-versa, etc */

import java.util.*;

public class PermuteLigne{

	public static void main(String args[]){
		int i, j, iTmp, nbL, nbC;
		int tab[][], tmp[];
		Scanner clavier = new Scanner(System.in);

		System.out.println("Saisie le nombre ligne de tableau : ");
		nbL = clavier.nextInt();
		System.out.println("Saisie le nombre de colonne de tableau : ");
		nbC = clavier.nextInt();

		tab = new int[nbL][nbC];
		tmp = new int[nbC];

		System.out.println("Saise les elements : ");
		//i = 0;
		// while(i<nbL){
		// 	j = 0;
		// 	while(j<nbC){
		// 		System.out.println("[ "+i+" ] [ "+j+" ]");
		// 		tab[i][j] = clavier.nextInt();
		// 		j++;
		// 	}
		// 	i++;
		// }
		for( i=0; i<nbL; i++){
			for( j=0; j<nbC; j++){
				System.out.println("[ "+i+" ] [ "+j+" ]");
				tab[i][j] = clavier.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(tab));

		i=0;
		while(i<(nbL/2)){
			j=0;
			while(j< nbC){
				tmp[j] =tab[i][j];
				j++;
			}
			iTmp = ((nbL-1)-i);
			j=0;
			while(j<nbC){
				tab[i][j] = tab[iTmp][j];
				j++;
			}
			iTmp = ((nbL - 1) - i);
			j = 0;
			while(j<nbC){
				tab[iTmp][j] = tmp[j];
				j++;
			}	
			i++;
			System.out.println(Arrays.deepToString(tab));
		}
	}
}
