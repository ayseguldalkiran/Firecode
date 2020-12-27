import java.util.HashMap;
import java.util.function.IntToDoubleFunction;

public class NonRepeated {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("abcdcfa"));
    }
    public static Character firstNonRepeatedCharacter(String str) {
        //"abcdcfa"  -> 'a', 'b', 'c', 'd', 'c', 'f', 'a' ---> 'b'

        char[] charArray=str.toCharArray();
        HashMap<Character, Integer> map =new HashMap<Character, Integer>();
        for(int i=0; i<charArray.length; i++){
            if(map.containsKey(charArray[i])){
                int val=map.get(charArray[i]);
                val++;
                map.replace(charArray[i],val );
            }

            if(!map.containsKey(charArray[i])){
                map.put(charArray[i],1);
            }

        }
        for(Character x: map.keySet()){
            if(map.get(x)==1){
                return x;
            }
        }


return 'a';
    }

}

