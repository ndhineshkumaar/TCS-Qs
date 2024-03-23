import java.util.Arrays;

public class RearrangeInIncDecorder {
    public static void main(String[] args) {
        int[] arr = {8, 7, 1, 6, 5, 9};
        int[] arr1 = {4,2,8,6,15,5,9,20};

        incrdec(arr);
        incrdec(arr1);
    }

    public static void incrdec(int[] arr){

        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1;i>=(n/2);i--){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}
