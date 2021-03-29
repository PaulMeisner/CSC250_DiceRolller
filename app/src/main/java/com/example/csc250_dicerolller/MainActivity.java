package com.example.csc250_dicerolller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button ZeroButton;
    private Button OneButton;
    private Button TwoButton;
    private Button ThreeButton;
    private Button FourButton;
    private Button FiveButton;
    private Button SixButton;
    private Button SevenButton;
    private Button EightButton;
    private Button NineButton;
    private TextView quantityTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.OneButton = this.findViewById(R.id.OneButton);
        this.TwoButton = this.findViewById(R.id.TwoButton);
        this.ThreeButton = this.findViewById(R.id.ThreeButton);
        this.FourButton = this.findViewById(R.id.FourButton);
        this.FiveButton = this.findViewById(R.id.FiveButton);
        this.SixButton = this.findViewById(R.id.SixButton);
        this.SevenButton = this.findViewById(R.id.SevenButton);
        this.EightButton = this.findViewById(R.id.EightButton);
        this.NineButton = this.findViewById(R.id.NineButton);
        this.ZeroButton = this.findViewById(R.id.ZeroButton);
        this.quantityTv = this.findViewById(R.id.quantityTv);

    }

    public void quantityTvButtonPressed(View v)
    {
        if(v == this.OneButton)
        {
            this.quantityTv.setText("1");
        }

        if(v == this.TwoButton)
        {
            this.quantityTv.setText("2");
        }
        if(v == this.ThreeButton)
        {
            this.quantityTv.setText("3");
        }
        if(v == this.FourButton)
        {
            this.quantityTv.setText("4");
        }
        if(v == this.FiveButton)
        {
            this.quantityTv.setText("5");
        }
        if(v == this.SixButton)
        {
            this.quantityTv.setText("6");
        }
        if(v == this.SevenButton)
        {
            this.quantityTv.setText("7");
        }
        if(v == this.EightButton)
        {
            this.quantityTv.setText("8");
        }
        if(v == this.NineButton)
        {
            this.quantityTv.setText("9");
        }
        if(v == this.ZeroButton)
        {
            this.quantityTv.setText("0");
        }

    }
}