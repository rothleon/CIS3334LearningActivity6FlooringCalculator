package cis3334.leonroth.learningactivity6flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView textViewFlooringNeeded;
    Double roomWidth;
    Double roomLength;
    Double result;
    String resultString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        textViewFlooringNeeded = findViewById(R.id.textViewFlooringNeeded);

        Bundle extras = getIntent().getExtras();
        roomLength = extras.getDouble("RoomLength");
        roomWidth = extras.getDouble("RoomWidth");

        result = roomLength * roomWidth;

        resultString = ("Width is " + roomWidth + " and Length is " + roomLength + " and flooring needed is " + result + ".");

        textViewFlooringNeeded.setText(resultString);





    }
}