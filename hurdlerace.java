import java.util.*;
public class hurdlerace{
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();         }
          Arrays.sort(height);
        int sum=0;
             if(height[n-1] > k) {
                 sum=height[n-1]-k;
              System.out.print(sum); }
               else 
                   System.out.print("0");
 }
}
