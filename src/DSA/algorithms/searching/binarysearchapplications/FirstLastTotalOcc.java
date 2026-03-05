package DSA.algorithms.searching.binarysearchapplications;
public class FirstLastTotalOcc {

    public static int firstOcc(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == key) {
                ans = mid;
                e = mid - 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOcc(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == key) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static int totalOcc(int[] arr, int key) {
        int f = firstOcc(arr, key);
        int l = lastOcc(arr, key);

        if (f == -1) {
            return 0;
        }
        return l - f + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5,6,3,5};
        int key = 3;

        System.out.println("First Occurrence: " + firstOcc(arr, key));
        System.out.println("Last Occurrence: " + lastOcc(arr, key));
        System.out.println("Total Occurrences: " + totalOcc(arr, key));
    }
}