//Time Complexity O(n log n) bcz of sorting and loop
//Space Complexity O(n) arraylist 

import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        int amount=590;

        //sort in descending order
        Arrays.sort(coins,Comparator.reverseOrder()); // coins should be of Integer class object not int which is primitive datatype

        int countOfCoins=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];

                }
            }
        }
        System.out.println("Minimum no of coins : "+countOfCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println();
    }
}
