public class FriendsPairing {
    public static int friendsPairing(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        int single = friendsPairing(n-1);
        int pairing= (n-1) * friendsPairing(n-2);
        int totalWays= single + pairing;
        return totalWays;

    }
    public static void main(String[] args) {
        int n;
        System.out.println(friendsPairing(4));
    }

}
