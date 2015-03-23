package models

import android.app.Activity
import android.os.Bundle
import appster.happy.kotlincomparison.R
import android.support.v4.app.Fragment

/**
 * Created by Ronan on 15/03/2015.
 */
public class KotlinMainAcitivty: Activity() {

    protected override fun onCreate(savedInstance: Bundle?) {
        super<Activity>.onCreate(savedInstance)
        setContentView(R.layout.activity_main)
    }

    /**
     * Instantiate new Kotlin class without default constructor.
     */
    fun instantiateKotlin() {
        KotlinCar("09C9382", "Audi", "A4", "2009", "1968cc", 4, 2, 90000)
    }

    fun viewListener() {
        val textView = findViewById(R.id.main_text_view)
        textView.setOnClickListener({toast(this, "Clicked!")})
    }
}