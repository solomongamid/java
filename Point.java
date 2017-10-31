public class Point {
	public int x;
	public int y;
	// un constructeur
	public Point (){

		this.x = 0 ;
		this.y = 0 ;
	}
	public Point ( int x , int y ) {
		this.x = x ;
		this.y = y ;
	}

	public static void main(String[] args) {
		
		// System.out.println(x);
		// x = 15;
		// System.out.println(x);
		Point p = new Point(10,15);
		System.out.println(p.x + " " +  p.y);
		Point Pa = new Point();
		System.out.println(Pa.x);
	}

}