package demo.simplegroovyapp.module;

import groovy.transform.CompileStatic

import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import demo.simplegroovyapp.domain.Motor
import demo.simplegroovyapp.domain.Vehicle

@Module
@CompileStatic
class VehicleModule {

    @Singleton
    @Provides
    Motor provideMotor() {
        new Motor()
    }

    @Singleton
    @Provides
    Vehicle providesVehicle() {
        new Vehicle(new Motor())
    }

}