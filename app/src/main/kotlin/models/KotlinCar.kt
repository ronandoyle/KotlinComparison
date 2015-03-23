package models

import android.support.v4.app.Fragment
import android.widget.Toast
import android.content.Context

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


public fun toast(context: Context, message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, message, duration).show()
}