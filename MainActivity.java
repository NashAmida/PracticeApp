package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView question1_CheckBox, question2_RadioButton, question3_EditText, question4_ImageView, score_TextView;
    EditText question3_EditTextAnswer;
    Button submit, reset;
    RadioButton question4_symmetricalBalance, question4_asymmetricalBalance, question2_fork, question2_shoe, question2_paintbrush;
    RadioGroup RadioGroup1, RadioGroup2;
    CheckBox question1checkBox_red, question1checkBox_blue, question1checkBox_black, question1checkBox_green;

    boolean checked = (true);

    int pointsForCorrectAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*

    CheckBoxes: Question on primary colors
 */
    public void onSelectCheckBox(View view) {
        question1checkBox_red = findViewById(R.id.question1checkBox_red);
        question1checkBox_blue = findViewById(R.id.question1checkBox_blue);
        question1checkBox_black = findViewById(R.id.question1checkBox_black);
        question1checkBox_green = findViewById(R.id.question1checkBox_green);

        boolean isRedChecked = question1checkBox_red.isChecked();
        boolean isBlueChecked = question1checkBox_blue.isChecked();
        boolean isBlackChecked = question1checkBox_black.isChecked();
        boolean isGreenChecked = question1checkBox_green.isChecked();

        if (isRedChecked && isBlueChecked && !isBlackChecked && !isGreenChecked){
            pointsForCorrectAnswers +=1;
        }
    }
    /*
    Radio Group 1: Question on painting tool
     */

    public void onSelectRadioButtonGroup1 (View view) {

        question2_fork = findViewById(R.id.question2_fork);
        question2_shoe = findViewById(R.id.question2_shoe);
        question2_paintbrush = findViewById(R.id.question2_paintbrush);

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.question2_fork:
                if (checked)
                    pointsForCorrectAnswers +=0;
                break;

            case R.id.question2_shoe:
                if (checked)
                    pointsForCorrectAnswers +=0;
                break;

            case R.id.question2_paintbrush:
                if (checked)
                    pointsForCorrectAnswers +=1;
                break;
        }
    }

    /*
    Edit text: Question on Rainbow Color
     */

    public String

    /*
    Radio Group 2: Question on balance
     */

    public void onSelectRadioButtonGroup2 (View view){

        question4_symmetricalBalance = findViewById(R.id.question4_symmetricalBalance);
        question4_asymmetricalBalance = findViewById(R.id.question4_asymmetricalBalance);

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.question4_symmetricalBalance:
                if (checked)
                    pointsForCorrectAnswers +=1;
                break;

            case R.id.question4_asymmetricalBalance:
                if (checked)
                    pointsForCorrectAnswers +=0;
                break;
        }
    }

    /*
    Show score
     */




    /*
    Reset the quiz

     */
    public void reset(View view) {
        EditText editText = findViewById(R.id.question3_EditTextAnswer);
        editText.setText("");

        CheckBox checkBox =findViewById(R.id.question1checkBox_red);
        checkBox.setChecked(false);

            checkBox =findViewById(R.id.question1checkBox_blue);
        checkBox.setChecked(false);

            checkBox =findViewById(R.id.question1checkBox_black);
        checkBox.setChecked(false);

            checkBox =findViewById(R.id.question1checkBox_green);
        checkBox.setChecked(false);

        RadioGroup radioGroup = findViewById(R.id.RadioGroup1);
        radioGroup.clearCheck();

            radioGroup = findViewById(R.id.RadioGroup2);
        radioGroup.clearCheck();

    }
}
