package Array;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,5,5,5,6,7,8};
        System.out.println(findFirstOccurrence(arr,5));
    }
    static int findFirstOccurrence(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
