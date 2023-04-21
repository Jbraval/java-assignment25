import java.util.*;
 
 
 
 
public class Test5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
 
 
       int low = 0, high = n - 1, pivot = -1;
       while (low <= high) {
           int mid = (low + high) / 2;
           if (a[mid] > a[n - 1]) {
               pivot = Math.max(pivot, mid);
               low = mid + 1;
           } else {
               high = mid - 1;
           }
       }
 
 
       System.out.println("Maximum element found at index " + pivot);
       System.out.println("Value of that element found " + a[pivot]);
   }
}