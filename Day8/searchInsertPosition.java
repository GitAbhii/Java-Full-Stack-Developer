public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int position = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                position = i;
                break;
            }
        }

        System.out.println("Insert Position: " + position);
    }
}
