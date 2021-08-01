
public class Binary_Search {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if (target == nums[mid] ){
                return mid;
            }
            else if (target < nums[mid]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a = {-1,0,3,5,9,12};
        int re = search(a,5);
        System.out.println(re);
    }
}
