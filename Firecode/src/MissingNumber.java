public class MissingNumber {

        public static void main(String[] args) {
            int[] arr = {2,4,5,1,3,6,8,9,10};
            System.out.println(findMissingNumber(arr));
        }
        public static int findMissingNumber(int[] arr) {
            int temp;
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr.length; j++){
                    if(arr[i]<arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            for (Integer x: arr) {
                System.out.println(x);
            }
            for(int i=0; i<arr.length; i++){
                if((i+1)!=arr[i]){
                    return i+1;
                }
            }

            return 1;
        }



}
