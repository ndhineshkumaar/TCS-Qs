public class AverageInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1,2,1,1,5,1};

        System.out.println(AvgArray(arr));
        System.out.println(AvgArray(arr1));
    }

    public static double AvgArray(int[] arr){
        int i=0,j=arr.length-1;
        int sum=0;
        if(arr.length%2!=0){
            sum+=arr[j/2];
        }
        while(i<j){
            sum+=arr[i];
            sum+=arr[j];
            i++;
            j--;
        }
        return (double ) sum/arr.length;
    }
}
