/* 
Medium 2 
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 
Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]
 
Constraints:
1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
*/

import java.util.*;
public class Majorityelement {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int min = n/3+1;
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    List<Integer> a1 = new ArrayList<>();
    HashMap<Integer,Integer> h1 = new HashMap<>();
    for(int i=0;i<n;i++){
        int value = h1.getOrDefault(arr[i], 0);
        h1.put(arr[i],value+1);
        if(h1.get(arr[i])==min){
            a1.add(arr[i]);
        }
        if(a1.size()==2)break;
    }
        System.out.print("The Majority Elements Are: ");
        System.out.println(a1);
    }}
