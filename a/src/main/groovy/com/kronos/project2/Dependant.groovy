package com.kronos.project2

import com.kronos.project.Independant

class Dependant {

    Independant obj = new Independant('var')
    
    public Dependant() {
        obj.doSomething()
    }
}