
import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int E = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.

            if( LX < TX ){
                if( LY < TY ){
                    System.out.println("NW");
                    TY--;
                }
                else if( LY > TY ){
                    System.out.println("SW");
                    TY++;
                }
                else{
                    System.out.println("W");
                }
                TX--;
            }
            else if( LX > TX ){
                if( LY < TY ){
                    System.out.println("NE");
                    TY--;
                }
                else if( LY > TY ){
                    System.out.println("SE");
                    TY++;
                }
                else{
                    System.out.println("E");
                    
                }
                TX++;
            }
            else{
                if( LY < TY ){
                    System.out.println("N");
                    TY--;
                }
                else if( LY > TY ){
                    System.out.println("S");
                    TY++;
                }
                else{
                    System.err.println("Thor reached the flash of power in time!");
                }
            }

        }
    }
}
