public class ReverseAGivenArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr1 = {10,20,30,40};

        for(int i: reverse(arr)){
            System.out.print(i+" ");
        }

        System.out.println();

        for(int i: reverse(arr1)){
            System.out.print(i+" ");
        }
    }

    public static int[] reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        

        return arr;
    }
}
