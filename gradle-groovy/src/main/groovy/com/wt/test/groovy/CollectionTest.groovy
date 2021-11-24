package com.wt.test.groovy

/**
 *
 *
 * @author 一贫
 * @date 2021/11/24
 */
[1: [1, 2], 2: "abc"].each { println "key:${it.key},value:${it.value}" }

//映射中的key，即使用同名变量，也会被Groovy当作String处理
def x = 1, y = 2
[x: [1, 2], y: "abc"].each { println "key:${it.key},value:${it.value}" }
