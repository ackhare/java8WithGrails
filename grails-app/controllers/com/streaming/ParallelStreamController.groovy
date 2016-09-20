package com.streaming

class ParallelStreamController {

    def compare = {
        ParallelStreaming.test()
        render "Operation completed"
    }

    def analysThreads = {
        ParallelStreaming.analyseThreads()
        render "Operation completed"
    }
}
