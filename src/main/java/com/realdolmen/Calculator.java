package com.realdolmen;
import static java.lang.Integer.parseInt;

/**
 * Created by jeansmits on 8/06/15.
 */
public class Calculator {
    public int add(String s) {
        if (s.isEmpty()){
            return 0;
        }else {

            int a=0;
            if (s.substring(0,2).startsWith("//") && s.substring(3,5).endsWith("\n")) {
                String h = String.valueOf(s.charAt(3));
                String [] numberstring = s.split(h);
                for (int i = 0; i < numberstring.length; i = i + 1) {
                    a = a + Integer.parseInt(numberstring[i]);
                }
            }else {
                String [] secondnumberstring = s.split(",");
                for (int i = 0; i < secondnumberstring.length; i = i + 1) {
                    a = a + Integer.parseInt(secondnumberstring[i]);
                }
            }
//            int a = Integer.parseInt(s.valueOf(s.charAt(i)));
//            int b = Integer.parseInt(s.valueOf(s.charAt(2)));
            return a;
        }
    }
}
