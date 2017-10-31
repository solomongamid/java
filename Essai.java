import java.util.Scanner;

public class Essai {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("entrer une valeur entière : ");
		int i = clavier.nextInt();
		System.out.println("le résultat du calcul est " + i*Math.PI);
	}
}