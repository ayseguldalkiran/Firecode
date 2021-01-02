import java.util.HashMap;

public class AllCharactersUnique {
    public static void main(String[] args) {
        System.out.println(areAllCharactersUnique(null));
    }
    public static boolean areAllCharactersUnique(String str){
        if(str==null){
            return true;
        }
        char[] chr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<chr.length; i++){

            if(map.containsKey(chr[i])){
                int value = map.get(chr[i]);
                value++;
                map.replace(chr[i], value);
            }
            else if(!map.containsKey(chr[i])){
               map.put(chr[i], 1);
            }
        }
        for(Character x: map.keySet()){
            if(map.get(x)!=1){
                return false;
            }

        }

return true;
    }
}
