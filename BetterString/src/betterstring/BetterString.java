/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterstring;

/**
 *
 * @author elkamash
 */
 import java.util.function.BiPredicate;
public class BetterString {

  


  public static String BetterString(String s1, String s2, BiPredicate<String,String> criteria) {
        if (criteria.test(s1, s2))
            return s1;
        else
            return s2;
    }

    public static void main(String[] args) throws Exception {
        
        System.out.println(BetterString("testaaa", "test2", (s1, s2) -> s1.length() > s2.length()));
    }
}
   

