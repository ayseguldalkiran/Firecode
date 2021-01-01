import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 2, 3, 4, 1, 2, 4, 3, 5}));
    }
    public static int singleNumber(int[] A) {
        HashMap<Integer, Integer> single = new HashMap<Integer,Integer>();
        for(int i=0; i<A.length; i++){
            if(single.containsKey(A[i])){
                int value=single.get(A[i]);
                value++;
                single.replace(A[i],value);
            }
            else{
                single.put(A[i],1);
            }
        }
        for(Integer x: single.keySet()){
            if(single.get(x)==1){
                return x;
            }
        }
        return 89;
    }

}
