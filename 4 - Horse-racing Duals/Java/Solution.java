
import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        int[] horses = new int[N];
        int d = Integer.MAX_VALUE;
        
        for( int i = 0 ; i < N ; i++ ) {
            horses[i] = in.nextInt();
        }
        
        Arrays.sort(horses);
        
        for( int i = 0 ; i < N-1 ; i++ ){
            int t = horses[i+1] - horses[i];
            if ( t < d ){
                d = t;
            }
        }
        
        System.out.println(d);
        
    }

}
