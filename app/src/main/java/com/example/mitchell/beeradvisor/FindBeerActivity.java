package com.example.mitchell.beeradvisor;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

//public class FindBeerActivity extends AppCompatActivity {
public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    
    //call when button click
    public void onClickFindBeer(View view) {
        //get ref to textview
        TextView brands = (TextView) findViewById(R.id.brands);

        //get ref to spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        //Get selected line item in spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //display beers
        brands.setText(beerType);


    }
}
