import java.util.*;

public class Rationnel {
	public int num, den;

	public Rationnel(int num, int den){
		this.num = num;
		this.den = den;
	}

	public Rationnel(int num){
		this.num = num;
		this.den = 1;
	}	

	public Rationnel(){
		this.num = 1;
		this.den = 1;
	}

	public void setNumerateur(int num){
		this.num = num;
	}

	public void setDenominateur(int den){
		this.den = den;
	}

	public int getNumerateur(){
		return num;
	}

	public int getDenominateur(){
		return den;
	}

	public Rationnel plus(Rationnel b){
		return new Rationnel(num*b.den+den*b.num, den*b.den);
	}
	public Rationnel fois(Rationnel b){
		return new Rationnel(num*b.num, den*b.den);
	}
	
	public String toString(){
		return ( "[" + num + "/" + den + "]" );
	}

	public static void main(String[] args){
		Rationnel a = new Rationnel(1,2);
		Rationnel b = new Rationnel(2);
		Rationnel c = new Rationnel();

		c.setNumerateur(1);
		c.setDenominateur(5);
		System.out.println(a.getNumerateur());   // doit afficher 1
		System.out.println(c);   // doit afficher 1/5
		System.out.println(a);   // doit afficher 1/2
		System.out.println(a.getDenominateur());  // doit afficher 2
		c = a.fois(b) ;
		System.out.println(c);    //  doit afficher 1/1
		c = a.plus(b);
		System.out.println(c);    //  doit afficher 5/2
	}
}