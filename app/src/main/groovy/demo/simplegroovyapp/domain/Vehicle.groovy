package demo.simplegroovyapp.domain

import groovy.transform.Canonical
import groovy.transform.CompileStatic

import javax.inject.Inject

@CompileStatic
@Canonical
class Vehicle {

    @Delegate Motor motor

    @Inject
    Vehicle(Motor motor) {
        this.motor = motor
    }

    // we use @Delegate instead of setter/getter
//    void setSpeed(int rpm) {
//        motor.rpm = rpm
//    }
//
//    int getSpeed() { motor.rpm }
}