package com.wt.test.groovy

import groovy.transform.Field

/**
 *
 *
 * @author 一贫
 * @date 2021/11/27
 */
def greeting() {
    println "Hello world"
}

def greeting(name) {
    println "Hello ${name}"
    name = name + " shit"
}

greeting()

def param = "Shit"
greeting(param)
println param


def add(left, right) {
    left = left + right
    return left;
}

def intLeft = 1;
add(intLeft, 1)
println intLeft


def echo(name) {
    println "echo ${name}"
    println "echo ${staticName}";
}

@Field
def staticName = "Ken"

echo("Ryu")
