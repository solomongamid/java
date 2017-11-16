public class Somme{
	public static void main(String[] args){
		int somme = 0;
		for(int value=1; value<=10; value++){
			somme += value;
			System.out.println(value);
		}

		System.out.println(somme);
	}
}