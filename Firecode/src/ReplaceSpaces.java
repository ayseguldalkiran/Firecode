public class ReplaceSpaces {

        public static String replace(String a, String b) {
            //This is a test
            char[] charArray = a.toCharArray();

            StringBuilder str = new StringBuilder();

            for (int i = 0; i < charArray.length; i++) {
                if(charArray[i]!=' '){
                    str.append(charArray[i]);
                }
                else if(charArray[i] == ' '){
                    str.append(b);
                }
            }
            return str.toString();
        }

        public static void main(String[] args) {
            System.out.println(replace("this is a test", "abc"));
        }
    }


