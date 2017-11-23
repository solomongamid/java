//Exemple : 3287€ = 6*500€ + 1*200€ + 0*100€ + 1*50€ + 3*10€ + 1*5€ + 2€.

import java.util.*;

public class DecomposeBillets{
	public static void main(String args[]){
		Scanner clavier = new Scanner(System.in);

		int somme, reste;
		int nbBillet500, nbBillet200, nbBillet100, nbBillet50, nbBillet10, nbBillet5, nbBillet2;

		// saisir le somme en Euro 
		System.out.println("saisir le somme en Euro : ");
		somme = clavier.nextInt();

		nbBillet500 = somme / 500;
		reste = somme % 500;
		nbBillet200 = reste / 200;
		reste = reste % 200;
		nbBillet100 = reste / 100;
		reste = reste % 100;
		nbBillet50 = reste /50;
		reste = reste % 50;
		nbBillet10 = reste / 10;
		reste = reste % 10;
		nbBillet5 = reste / 5;
		reste = reste % 5;
		nbBillet2 = reste / 2;
		reste = reste % 2;

		//Afficher la resultat
		System.out.println("La somme de " + somme + " est composée de : ");
		System.out.println("Billet de 500Euros, " + nbBillet500 + " Billet de 200Euros, " + nbBillet200 
			+ " Billet de 100Euros, " + nbBillet100 +  " Billet de 5Euros,0 " + nbBillet50 
			+ " Billet de 10Euros, " + nbBillet10 + " Billet de 5Euros, " + nbBillet5 
			+  " Billet de 2Euros, " + nbBillet2 + reste);
	}
}