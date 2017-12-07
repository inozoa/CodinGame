import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        double LON = Double.parseDouble(in.next().replace(",","."));
        double LAT = Double.parseDouble(in.next().replace(",","."));
        int N = in.nextInt();
        
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        Defib[] defibs = new Defib[N];
        double[] distances = new double[N];
        
        for (int i = 0; i < N; i++) {
            defibs[i] = new Defib(in.nextLine());
            distances[i] = distance( degToRad(LON) , degToRad(LAT) , degToRad(defibs[i].lon) , degToRad(defibs[i].lat) );
            defibs[i].distance = distances[i];
        }

        Arrays.sort(distances);

        int iResult = 0;
        for( int i = 0 ; i < N ; i++ ){
            if( defibs[i].distance == distances[0] ){
                iResult = i;
                break;
            }
        }

        System.out.println(defibs[iResult].name);
    }
    
    public static double degToRad(double deg){
        return deg * (Math.PI/180d); 
    }
    

    public static double distance( double aLon , double aLat , double bLon , double bLat ){
        double x = (bLon-aLon)*Math.cos((aLat+bLat)/2d);
        double y = bLat-aLat;
        return Math.sqrt( Math.pow(x,2d) + Math.pow(y,2d) )*6371d;
    }
    
}

class Defib{

    String id;
    String name;
    String address;
    String phone;
    double lon;
    double lat;
    double distance;
    
    public Defib(String data){
        String[] s = data.split(";");
        id = s[0];
        name = s[1];
        address = s[2];
        phone = s[3];
        lon = Double.parseDouble(s[4].replace(",","."));
        lat = Double.parseDouble(s[5].replace(",","."));
    }

}
