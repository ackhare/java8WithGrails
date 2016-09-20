package com.streaming;

import java.util.List;
import java.util.Optional;

/**
 * Created by deshraj on 1/9/16.
 */
public class Streaming {

    public static void operation2(){
        List<String> memberNames = AppUtil.getList();
        memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void operation3(){
        List<String> memberNames = AppUtil.getList();
        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void operation4(){
        List<String> memberNames = AppUtil.getList();
        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);
    }

    public static void operation5(){
        List<String> memberNames = AppUtil.getList();
        long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();

        System.out.println(totalMatched);
    }

    public static void operation6(){
        List<String> memberNames = AppUtil.getList();
        Optional<String> reduced = memberNames.stream()
                .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
    }


    public static void operation7(){
        List<String> memberNames = AppUtil.getList();
        String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("L"))
                .findFirst().get();

        System.out.println(firstMatchedName);
    }
}
