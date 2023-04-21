import java.util.*;
 
 
 
 
public class Test1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(), target = sc.nextInt();
 
 
       int a[] = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
 
 
       int low = 0, high = n - 1;
 
 
       while (low <= high) {
           int mid = low + (high - low) / 2;
           if (a[mid] == target) {
               System.out.println("Index found at " + mid);
               return;
           }
           if (a[mid] > target)
               high = mid - 1;
           else
               low = mid + 1;
       }
 
 
 
 
       System.out.println("-1");
 
 
 
 
   }
}