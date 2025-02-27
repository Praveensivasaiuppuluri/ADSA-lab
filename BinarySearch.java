
import java.util.Scanner;

class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter " + n + " numbers : ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter element to search : ");
        int key = sc.nextInt();
        int x = binarysearch(A, key);
        if (x != -1) {
            System.out.println("Element found at location " + x); 
        }else {
            System.out.println("Element not found");
        }
    }

    public static int binarysearch(int[] A, int key) {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == key) {
                return mid;
            }
            if (A[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
