import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may 
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 *
 * @author willjl22
 * @version 7.22
 */
public class TwoSum
{
    /**
     * Builds a HashMap associating the array value and its index. Before the
     * association is added to the map, the complement of that number is sought in
     * the HashMap in order to return the solution.
     * 
     * @param nums the array of numbers that we are searching through
     * @param target the desired number that we want the numbers to sum to 
     * @return the int array of numbers in the array that equal to the target
     */
    public static int[] twoSum(int[] nums, int target) {
        //instantiation of the HashMap
        Map<Integer,Integer> numberMap = new HashMap<>();
        //scans all the numbers in the array where i is also equal to their hash
        for(int i = 0; i<nums.length; i++){
            //stores the complement of the num in the array
            int comp = target - nums[i];
            //searches to see if the complement exists in the hashmap
            if(numberMap.containsKey(comp)){
                //returns the indices in the array of the two complements
                return new int[]{numberMap.get(comp), i};
            }
            //stores the num value and its index in the hashmap
            numberMap.put(nums[i],i);
            
        }
        throw new IllegalArgumentException("no sum found");
    }
    
    public static void main(String[] args){
        int[] array = new int[4];
        Scanner scan = new Scanner (System.in);
        System.out.println("Insert an array of numbers: "); //use nums 2,7,11,15
        for(int i =0; i < 4; i++){
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Insert the desired sum: "); //use num 9
        int desire = scan.nextInt();
        scan.close();
        int[] ans = twoSum(array, desire);
        System.out.println("The numbers that sum to the desired number are: "+ Arrays.toString(ans));
    }

}

