
import java.util.*;
public class Carte {

    public static void main(String[] args) {
        char board[][] = new char [20][20];
        char perssonage = 'X';
        char herbe = '0';
        char rocher = '1';
        for(int x = 0; x < 20; x++) {
            for(int y = 0; y < 20; y++) {
                
                for (int i = 1; i <= 20; i++) { //20 As
                     int randX = (int) (Math.random() * 20); //random number between 0-19
                     int randY = (int) (Math.random() * 20);
                     while (board[randX][randY] != null) { //find a free cell
                         randX = (int) (Math.random() * 20);
                         randY = (int) (Math.random() * 20);
                      }
                      board[randX][randY] = 'A'; //insert A
                  }
                board[0][0] = perssonage;
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
                System.out.print(board[x][y]+"  ");
            }

            System.out.println();
        }

    }

}