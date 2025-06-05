/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
/**
 *
 * @author willj22
 */
public class LongestCommonPrefixTest {

     public LongestCommonPrefixTest() {
    }
    public LongestCommonPrefix lcp;

    @Test
    public void Test1(){
        String[] test = {"ab","a"};
        String ans = "a";
        assertEquals(ans,lcp.longestCommonPrefix(test));
    }

    @Test
    public void Test2(){
        String[] test = {"flower", "flow", "flight"};
        String ans = "fl";
        assertEquals(ans,lcp.longestCommonPrefix(test));
    }

    @Test
    public void Test3(){
        String[] test = {"dog", "racecar", "car"};
        String ans = "";
        assertEquals(ans,lcp.longestCommonPrefix(test));
    }

}