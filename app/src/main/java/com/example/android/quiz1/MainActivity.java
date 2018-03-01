package com.example.android.quiz1;

import android.content.Intent;
import android.net.Uri;
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

public class MainActivity extends AppCompatActivity {

    private int score=0;
    private boolean resultNumberSubmited;
    private RadioGroup number_0ne;
    private RadioButton redio_botton_qu1_two;
    private RadioButton redio_botton_qu2_two;
    private RadioButton redio_botton_qu3_two;
    private RadioGroup  number_five;
    private RadioButton redio_botton_qu1_one;
    private RadioButton redio_botton_qu2_one;
    private RadioButton redio_botton_qu3_one;
    private RadioGroup  number_six;
    private RadioButton redio_botton_qu1_six;
    private RadioButton redio_botton_qu2_six;
    private RadioButton redio_botton_qu3_six;
    private CheckBox checbox_qu1_three;
    private CheckBox checbox_qu2_three;
    private CheckBox checbox_qu3_three;
    private CheckBox checbox_qu4_three;
    private EditText edit_qu1_four;
    private EditText edit_qu1_five;
    private Button buttonSubmit;
    private Button buttonReset;
    private Button Sendtomyemail;

    static final String result_Number_Submited = "score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultNumberSubmited=false;
        score = 0;
        again(resultNumberSubmited);

        number_0ne = (RadioGroup) findViewById(R.id.number_0ne);
        redio_botton_qu1_two = (RadioButton) findViewById(R.id.redio_botton_qu1_two);
        redio_botton_qu2_two = (RadioButton) findViewById(R.id.redio_botton_qu2_two);
        redio_botton_qu3_two = (RadioButton) findViewById(R.id.redio_botton_qu3_two);
        edit_qu1_four = (EditText) findViewById(R.id.edit_qu1_four);
        edit_qu1_five = (EditText) findViewById(R.id.edit_qu1_five);
        checbox_qu1_three = (CheckBox) findViewById(R.id.checbox_qu1_three);
        checbox_qu2_three = (CheckBox) findViewById(R.id.checbox_qu2_three);
        checbox_qu3_three = (CheckBox) findViewById(R.id.checbox_qu3_three);
        checbox_qu4_three = (CheckBox) findViewById(R.id.checbox_qu4_three);
        number_five = (RadioGroup) findViewById(R.id.number_five);
        redio_botton_qu1_one = (RadioButton) findViewById(R.id.redio_botton_qu1_one);
        redio_botton_qu2_one = (RadioButton) findViewById(R.id.redio_botton_qu2_one);
        redio_botton_qu3_one = (RadioButton) findViewById(R.id.redio_botton_qu3_one);
        number_six = (RadioGroup) findViewById(R.id.number_six);
        redio_botton_qu1_six = (RadioButton) findViewById(R.id.redio_botton_qu1_six);
        redio_botton_qu2_six = (RadioButton) findViewById(R.id.redio_botton_qu2_six);
        redio_botton_qu3_six = (RadioButton) findViewById(R.id.redio_botton_qu3_six);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score = savedInstanceState.getInt(result_Number_Submited);
        again(resultNumberSubmited);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(result_Number_Submited, score);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void finalScore(boolean view) {
       score = 0;

        // Redio Button question
        //answer RadioButton one
        RadioButton checkedRadioButton1 = (RadioButton) findViewById(R.id.redio_botton_qu2_two);
        boolean hascheckedRadioButton1 = checkedRadioButton1.isChecked();

        if (hascheckedRadioButton1) {
            score++;
        }

        ///////answer RadioButton two
        RadioButton checkedRadioButton2 = (RadioButton) findViewById(R.id.redio_botton_qu3_one);
        boolean hascheckedRadioButton2 = checkedRadioButton2.isChecked();

        if (hascheckedRadioButton2) {
            score++;
        }

        //answer RadioButton three
        RadioButton checkedRadioButton3 = (RadioButton) findViewById(R.id.redio_botton_qu2_six);
        boolean hascheckedRadioButton3 = checkedRadioButton3.isChecked();

        if (hascheckedRadioButton3) {
            score++;
        }

         // ChicBox question //
        // Answer one CheckBox
        if(checbox_qu1_three.isChecked()&&
               !checbox_qu2_three.isChecked()&&
                checbox_qu3_three.isChecked() &&
                checbox_qu4_three.isChecked()) {
            score++;
        }

        // EditText question
        //one
        EditText qustionFour = (EditText) findViewById(R.id.edit_qu1_four);
        String answerFour = qustionFour.getText().toString();

        if (answerFour.equals("Summer")) {

            score++;
        } else if (answerFour.equals("Summer ")) {
            score++;

        } else if (answerFour.equals("summer ")) {
            score++;
        } else if (answerFour.equals("summer")) {
            score++;
        }

        EditText qustionFive = (EditText) findViewById(R.id.edit_qu1_five);
        String answerFive = qustionFive.getText().toString();

        if (answerFive.equals("Autumn")) {
            score++;
        } else if (answerFive.equals("Autumn ")) {
            score++;
        } else if (answerFive.equals("autumn")) {
            score++;
        } else if (answerFive.equals("autumn ")) {
            score++;
        } else if (answerFive.equals("Fall")) {
            score++;
        } else if (answerFive.equals("Fall ")) {
            score++;
        } else if (answerFive.equals("fall")) {
            score++;
        } else if (answerFive.equals("fall ")) {
            score++;
        }

        //setEnabled my questions after Result
        redio_botton_qu2_two.setEnabled(false);
        redio_botton_qu1_two.setEnabled(false);
        redio_botton_qu3_two.setEnabled(false);
        redio_botton_qu3_one.setEnabled(false);
        redio_botton_qu1_one.setEnabled(false);
        redio_botton_qu2_one.setEnabled(false);
        redio_botton_qu2_six.setEnabled(false);
        redio_botton_qu3_six.setEnabled(false);
        redio_botton_qu1_six.setEnabled(false);
        checbox_qu1_three.setEnabled(false);
        checbox_qu2_three.setEnabled(false);
        checbox_qu3_three.setEnabled(false);
        checbox_qu4_three.setEnabled(false);
        edit_qu1_four.setEnabled(false);
        edit_qu1_five.setEnabled(false);

        setScore();

        //Toast message about score
        Toast.makeText(this, "Your score is: " + score + "\n Be Happy All Time", Toast.LENGTH_LONG).show();
    }

