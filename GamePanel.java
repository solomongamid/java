import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;

public class GamePanel extends JPanel {

	//fields
	public static int width = 400;
	public static int height = 400;

	private Thread thread;

	//constructor
	public GamePanel(){
		super();
		setPreferredSize(new Dimenstion(width, height));
		setFocusable(true);
		requestFocus();
	}

	//functions
	public void addNotify(){
		super.addNotify();
		if(thread == null){
			thread = new Thread(this);
		}
	}

}