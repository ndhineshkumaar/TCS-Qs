public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        int[] arr1 = {8, 10, 5, 7, 9};

        System.out.println("Second Smallest " + Ssma(arr) + " " + "Second Largest " + Slar(arr));
        System.out.println("Second Smallest " + Ssma(arr1) + " " + "Second Largest " + Slar(arr1));
    }

    public static int Ssma(int[] arr) {
        int small = Integer.MAX_VALUE;
        int Ssmall = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (temp < small) {
                Ssmall = small;
                small = temp;
            } else if (temp < Ssmall && temp != small) {
                Ssmall = temp;
            }
        }
        return Ssmall;
    }

    public static int Slar(int[] arr) {
        int large = Integer.MIN_VALUE;
        int Slarg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (temp > large) {
                Slarg = large;
                large = temp;
            } else if (temp > Slarg && temp != large) {
                Slarg = temp;
            }
        }
        return Slarg;
    }
}
