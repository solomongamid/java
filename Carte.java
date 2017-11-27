
import java.util.*;
public class Carte {

    public static void main(String[] args) {
        char board[][] = new char [20][20];
        char perssonage = 'X';
        char herbe = '0';
        char rocher = '1';
        for(int x = 0; x < 20; x++) {
            for(int y = 0; y < 20; y++) {

                if(x==0 && y==0){
                    board[x][y] = 'X';
                }
                
                for(int a = 0; a < 20; a++) {    
                    int chances = (int)(Math.random()*20)+1;      
                    if (chances == 1) {    
                        board[x][y] = 'A';
                    }
                }    
                for(int b = 0; b < 10; b++) {    
                    int chances = (int)(Math.random()*20)+5;      
                    if (chances == 1) {    
                        board[x][y] = 'B';
                    }     
                }
                for(int c = 0; c < 10; c++) {    
                    int chances = (int)(Math.random()*20)+5;      
                    if (chances == 1) {    
                        board[x][y] = 'y';
                    }     
                }        
                System.out.print(board[x][y]+"  ");
            }

            System.out.println();
        }

    }

}