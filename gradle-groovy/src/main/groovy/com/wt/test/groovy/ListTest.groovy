package com.wt.test.groovy

/**
 *
 *
 * @author 一贫
 * @date 2021/11/27
 */
a = [0, 1, 2, 3, 4]
println a[2, 3]
println a.getAt([2..4])
println(a[2..4])
println a << 5
a.remove(1)
println a
a.removeElement(5)
println a
a.removeAll([2])
println a