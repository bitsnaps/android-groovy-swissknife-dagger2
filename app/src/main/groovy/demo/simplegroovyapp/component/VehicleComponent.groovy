package demo.simplegroovyapp.component

import dagger.Component
import demo.simplegroovyapp.MainActivity
import demo.simplegroovyapp.domain.Vehicle
import demo.simplegroovyapp.module.VehicleModule

import javax.inject.Singleton

@Singleton
@Component(modules = [VehicleModule])
interface VehicleComponent {

    void inject(MainActivity mainActivity);

    Vehicle provideVehicle();
}