package android.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class coneActivity extends AppCompatActivity {

    Button backButton;
    Button submitButton;
    EditText heightInput;
    EditText radiusInput;
    TextView volume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        configureBackButton();
        configureInputs();
        configureSubmitButton();

        volume = (TextView) findViewById(R.id.volume);
    }

    public void configureBackButton() {
        backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void configureInputs(){
        heightInput = (EditText) findViewById(R.id.Height);
        radiusInput = (EditText) findViewById(R.id.Radius);

        heightInput.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean hasfocus) {
                if(hasfocus)
                    heightInput.setText("");
            }
        });
        radiusInput.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean hasfocus) {
                if(hasfocus)
                    radiusInput.setText("");
            }
        });
    }

    public void configureSubmitButton(){
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String heightstr = heightInput.getText().toString();
                double height = Double.parseDouble(heightstr);

                String radiusstr = radiusInput.getText().toString();
                double radius = Double.parseDouble(radiusstr);

                double volumeans = (height*radius*radius*(Math.PI))/3;
                double volumeansrnd = Math.round(volumeans * 1000.0) / 1000.0;;
                String volumestr = (Double.toString(volumeansrnd))+" units^3";
                volume.setText(volumestr);
            }
        });
    }
}
