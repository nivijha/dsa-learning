package Strings;
import java.util.*;

public class ShortestPath {
    public static void getdisplacement(String path){
        int x=0, y=0;
        for(int i=0; i<path.length();i++){
            char d= path.charAt(i);
            if(d=='N' || d=='n'){
                y++;
            }
            else if(d=='S' || d=='s'){
                y--;
            }
            else if(d=='E' || d=='e'){
                x++;
            }
            else if(d=='W' || d=='w'){
                x--;
            }
            else{
                System.out.println("Wrong Direction");
            }

            int X2=x*x;
            int Y2=y*y;
            
            System.out.println("Shortest Path= "+(float)Math.sqrt(X2+Y2));
        }
    }
    public static void main(String[] args) {
        String path="WNEENESENN";
        getdisplacement(path);
    }
}
