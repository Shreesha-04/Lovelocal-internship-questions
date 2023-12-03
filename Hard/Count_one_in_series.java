/* 
Hard 3
Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.

Example 1:
Input: n = 13
Output: 6

Example 2:
Input: n = 0
Output: 0
 
Constraints:
0 <= n <= 109

*/

public class Count_one_in_series {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int count =0;
    for(int i=0;i<=n;i++){
        int temp = i;
        while(temp>0){
            int m = temp%10;
            temp = temp/10;
            if(m==1){
                count++;
            }
        }
    }
    System.out.println("Total number of 1's in series");
    System.out.println(count);
    }
}