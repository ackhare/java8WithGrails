package com.streaming

class StreamOperationsController {

//    ============================= Intermediate Operations ==========================
//    ===========Intermediate operations return the stream itself so you can chain multiple method calls in a row. =======
//   This is the list we are working on [""]

//    "Amitabh" , "Shekhar" , "Aman", "Rahul", "Shahrukh", "Salman", "Yana","Lokesh"



//    Filtering
    def op1 = {
        List<String> names = AppUtil.getList()
        names.stream().filter(){ name ->
            name.startsWith("A")
        }.forEach(){ element ->
            println("====== elements = "+element)
        }
        render "successfull"
    }


//    Mapping
    def op2 = {
        Streaming.operation2()
        render "Successfull"
    }

//    Sorted

    def op3 = {
        Streaming.operation3()
        render 'successful'
    }


//    ============================= Terminal Operations =============================

//    Matching

    def op4 = {
        Streaming.operation4()
        render 'successful'
    }

//    Counting
    def op5 = {
        Streaming.operation5()
        render "Sucessful"
    }

//    Reduction
    def op6 = {
        Streaming.operation6()
        render "Sucessful"
    }

//    Finding
    def op7 = {
        Streaming.operation7()
        render "success"
    }
}
