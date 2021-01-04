public class isPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowOfTwo(64));
    }
    public static boolean isPowOfTwo(int num) {

        int s=2;
            for(int i=1; i<num; i++){
                if(num==s){
                    return true;
                }
                s=2*s;

            }

return false;
    }
}
