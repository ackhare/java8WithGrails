package com.streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deshraj on 1/9/16.
 */
public class ParallelStreaming {

    public static void test(){

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<= 20000000;i++){
            list.add(i);
        }

        System.out.println("============ Starting Simple Stream ================");
        Long startTime = System.currentTimeMillis();

        Long totalCount = list.stream().filter((s) -> s%2 == 0)
                .map((i) -> i*2)
                .count();

        Long endTime = System.currentTimeMillis();
        System.out.println("======== Total Even no. = "+totalCount);
        System.out.println("====== Total Time in Seconds =  " + (endTime - startTime) / 1000);

        System.out.println("============ Starting Prallel Stream ================");
        startTime = System.currentTimeMillis();

        totalCount = list.parallelStream().filter((s) -> s%2 != 0)
                .map((i) -> i*2)
                .count();
        System.out.println("======== Total Odd no. = "+totalCount);

        endTime = System.currentTimeMillis();
        System.out.println("====== Total Time in Seconds = " + (endTime - startTime) / 1000);
    }

    public static void analyseThreads(){
        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }
}
