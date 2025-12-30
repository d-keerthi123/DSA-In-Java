//Time complexity O(n)
//Space complexity O(n)

import java.util.Stack;

public class StockSpan {
    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> s=new Stack<>();  // stores indices of stock array
        //first day always has span 1
        span[0]=1;
        s.push(0); // push index zero to the stack

        for(int i=1;i<stock.length;i++){
            int currPrice=stock[i];
            while( ! s.isEmpty() && currPrice > stock [s.peek()] ){ //Remove all previous smaller prices
                s.pop();
            }
            if(s.isEmpty()){ //If stack is empty → no higher price before , Span = all days from 0 to i
                span[i]=i+1;  
            }
            else{
                int prevHigh=s.peek();
                span[i]=i - prevHigh;
            }
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];

        stockSpan(stock,span);

        //print span
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }

    }

}

