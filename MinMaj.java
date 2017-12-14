//un programme qui remplace dans un tableau de caractères toutes les minuscules en majuscules
import java.util.*;
import java.lang.*;

public class MinMaj{
	public static void main(String args[]){
		int i, n;
		char valMin = 'a';
		char valMaj = 'z';
		Character c = new Character(' ');
		StringBuffer buffer;
		String tab;
		Scanner clavier = new Scanner(System.in);

		System.out.println("Saisie d'une chaîne de caractères : ");
		tab = new String(clavier.next());
		System.out.println("Avant le tratement le chaîne is : "+ tab);

		i = 0;
		n = tab.length();
		while(i<n){
			//il faut StringBuffer pour modifier le String
			buffer = new StringBuffer(tab);
				c = new Character(tab.charAt(i));
				buffer.setCharAt(i, c.toUpperCase(tab.charAt(i)));
				tab = buffer.toString();
			i++;
		}

		System.out.println("Le chaîne aprés la treatment : "+tab);
	}
}