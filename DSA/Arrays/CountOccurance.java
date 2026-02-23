public class CountOccurrences {
    public static int count(int[] arr, int target){
        int count = 0;
        for(int num : arr){
            if(num == target){
                count++;
            }
        }
        return count;
    }
}
