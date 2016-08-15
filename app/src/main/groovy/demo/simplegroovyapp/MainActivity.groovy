package demo.simplegroovyapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.InjectView
import com.arasthel.swissknife.annotations.OnClick
import demo.simplegroovyapp.component.DaggerVehicleComponent
import demo.simplegroovyapp.component.VehicleComponent
import demo.simplegroovyapp.domain.Vehicle
import groovy.transform.CompileStatic

import javax.inject.Inject

@CompileStatic
public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.txtRpm)
    TextView txtRpm

    @InjectView(R.id.edtRpm)
    EditText edtRpm

	// need to add the public access scope to make it a field rather than a groovy property,
	// so using the default access won't work:
	// @Inject
	// Vehicle vehicle
    @Inject
    public Vehicle vehicle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SwissKnife.inject(this)

        VehicleComponent vehicleComponent = DaggerVehicleComponent.builder().build()
        vehicleComponent.inject(this)

        //vehicle = vehicleComponent.provideVehicle()
    }

    @OnClick(R.id.btnSetRpm)
    void setRpm() {
        try {
            vehicle.speed = edtRpm.text.toString().toInteger()
            txtRpm.text = "Current RPM is $vehicle.speed"
        } catch (NumberFormatException e) {

        }
    }

}
