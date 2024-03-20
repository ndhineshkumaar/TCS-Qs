public class findlargest {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        int[] arr1 = {8,10,5,7,9};

        System.out.println("Largest element"+" "+ smallest(arr));
        System.out.println("Largest element"+" "+ smallest(arr1));
    }

    public static int smallest(int[] arr){
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            int temp= arr[i];
            if(temp>large) large=temp;
        }
        return large;
    }
}
