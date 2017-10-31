import java.util.*;

public class Personne {
	public int Age;
	public String Nom;

	public Personne (String Nom, int Age ) {
		this.Nom = Nom ;
		this.Age = Age ;
	}

	public Personne (int Age ) {
		this.Age = Age ;
		this.Nom = " " ;
	}

	public Personne (String Nom ) {
		this.Nom = Nom ;
		this.Age = 0 ;
	}

	public Personne () {
		this.Nom = " " ;
		this.Age = 0 ;
	}

	public void setAge(int Age){
		this.Age = Age;
	}
	public void setNom(String Nom){
		this.Nom = Nom;
	}
	public int getAge(){
		return Age;
	}
	public String toString(){
		return ( "(*" + Nom + "," + Age + "*)" );
	}	
	public static void main(String[] args) {
		Personne a = new Personne ( " toto " , 34 ) ;
		Personne b = new Personne ( " tata " ) ;
		Personne c = new Personne ( ) ;
		b.setAge ( 56 ) ;
		c.setNom ( "titi" ) ; 
		c.setAge ( 12 ) ;
		System.out.println(a.getAge()) ; // d o i t a f f i c h e r 34
		System.out.println(a) ; // d o i t a f f i c h e r (∗ t o t o , 3 4 ∗)
	}

}