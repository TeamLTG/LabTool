package com.example.labtool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText inputText, outputText;
    Button button;
    String input, output;               //Declare variables to be used by the program

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText) findViewById(R.id.editText);
        outputText = (EditText) findViewById(R.id.editText2);   //Declare the Text Inputs

        button = (Button) findViewById(R.id.button);    //Declare the FIND Button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = inputText.getText().toString();
                input = input.toLowerCase();

                switch (input){


                    case "speed": output = "d/t";         //To add or edit formulas and adapt the program for your use please add more cases, like the example here
                        break;
                    case "distance": output = "v*t | E/F";
                        break;
                    case "time": output = "d/v | v/a";
                        break;
                    case "change in time": output = "s/t";
                        break;
                    case "acceleration": output = "v/t | (v-u)/t | F/m";
                        break;
                    case "v": output = "u+at";
                        break;
                    case "s": output = "(u+v)/2t | ut+1/2at^2";
                        break;
                    case "v^2": output = "u^2 + 2as";
                        break;
                    case "force": output = "m*a | P*A | E/d";
                        break;
                    case "mass": output = "F/a | d*V | W/g";
                        break;
                    case "pressure": output = "F/a";
                        break;
                    case "area": output = "F/P";
                        break;
                    case "energy": output = "F*d";
                        break;
                    case "density": output = "m/V";
                        break;
                    case "volume": output = "d/M";
                        break;
                    case "weight": output = "m*g";
                        break;
                    case "gravity": output = "W/m";
                        break;
                    case "resultant force": output = "m*g-D";
                        break;
                    default: output = "Formula Not Found!";
                        break;

                }

                outputText.setText(output);
            }
        });

    }
}
