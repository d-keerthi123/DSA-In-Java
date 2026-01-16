
import java.util.*;
public class Chocola {
public static void main(String[] args) {
    Integer costHor[]={1,4,2};
    Integer costVer[]={2,1,3,1,4};

    Arrays.sort(costHor,Collections.reverseOrder());
    Arrays.sort(costVer,Collections.reverseOrder());
    int h=0,v=0;
    int hp=1,vp=1; // horizontal and vertical pieces

    int cost=0;
    while(h <costHor.length && v < costVer.length){
        if(costHor[h]>= costVer[v]){ //horizonal cut
            cost+= (costHor[h] * vp);
            hp++;
            h++;
        }else{
            cost+= (costVer[v] * hp); //vertical cut 
            vp++;
            v++;
        }
    }
    //Remaining horizontal & vertical cuts
    while(h<costHor.length){
        cost+= (costHor[h] * vp);
        hp++;
        h++;
    }
    while(v<costVer.length ){
        cost+= (costVer[v] * hp); //vertical cut 
        vp++;
        v++;
    }

    System.out.println("Minimum cost :"+ cost );
}
}
