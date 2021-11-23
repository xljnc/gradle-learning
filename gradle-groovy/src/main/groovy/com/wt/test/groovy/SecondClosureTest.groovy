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

//如果greeting在闭包之后定义，
//抛出Caught: groovy.lang.MissingPropertyException: No such property
//def greeting = "welcome"

clos.call("world")

def demo(clo){
    def greeting = "hello"
    clo.call("Shit");
}
demo(clos)

1.upto(10,{ param -> println("item: " + param)})

1.upto(10){ param -> println("item: " + param)}