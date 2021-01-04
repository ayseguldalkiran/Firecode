import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("abcabe", "hklhko"));
    }
    public static boolean isIsomorphic(String input1, String input2) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
            for(int i=0; i<input1.length(); i++){
                char karakter=input1.charAt(i);
                char kar2=input2.charAt(i);
                if(!map.containsKey(karakter)){
                    map.put(karakter,kar2);
                }
                else if(map.containsKey(karakter)){
                    if(map.get(karakter)!=kar2){
                        return false;
                    }
                }
                if(!map2.containsKey(kar2)){
                    map2.put(kar2, karakter);
                }
                else if(map2.containsKey(kar2)){
                    if(map2.get(kar2)!=karakter){
                        return false;
                    }
                }

            }

            return true;


    }
}
