import java.util.Arrays;

public class MERGE {
    public static void main(String[] args) {
        int [] arr = {1,6,9,3,5,2,0,1,2,23};
        System.out.println(Arrays.toString(merge(arr)));
    }
    public static int [] merge(int[] arr){
        if (arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;
        int [] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int [] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergesort(left,right);

    }
    public static int[] mergesort(int[] left, int[] right) {
        int [] ans = new int[left.length+right.length];
        int i =0,j=0,k=0;
        while (i<left.length && j<right.length) {
            if (left[i]<right[j]) {
                ans[k]=left[i];
                i++;
            }
            else{
                ans[k]= right[j];
                j++;
            }
            k++;
        }
        while (i<left.length) {
            ans[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length) {
            ans[k]= right[j];
            j++;
            k++;
        }
        return ans;


    }
    
}
