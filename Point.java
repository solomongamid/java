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

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int X){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}

	public void move(int dx, int dy){
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	public static void main(String[] args) {

		Point p = new Point(10,15);
		System.out.println(p.x + " " +  p.y);
		Point Pa = new Point();
		System.out.println(Pa.x + " " +  Pa.y);

		p.setX(12);
		p.setY(18);
		System.out.println(p.x + " " +  p.y);

		Pa.move(10, 10);
		System.out.println(Pa.x + " " +  Pa.y);
	}

}