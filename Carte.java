import java.util.*;

public class Carte{


	public static void main(String[] args){
	    char board[][] = new char [20][20];
        char personnage = 'X';
        char herbe = ' ';
        char rocher = '1';
        char rod = '2';

        for(int x = 0; x < 20; x++) {
            for(int y = 0; y < 20; y++) {
                
                board[x][y] = herbe;

                
            }

            
        }

        for (int a=0; a<5; a++){
        	int randomX = (int)(Math.random()*20);
        	int randomY = (int)(Math.random()*20);
        	board[randomX][randomY] = rocher;
        }

        for (int a=0; a<8; a++){
        	int randomX = (int)(Math.random()*20);
        	int randomY = (int)(Math.random()*20);
        	board[randomX][randomY] = rod;
        }

        for(int x = 0; x < 20; x++) {
            for(int y = 0; y < 20; y++) {
                
                

                // for(int a = 0; a < 20; a++) {    
                //     int chances = (int)(Math.random()*20)+1;      
                //     if (chances == 1) {    
                //         board[x][y] = 'A';
                //     }
                // }    
                // for(int b = 0; b < 10; b++) {    
                //     int chances = (int)(Math.random()*20)+1;      
                //     if (chances == 1) {    
                //         board[x][y] = 'B';
                //     }
                //     if(board[x][y] == 0 ) {
                //         board[x][y] = 'C';
                //     }     
                // }        
                System.out.print(board[x][y]);
            }

            System.out.println();
        }
    }
}