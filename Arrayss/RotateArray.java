public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k=2;
        int[] nums1 = {1,2,3,4,5,6,7};
        int k1=3;

        for(int i: Rotatenumsay(nums, k)){
            System.out.print(i+" ");
        }
        
        System.out.println();
        
        for(int i: Rotatenumsay(nums1, k1)){
            System.out.print(i+" ");
        }
    }

    public static int[] Rotatenumsay(int[] nums,int k){
        int i=0,j=k-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=k;
        j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=nums.length-1;
        while (i<j) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }
}
