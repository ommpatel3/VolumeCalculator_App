package android.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sphereActivity extends AppCompatActivity {

    Button backButton;
    Button submitButton;
    EditText radiusInput;
    TextView volume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

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
        radiusInput = (EditText) findViewById(R.id.Radius);

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
                String radiusstr = radiusInput.getText().toString();
                double radius = Double.parseDouble(radiusstr);

                double volumeans = (radius*radius*radius*4*(Math.PI))/3;
                double volumeansrnd = Math.round(volumeans * 1000.0) / 1000.0;;
                String volumestr = (Double.toString(volumeansrnd))+" units^3";
                volume.setText(volumestr);
            }
        });
    }
}
