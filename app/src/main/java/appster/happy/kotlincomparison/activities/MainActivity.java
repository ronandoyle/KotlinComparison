package appster.happy.kotlincomparison.activities;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import appster.happy.kotlincomparison.R;
import models.JavaCar;
import models.KotlinCar;

/**
 * Created by Ronan on 15/03/2015.
 */
public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        removeOddNumbers();
    }


    /**
     * Instantiate new Kotlin class without default constructor.
     */
    private void instantiateKotlin() {
        new KotlinCar("09C9382","Audi","A4","2009","1968cc", 4, 2, 90000);
    }

    /**
     * Instantiate new Java class without default constructor.
     */
    private void instantiateJava() {
        JavaCar javaCar = new JavaCar();
        javaCar.setVehicleReg("09C9382");
        javaCar.setMake("Audi");
        javaCar.setModel("A4");
        javaCar.setYear("2009");
        javaCar.setEngineSize("1968cc");
        javaCar.setNumDoors(4);
        javaCar.setNumOwners(2);
        javaCar.setMileage(90000);
    }

    /**
     * Setting a click listener on a TextView.
     * @param context
     */
    private void viewClickListener(final Context context) {
        TextView textView = (TextView) findViewById(R.id.main_text_view);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * Removing all the odd numbers from a list of integers.
     */
    private void removeOddNumbers() {
        int i = 0;
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(10);
        numberList.add(11);
        numberList.add(12);
        numberList.add(13);
        numberList.add(14);
        numberList.add(15);
        numberList.add(16);
        numberList.add(17);
        numberList.add(18);
        numberList.add(19);
        numberList.add(20);

        for (Iterator<Integer> it = numberList.iterator(); it.hasNext(); )
        {
            it.next(); // Add this line in your code
            if (i % 2 != 0)
            {
                it.remove();
            }
            i++;
        }
    }

    /**
     * Used to set and get the value of a lovely jumper.
     */
    private void jumperColour() {
        Jumper jumper = new Jumper("Mushroom Soup Grey");
        String colour = jumper.getColour();
    }

    /**
     * A class for a coloured jumper.
     */
    class Jumper {

        private String colour;

        public Jumper(String colour) {
            this.colour = colour;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }
    }
}