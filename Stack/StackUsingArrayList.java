import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            if(list.size()==0){
                return true;
            }
            return false;
        }

        //push- O(1)
        public static void push(int data){
            list.add(data);
        }
        //pop - O(1)
        public static int pop(){
            if(isEmpty()){  // is stack is empty
                return -1; 
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek- O(1)
        public static int peek(){
            if(isEmpty()){  // is stack is empty
                return -1; 
            }

            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }

}
