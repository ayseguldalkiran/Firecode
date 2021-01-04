import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        int[] numbers = {1,3,4,2,1,4,2};
        System.out.println(duplicate(numbers));
    }
    public static String duplicate(int[] numbers){
        //duplicate({1,3,4,2,1}) --> "[1]"
        //duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            if(map.containsKey(numbers[i])){
                int value = map.get(numbers[i]);
                value++;
                map.replace(numbers[i],value);
            }
            else if(!map.containsKey(numbers[i])){
                map.put(numbers[i],1);
            }
        }
        for(Integer x: map.keySet()){
            if(map.get(x)!=1){
                list.add(x);
            }

        }
        String str = list.toString();
        return str;


    }
}
