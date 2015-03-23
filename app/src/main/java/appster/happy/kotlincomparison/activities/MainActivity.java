package appster.happy.kotlincomparison.activities;

import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

    private void viewListener(final Context context) {
        TextView textView = (TextView) findViewById(R.id.main_text_view);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}