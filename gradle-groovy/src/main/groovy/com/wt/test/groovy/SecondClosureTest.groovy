package com.wt.test.groovy

/**
 *
 *
 * @author 一贫
 * @date 2021/11/23
 */
def greeting = "welcome"

clos = { param ->
    println("${greeting} ${param}")
}

clos.call("world")

def demo(clo){
    def greeting = "hello"
    clo.call("Shit");
}
demo(clos)
