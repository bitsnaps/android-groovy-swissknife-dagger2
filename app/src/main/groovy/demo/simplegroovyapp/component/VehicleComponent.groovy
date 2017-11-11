package demo.simplegroovyapp.component

import dagger.Component
import demo.simplegroovyapp.MainActivity
import demo.simplegroovyapp.domain.Vehicle
import demo.simplegroovyapp.module.VehicleModule
import groovy.transform.CompileStatic

import javax.inject.Singleton

@CompileStatic
@Singleton // from javax.inject.Singleton not groovy's @Singleton
@Component(modules = [VehicleModule])
interface VehicleComponent {

    void inject(MainActivity mainActivity)

    Vehicle provideVehicle()
}