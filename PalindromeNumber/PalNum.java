import java.util.Scanner;
/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * @author willjl22
 * @version 7.22.24
 */
public class PalNum
{
    /**
     * @param x the number being checked as a palindrome
     * @return true if it is an palindrome
     */
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        //value for the inversion
        int invert = 0;
        //value of the unmanipulated input value
        int org = x;
        while(x!=0){
            //increases inv by a decimal place and adds the last number of the input value
            invert = invert*10 + x%10;
            //divides the input value by 10 to erase the number that was just added to inv
            x= x/10;
        }
        if(org==invert){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if(isPalindrome(num)){
            System.out.println("This number is a palindrome");
        }else{
            System.out.println("This number is NOT a palindrome");
        }
    }
}