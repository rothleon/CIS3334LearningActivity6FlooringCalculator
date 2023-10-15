package cis3334.leonroth.learningactivity6flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editTextRoomWidth;
    EditText editTextRoomLength;
    Button buttonShowResult;
    Double roomWidth;
    Double roomLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextRoomWidth = findViewById(R.id.editTextRoomWidth);
        editTextRoomLength = findViewById(R.id.editTextRoomLength);


        buttonShowResult = findViewById(R.id.buttonShowResult);
        buttonShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double roomWidth = Double.parseDouble(editTextRoomWidth.getText().toString());
                Double roomLength = Double.parseDouble(editTextRoomLength.getText().toString());

                Intent resultsIntent = new Intent(MainActivity.this, ResultsActivity.class);
                resultsIntent.putExtra("RoomWidth", roomWidth);
                resultsIntent.putExtra("RoomLength", roomLength);

                startActivity(resultsIntent);



            }

        });

    }
}