import java.util.Arrays;
/**
 * Write a function to find the longest common prefix string amongst an array 
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 *
 * @author Jasmine Williams
 * @version 7.23
 */
public class LongestCommonPrefix
{
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ret = "";
        String first = strs[0];
        //the solution cannot be longer than the first word
        for(int i = 0; i < first.length(); i++){
            //checks all the first, then second, then... letter of each word in array
            //to the first,second, then so letter of the first word
            for(String word : strs){
                if(Character.compare(first.charAt(i),word.charAt(i))!=0){
                return ret;
                }                
            }
            ret+=strs[0].charAt(i);
        } 
        return ret;
    }
    public static void main (String [] args){
        String[] test1 = {"flower", "flow", "flight"};
        String[] test2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(test1));
        System.out.println(longestCommonPrefix(test2));
    }
}