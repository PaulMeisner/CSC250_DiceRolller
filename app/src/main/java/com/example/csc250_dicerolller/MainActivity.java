package com.example.csc250_dicerolller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    private TextView quantityTv;
    private String currentQuantityText;
    private TextView selectedDieTv;
    private TextView rollsTv;
    private TextView totalTv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.quantityTv = this.findViewById(R.id.quantityTv);
        this.selectedDieTv = this.findViewById(R.id.selectedDieTv);
        this.totalTv = this.findViewById(R.id.totalTv);
        this.rollsTv = this.findViewById(R.id.rollsTV);

        //clear
        this.quantityTv.setText("");
        this.currentQuantityText = "";
        this.totalTv.setText("");
        this.rollsTv.setText("");


    }
    private String extractNumberOfSides(String diceType)
    {

       String answer = "";
        for(int i = 1; i < diceType.length(); i++)
        {
            answer += diceType.charAt(i);

        }
        return answer;
    }

    public class Dice
    {
        private int numberOfSidesInt;

        public Dice(int numberOfSides)
        {
            this.numberOfSidesInt = numberOfSides;
        }
        public int roll()
        {
            Random r = new Random();
            return r.nextInt(this.numberOfSidesInt)+1;
        }
    }


    public void onRollButtonPressed(View v)
    {
        //get the qty as an int
        String quantityTvString = this.quantityTv.getText().toString();
        int quantityTvInt = Integer.parseInt(quantityTvString);
        int[] theRolls = new int[quantityTvInt];

        //get the number of sides as an int
        String fullDiceString = this.selectedDieTv.getText().toString(); //like "D4" or "D6"
        String trimmedDiceString = this.extractNumberOfSides(fullDiceString);
        //String trimmerDiceString = fullDiceString.substring(1);
        int numberOfSidesInt = Integer.parseInt(trimmedDiceString);
        //created separate class that is creating a dice and is rolling it
        Dice d = new Dice(numberOfSidesInt);
        //need a value to store the result
        //need my output to show the calculation as string
        int result = 0;
        String output = "";
        //need loop to go through calculation
        for(int i = 0; i < theRolls.length;i++)
        {
            //roll dice
            theRolls[i] = d.roll();
            //store result
            result += theRolls[i];
            //if the output is nothing, put the rolled number on screen
            if(totalTv.length() == 0)
            {
                output += theRolls[i];
            }
            else
            {
                //if output already includes numbers, add the neew rolled number to it without overewriting it
                output += " + " + theRolls[i];
            }
            //make rollstv equal to output
            this.rollsTv.setText(output);
            this.totalTv.setText("" + result);

        }

    }


    public void diceButtonPressed(View v)
    {
     this.selectedDieTv.setText(v.getTag().toString());

    }


    public void cancelButtonPressed(View v)
    {
        this.currentQuantityText ="";
        this.quantityTv.setText(this.currentQuantityText);
    }

    public void quantityTvButtonPressed(View v)
    {
        Button b  =  (Button)v;

        if(this.currentQuantityText.length() == 0 && b.getText().equals("0"))
        {
            return;

        }
        this.currentQuantityText += b.getText();
        this.quantityTv.setText(this.currentQuantityText);
        }


}