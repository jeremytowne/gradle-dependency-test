package com.kronos.project

class Independant {
    def instanceVariable

    public Independant(var) {
        instanceVariable = var
    }

    def doSomething() {
        println instanceVariable
    }
}