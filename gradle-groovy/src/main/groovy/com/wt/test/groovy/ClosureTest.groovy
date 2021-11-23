package com.wt.test.groovy

/**
 *
 *
 * @author 一贫
 * @date 2021/11/23
 */
def clos = {
    println("hello world")
}
clos.call();

clos = { param ->
    println("hello ${param}")
}
clos.call("test")

def greeting = "hello"
clos.call(greeting)

clos = { param ->
    println("${greeting} ${param}")
}
clos.call("world")

greeting = "welcome"
clos.call("world")