import java.util.*;
import java.lang.*;
import java.security.SecureRandom;

public class JoueCarte{
	public static void main(String args[]){
		char[][] tab = new char[20][20];
		char personnage = 'X';
		char herbe = '0';
		char rocher = '1';
		char[] strs = { 'X','Y','Z' };

		for(int i =  0; i < strs.length; i++){
		     this.tab.add(strs[i]);  //something like this?
		}

		for(int i=0; i<20; i++){
			for(int j=0; j<20; j++){
				tab[0][0] = personnage;

				
				System.out.print(tab[i][j]+"  ");
			}
			System.out.println();
		} 

	}
}