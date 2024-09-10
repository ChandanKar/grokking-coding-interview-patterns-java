package org.chandan.twopointers;

import java.util.Arrays;
import java.util.List;

public class PallindromeMain {

    public static void main(String[] args) {

        List<String> texts = Arrays.asList(
                "kaYak", "hello", "RaCEACAR", "A", "ABCDABCD"
        );

        texts.forEach(t -> {
            System.out.println(t + "---"+ Pallindrome.validateString(t));
        });
    }
}
