package sg.edu.rp.c346.id20045524.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    Spinner spnyesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
        spnyesNo = findViewById(R.id.spinner);

        spnyesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        //Your code for item 1 selected
                        tvDisplay.setText("SpinnerItem, Yes Selected");
                        break;
                    case 1:
                        //Your code for item 2 selected
                        tvDisplay.setText("SpinnerItem, No Selected");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}