    public void setScore() {
        TextView score = (TextView) findViewById(R.id.scoreNumber);
        score.setText("" + this.score + "");
    }

    //reset Quiz to 0
    public void reset() {
        score = 0;

        TextView scoreView = (TextView) findViewById(R.id.scoreNumber);
        scoreView.setText(String.valueOf(score));

       //Redio_Button_one
        number_0ne.clearCheck();
        for (int i = 0; i < number_0ne.getChildCount(); i++)
            number_0ne.getChildAt(i).setEnabled(true);

        //two
        number_five.clearCheck();
        for (int i = 0; i < number_five.getChildCount(); i++)
            number_five.getChildAt(i).setEnabled(true);

        //three
        number_six.clearCheck();
        for (int i = 0; i < number_six.getChildCount(); i++)
            number_six.getChildAt(i).setEnabled(true);

       //edit_Text_one
        edit_qu1_four.setEnabled(true);
        edit_qu1_four.setText("");

        //two
        edit_qu1_five.setEnabled(true);
        edit_qu1_five.setText("");

       //ChecBox
       checbox_qu1_three.setEnabled(true);
       checbox_qu3_three.setEnabled(true);
       checbox_qu4_three.setEnabled(true);
       checbox_qu2_three.setEnabled(true);
       checbox_qu1_three.setChecked(false);
       checbox_qu2_three.setChecked(false);
       checbox_qu3_three.setChecked(false);
       checbox_qu4_three.setChecked(false);
    }

    //to sent the final score to my mail
    public void sendToMyEmail() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: "));// this for only email app
        intent.putExtra(Intent. EXTRA_SUBJECT, " congratulation" + "\n Your Score is  " + score + "\n Be Happy All Time");
        intent.putExtra(Intent. EXTRA_TEXT, resultNumberSubmited);

        if (intent.resolveActivity(getPackageManager()) != null) ;
        startActivity(intent);
    }

    public void again(boolean resultNumberSubmited) {
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalScore(false);
            }
        });

        buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        //send the resolt to my mail
        Sendtomyemail = (Button) findViewById(R.id.button_send_to_my_email);
        Sendtomyemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToMyEmail();
            }
        });
    }
}