import java.util.*;
import java.lang.*;

public class Calculette {
	// Membre ( s ) d’instance
	private double res;  // Result definition  


	// Membre ( s ) de classe


	// Constructeur ( s )
	public Calculette(){
		this.res =  0;
	} 

	// Opérations
	public void plus(double x, double y){
		this.res = x + y ;
	}
	public void moins(double x, double y){
		this.res = x - y ;
	}
	public void fois(double x, double y){
		this.res = x * y ;
	}
	public void div(double x, double y){
		if(y != 0){
			this.res = x / y ;
		} else {
			this.res = 0;
		}
	}
	// Affichage générique

	public String toString() {
		return "Le résultat est : " + this.res;
	}


	public static void main(String[] args){
		Calculette TI82 = new Calculette();
		double v1, v2; 
		char op;

		// Saisie des opérandes et de l’opération
		Scanner sc = new Scanner(System.in).useLocale(Locale.US); // use EN keyboard
		System.out.println("Saisir le calcul à faire avec des espaces : ");
		v1 = sc.nextDouble();  // read what user entered and store it in v1
		op = sc.next(".").charAt(0);  // read what user entered and store it in op
		v2 = sc.nextDouble();  // read what user entered and store it in v2

		// Exécution de l'opération demandée
		switch ( op ) {
			case '+' : 
				TI82.plus(v1,v2);
				break ;
			case '−' : 
				TI82.moins(v1,v2);
				break ;
			case '∗' : 
				TI82.fois(v1,v2);
				break ;
			case '/' : 
				TI82.div(v1,v2);
				break ;
			default : 
				System.out.println("L'opération n'est pas valide");
				break ;
		}
	// Affichage du résultat de la dernière opération
		System.out.println ( TI82 ) ;
	}
}