package models

import android.app.Activity
import android.os.Bundle
import appster.happy.kotlincomparison.R
import android.support.v4.app.Fragment
import java.util.ArrayList

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

    /**
     * Setting a click listener on a TextView.
     */
    fun viewClickListener() {
        val textView = findViewById(R.id.main_text_view)
        textView.setOnClickListener({toast(this, "Clicked!")})
    }

    /**
     * Removing all the odd numbers from a list of integers.
     */
    fun removeOddNumbers() {
        val numberList = ArrayList<Int>()
        numberList.add(10)
        numberList.add(11)
        numberList.add(12)
        numberList.add(13)
        numberList.add(14)
        numberList.add(15)
        numberList.add(16)
        numberList.add(17)
        numberList.add(18)
        numberList.add(19)
        numberList.add(20)
        numberList.filter {it % 2 == 1}
    }

    /**
     * Used to set and get the value of a lovely jumper.
     */
    fun jumperColour() {
        val colour = Jumper("Mushroom Soup Grey")
    }

    /**
     * A class for a coloured jumper. This 'data' class implicitly generates
     * toString(), equals() and hashCode() methods.
     */
    data class Jumper(val colour: String? = null)
}