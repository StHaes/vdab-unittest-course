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
            String[]numberstring = s.split(",");
            int a=0;
            for (int i = 0; i < numberstring.length; i = i + 1) {
                a = a + Integer.parseInt(numberstring[i]);
            }
//            int a = Integer.parseInt(s.valueOf(s.charAt(i)));
//            int b = Integer.parseInt(s.valueOf(s.charAt(2)));
            return a;
        }
    }
}
