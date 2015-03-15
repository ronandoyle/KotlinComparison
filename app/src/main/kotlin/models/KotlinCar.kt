package models

import android.support.v4.app.Fragment
import android.widget.Toast

/**
 * Created by Ronan on 15/03/2015.
 */
data class KotlinCar(
        var vehicleReg: String,
        var make: String,
        var model: String,
        var year: String,
        var engineSize: String,
        var numDoors: Int,
        var numOwners: Int,
        var mileage: Int)


fun Fragment.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(getActivity(), message, duration).show();
}