package android.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cubeActivity extends AppCompatActivity {

    Button backButton;
    Button submitButton;
    EditText lengthInput;
    EditText widthInput;
    EditText heightInput;
    TextView volume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

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
        lengthInput = (EditText) findViewById(R.id.Length);
        widthInput = (EditText) findViewById(R.id.Width);
        heightInput = (EditText) findViewById(R.id.Height);

        heightInput.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean hasfocus) {
                if(hasfocus)
                    heightInput.setText("");
            }
        });
        widthInput.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean hasfocus) {
                if(hasfocus)
                    widthInput.setText("");
            }
        });
        lengthInput.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean hasfocus) {
                if(hasfocus)
                    lengthInput.setText("");
            }
        });
    }

    public void configureSubmitButton() {
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String lengthstr = lengthInput.getText().toString();
                double length = Double.parseDouble(lengthstr);

                String widthstr = widthInput.getText().toString();
                double width = Double.parseDouble(widthstr);

                String heightstr = heightInput.getText().toString();
                double height = Double.parseDouble(heightstr);

                double volumeans = height*width*length;
                String volumestr = (Double.toString(volumeans))+" units^3";
                volume.setText(volumestr);
            }
        });
    }
}
