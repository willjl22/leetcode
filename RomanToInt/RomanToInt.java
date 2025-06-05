import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Given a roman numeral, convert it to an integer.
 * 
 * @author willjl22
 * @version 7.22 
 */
public class RomanToInt
{
    public static int romanToInt(String s) {
        int intValue = 0;
        Map<Character,Integer> numMap = new HashMap();
        // stores the roman numeral value to its corresponding int value
        numMap.put('I',1);
        numMap.put('V',5);
        numMap.put('X',10);
        numMap.put('L',50);
        numMap.put('C',100);
        numMap.put('D',500);
        numMap.put('M',1000);
        
        for (int i = 0; i < s.length()-1; i++){
            //checks to see if the numeral afterwards is greater
            if(numMap.get(s.charAt(i)) < numMap.get(s.charAt(i+1))){
                //subtracts the numeral from total
                intValue -= numMap.get(s.charAt(i));
            }else{
                intValue += numMap.get(s.charAt(i));
            }
        }

        return intValue + numMap.get(s.charAt(s.length()-1));
    }
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a roman numeral: ");
        String roman = scan.next();
        System.out.println("The integer equivalent is: "+romanToInt(roman));
    }
}
