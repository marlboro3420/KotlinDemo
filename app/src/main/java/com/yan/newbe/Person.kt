package com.yan.newbe

/**
 * Created by Ys on 2017/8/9.
 */
open class Person {
    var name = ""
    var age = ""

    constructor(name: String, age: String) {
        this.name = name
        this.age = age
    }

    constructor()

    open fun eat() {
    }

}