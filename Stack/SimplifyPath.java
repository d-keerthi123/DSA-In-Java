//Time Complexity  : O(n)
//Space Complexity : O(n) bcz split(), Stack, and StringBuilder all use extra memory

import java.util.Stack;

public class SimplifyPath {
    public static void simplifyPath(String path){
        Stack<String> s=new Stack<>();

        String[] parts=path.split("/");
        
        for(String part :parts){  // every value of parts , call it part
            if(part.equals("") || part.equals(".")){
                continue;
            }

            if(part.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                s.push(part);
            }
        }

        //simply path
        StringBuilder result=new StringBuilder();
        
        for(String dir: s){
            result.append("/").append(dir);
        }
        if(result.length() == 0){
            System.out.println("/");
        }
        else{
            System.out.println(result.toString());
        }
    }
    public static void main(String[] args) {
        simplifyPath("/a/./b");
        simplifyPath("/a/b/..");
        simplifyPath("/a/b/../c");
        simplifyPath("");
        simplifyPath("/a/..");

 }
}
