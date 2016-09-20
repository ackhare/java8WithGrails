package com.streaming

import java.util.stream.Collectors
import java.util.stream.IntStream
import java.util.stream.Stream

class Stream1Controller {

//    Using Varargs
    def createStream1 = {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach{ p ->
            println(p)
        }
    }

    /*def createStream2 = {
        Stream stream = Stream.of(1, 2, 3, "hello", 5, 6, 7, 8, 9);
        stream.forEach{ p ->
            println(p)
        }
    }*/

//    Using array of elements
    def createStream3 = {
        Integer[] intArray = new Integer[5]
        for (int i=0;i<5;i++){
            intArray[i] = i*2
        }
        Stream<Integer> stream = Stream.of( intArray );
        stream.forEach{ p ->
            println("Element of stream"+p)
        }
    }

//  Using .stream method on a list
    def createStream4 = {
        List<Integer> list = [2,4,6,8,10]
        Stream<Integer> stream = list.stream();
        stream.forEach(){ p ->
            println("Element of stream = "+p)
        }
    }

//    Using generate method on Stream class
    def createStream5 = {
        Stream<Date> stream = Stream.generate(){
            return new Date()
        }

        stream.forEach(){ p ->
            println("==== value = "+p)
        };
    }


//    Using chars
    def createStream6 = {
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(){ p ->
            println("==== value = "+p)
        };
    }

    //    Using string tokens
    def createStream7 = {
        Stream<String> stream = Stream.of("A-B-C".split("-"));
        stream.forEach(){ p ->
            println("==== value = "+p)
        };
    }




//    ===== Converting Streams to Collections(or rather collecting the elements in stream into a collection or array) ====


    def collectStream1 = {
        Stream<Integer> stream = [2,3,4,5,6].stream();
        List<Integer> evenNumbersList = stream.filter(){ i ->
            i%2 == 0
        }.collect(Collectors.toList());
        println(evenNumbersList);
    }




}
