package com.wt.test.groovy

/**
 *
 *
 * @author 一贫
 * @date 2021/11/24
 */

[1, 2, 3, 4].each { println it }

["aaa", "bbb"].each { item -> println item }

["a": 1, "b": 2].each { println "key:${it.key},value:${it.value}" }