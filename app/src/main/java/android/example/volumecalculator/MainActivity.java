package android.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton coneButton;
    ImageButton cubeButton;
    ImageButton cylinderButton;
    ImageButton sphereButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureConeButton();
        configureCubeButton();
        configureCylinderButton();
        configureSphereButton();
    }

    public void configureConeButton() {
        coneButton = (ImageButton) findViewById(R.id.conebutton);
        coneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,coneActivity.class));
            }
        });
    }
    public void configureCubeButton() {
        cubeButton = (ImageButton) findViewById(R.id.cubebutton);
        cubeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,cubeActivity.class));
            }
        });
    }
    public void configureCylinderButton() {
        cylinderButton = (ImageButton) findViewById(R.id.cylinderbutton);
        cylinderButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,cylinderActivity.class));
            }
        });
    }
    public void configureSphereButton() {
        sphereButton = (ImageButton) findViewById(R.id.spherebutton);
        sphereButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,sphereActivity.class));
            }
        });
    }
}