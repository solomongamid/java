import java.util.*;
import java.lang.*;

public class FindLetter{
	public static void main(String[] args){
		String copierDeMoi = "copier cette chain jusqua" + "rencontrer la lettre 'n'.";
		StringBuffer copierVersMoi = new StringBuffer();
		int i = 0;
		char c = copierDeMoi.charAt(i);
		while(c != 'n'){
			//copierVersMoi.append(c);
			c = copierVersMoi.charAt(i++);
		}
		System.out.println(copierVersMoi);
	}
}