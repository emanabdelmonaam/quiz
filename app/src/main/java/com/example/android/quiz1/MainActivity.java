
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

    public RadioGroup number_0ne, number_five, number_six;
    public int score;
    public boolean resultNumberSubmited;
    public RadioButton redio_botton_qu1_two, redio_botton_qu2_two, redio_botton_qu3_two;
    public CheckBox checbox_qu1_three, checbox_qu2_three, checbox_qu3_three, checbox_qu4_three;

    public EditText edit_qu1_four;
    public EditText edit_qu1_five;

    public RadioButton redio_botton_qu1_one, redio_botton_qu2_one, redio_botton_qu3_one;
    public RadioButton redio_botton_qu1_six, redio_botton_qu2_six, redio_botton_qu3_six;

    public Button buttonSubmit, buttonReset, Sendtomyemail;

    static final String result_Number_Submited = "score";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultNumberSubmited = false;
        score = 0;
        again();}


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        score = savedInstanceState.getInt(result_Number_Submited);
        finalScore(resultNumberSubmited);
        if (resultNumberSubmited)
            finalScore(resultNumberSubmited);}

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){

        savedInstanceState.putInt(result_Number_Submited, score);

        super.onSaveInstanceState(savedInstanceState);}

    public void finalScore(boolean flag) {
        resultNumberSubmited = true;
        resultNumberSubmited = false;
        score = 0;
        // Redio Button question
        //answer RadioButton one
        RadioButton checkedRadioButton1 = (RadioButton) findViewById(R.id.redio_botton_qu2_two);
        boolean hascheckedRadioButton1 = checkedRadioButton1.isChecked();
        if (hascheckedRadioButton1){
            score++;}

        redio_botton_qu2_two.setEnabled(false);
        redio_botton_qu1_two.setEnabled(false);
        redio_botton_qu3_two.setEnabled(false);

        ///////answer RadioButton two
        RadioButton checkedRadioButton2 = (RadioButton) findViewById(R.id.redio_botton_qu3_one);
        boolean hascheckedRadioButton2 = checkedRadioButton2.isChecked();
        if (hascheckedRadioButton2){
            score++;}

        redio_botton_qu3_one.setEnabled(false);
        redio_botton_qu1_one.setEnabled(false);
        redio_botton_qu2_one.setEnabled(false);
        //answer RadioButton three
        RadioButton checkedRadioButton3 = (RadioButton) findViewById(R.id.redio_botton_qu2_six);
        boolean hascheckedRadioButton3 = checkedRadioButton3.isChecked();
        if (hascheckedRadioButton3){
            score++;}

        redio_botton_qu2_six.setEnabled(false);
        redio_botton_qu3_six.setEnabled(false);
        redio_botton_qu1_six.setEnabled(false);

        // ChicBox question //
        // answer one CheckBox
        CheckBox checkedQui1 = (CheckBox) findViewById(R.id.checbox_qu1_three);
        boolean hascheckedQui1 = checkedQui1.isChecked();
        if (hascheckedQui1){
            score++;}

        // answer two CheckBox
        CheckBox checkedQui3 = (CheckBox) findViewById(R.id.checbox_qu3_three);
        boolean hascheckedQui3 = checkedQui3.isChecked();
        if (hascheckedQui3){
            score++;}
        // answer three CheckBox
        CheckBox checkedQui4 = (CheckBox) findViewById(R.id.checbox_qu4_three);
        boolean hascheckedQui4 = checkedQui4.isChecked();
        if (hascheckedQui4){
            score++;}

        checbox_qu1_three.setEnabled(false);
        checbox_qu2_three.setEnabled(false);
        checbox_qu3_three.setEnabled(false);
        checbox_qu4_three.setEnabled(false);
        // EditText question
        //one
        EditText qustionFour = (EditText) findViewById(R.id.edit_qu1_four);
        String answerFour = qustionFour.getText().toString();
        if (answerFour.equals("Summer")) {
            score++;}
            else if (answerFour.equals("Summer ")) {
            score++;}
           else if (answerFour.equals("summer ")) {
            score++;}
           else if (answerFour.equals("summer")) {
            score++;}

        edit_qu1_four.setEnabled(false);

        EditText qustionFive = (EditText) findViewById(R.id.edit_qu1_five);
        String answerFive = qustionFive.getText().toString();

        if (answerFive.equals("Spring")){
            score++;}
        if (answerFive.equals("Spring ")){
            score++;}
        if (answerFive.equals("spring")){
            score++;}
        if (answerFive.equals("spring ")){
            score++;}
        edit_qu1_five.setEnabled(false);

        setScore();

        //Toast message about score
        Toast.makeText(this, "Your score is: " + score + "\n Be Happy All Time", Toast.LENGTH_LONG).show();}

    public void setScore() {
        TextView score = (TextView) findViewById(R.id.scoreNumber);
        score.setText("" + this.score + "");}

    //reset Quiz from 0
    public void reset(){
        resultNumberSubmited = false;
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
//////ChecBox
        checbox_qu1_three.setEnabled(true);
        checbox_qu3_three.setEnabled(true);
        checbox_qu4_three.setEnabled(true);
        checbox_qu2_three.setEnabled(true);

        checbox_qu1_three.setChecked(false);
        checbox_qu2_three.setChecked(false);
        checbox_qu3_three.setChecked(false);
        checbox_qu4_three.setChecked(false);}

    //to sent the final score to my mail
    public void Sendtomyemail(){

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: "));// this for only email app
        intent.putExtra(Intent.EXTRA_SUBJECT, " congratulation" + "\n Your Score is  " + score + "\n Be Happy All Time");
        intent.putExtra(Intent.EXTRA_TEXT, resultNumberSubmited);

        if (intent.resolveActivity(getPackageManager()) != null) ;
        startActivity(intent);}

    private void again() {

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
////////
        Sendtomyemail = (Button) findViewById(R.id.button_send_to_my_email);
        Sendtomyemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sendtomyemail();
            }
        });
/////////////
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
    }}