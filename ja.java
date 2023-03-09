
public class ja {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7,8,13,15,16,78};
        int target = 16;
        System.out.println(binaraysearch(arr, target));
    }
    static int binaraysearch(int[] arr, int target){
        int r = 0;
        int l = arr.length-1;
        while (r<=l) {
            int mid = r + (l-r)/2;
            if(arr[mid]>target){
                l = mid-1;
            }
            else if(arr[mid]<target){
                r = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
