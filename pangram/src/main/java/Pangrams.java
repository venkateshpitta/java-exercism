
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author venkatesh
 */
public class Pangrams {
    public static boolean isPangram(String input) {
        boolean out = false;
        input = input.toLowerCase();
        for (Character c : Arrays.asList('a', 'b', 'c', 'd', 'e', 
                'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')) {
            out = input.contains(c.toString());
            if (!out) break;
        }
        return out;
    }
}
