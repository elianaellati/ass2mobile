package com.example.projectt;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.ArrayList;


public class Activity1 extends AppCompatActivity {
    private Spinner spinner;
    private Animation top, bottom;
    private TextView text1;
    private RadioButton check1;
    private ImageView img;
    private RadioButton check2;
    private TextView text2;
    private RadioButton check3;
    private RadioButton check4;
    private TextView text3;
    private RadioButton check5;
    private RadioButton check6;
    private TextView text4;
    private TextView txtanim;
    private RadioButton check7;
    private RadioButton check8;
    private TextView text5;
    private RadioButton check9;
    private RadioButton check10;
    private TextView text6;
    private RadioButton check11;
    private RadioButton check12;
    private Button score;
    private Button click;
    private int counter;
    private EditText finall;
    English[] english = new English[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        img = findViewById(R.id.photo);
        txtanim=findViewById(R.id.text);
        spinner=findViewById(R.id.spinner);
        text1=findViewById(R.id.first);
        check1=findViewById(R.id.checkBox);
        check2=findViewById(R.id.checkBox2);
        text2=findViewById(R.id.second);
        check3=findViewById(R.id.check2);
        check4=findViewById(R.id.check3);
        text3=findViewById(R.id.Third);
        score=findViewById(R.id.getscore);
        check5=findViewById(R.id.check4);
        check6=findViewById(R.id.check5);
        text4=findViewById(R.id.fourth);
        check7=findViewById(R.id.check6);
        check8=findViewById(R.id.check7);
        finall=findViewById(R.id.finall);
        text5=findViewById(R.id.five);
        check9=findViewById(R.id.check8);
        check10=findViewById(R.id.check9);
        text6=findViewById(R.id.sixth);
        click=findViewById(R.id.click);
        check11=findViewById(R.id.check10);
        check12=findViewById(R.id.check11);
        text1.setVisibility(View.GONE);
        check1.setVisibility(View.GONE);
        check2.setVisibility(View.GONE);
        text2.setVisibility(View.GONE);
        check3.setVisibility(View.GONE);
        check4.setVisibility(View.GONE);
        text3.setVisibility(View.GONE);
        check5.setVisibility(View.GONE);
        check6.setVisibility(View.GONE);
        text4.setVisibility(View.GONE);
        check7.setVisibility(View.GONE);
        check8.setVisibility(View.GONE);
        text5.setVisibility(View.GONE);
        check9.setVisibility(View.GONE);
        check10.setVisibility(View.GONE);
        text6.setVisibility(View.GONE);
        check11.setVisibility(View.GONE);
        check12.setVisibility(View.GONE);
        score.setVisibility(View.GONE);

        Spinner();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        top = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        img.setAnimation(top);
        txtanim.setAnimation(bottom);
        spinner.setAnimation(bottom);
        click.setAnimation(top);

    }
    private void Spinner(){
        String [] type={"Past Simple", "Present Simple"};
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,type);
        spinner.setAdapter(adapter);
    }


    public void btnonclick(View view) {
        String text = spinner.getSelectedItem().toString();
        finall.setText("");
        if(text.compareToIgnoreCase("past simple")==0){
            text1.setVisibility(View.VISIBLE);
            check1.setVisibility(View.VISIBLE);
            check2.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);
            check3.setVisibility(View.VISIBLE);
            check4.setVisibility(View.VISIBLE);
            text3.setVisibility(View.VISIBLE);
            check5.setVisibility(View.VISIBLE);
            check6.setVisibility(View.VISIBLE);

            text4.setVisibility(View.GONE);
            check7.setVisibility(View.GONE);
            check8.setVisibility(View.GONE);
            text5.setVisibility(View.GONE);
            check9.setVisibility(View.GONE);
            check10.setVisibility(View.GONE);
            text6.setVisibility(View.GONE);
            check11.setVisibility(View.GONE);
            check12.setVisibility(View.GONE);

        }else{
            text4.setVisibility(View.VISIBLE);
            check7.setVisibility(View.VISIBLE);
            check8.setVisibility(View.VISIBLE);
            text5.setVisibility(View.VISIBLE);
            check9.setVisibility(View.VISIBLE);
            check10.setVisibility(View.VISIBLE);
            text6.setVisibility(View.VISIBLE);
            check11.setVisibility(View.VISIBLE);
            check12.setVisibility(View.VISIBLE);
            text1.setVisibility(View.GONE);
            check1.setVisibility(View.GONE);
            check2.setVisibility(View.GONE);
            text2.setVisibility(View.GONE);
            check3.setVisibility(View.GONE);
            check4.setVisibility(View.GONE);
            text3.setVisibility(View.GONE);
            check5.setVisibility(View.GONE);
            check6.setVisibility(View.GONE);
        }

        score.setVisibility(View.VISIBLE);
        english[0]= new English("Went","Past Simple");
        english[1]=new English("Saw","Past Simple");
        english[2]=new English("Did","Past Simple");
        english[3]=new English("Study","Present Simple");
        english[4]=new English("Washes up","Present Simple");
        english[5]=new English("Don't","Present Simple");
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String englishh = gson.toJson(english);
        editor.putString("english", englishh);
        editor.commit();

    }
    public void btnonclickk(View view) {
        String text = spinner.getSelectedItem().toString();
        String answer="";
        if(text.compareToIgnoreCase("Past Simple")==0){
            if(check1.isChecked()){
                answer=answer+check1.getText()+",";
            } if(check2.isChecked()){
                answer=answer+check2.getText()+",";
            }
            if(check3.isChecked()){
                answer=answer+check3.getText()+",";
            }
            if(check4.isChecked()){
                answer=answer+check4.getText()+",";
            }
            if(check5.isChecked()){
                answer=answer+check5.getText()+",";
            }
            else{
                answer=answer+check6.getText()+",";
            }

        } if(text.compareToIgnoreCase("Present Simple")==0) {
            if (check7.isChecked()) {
                answer = answer + check7.getText() + ",";
            }
            if (check8.isChecked()) {
                answer = answer + check8.getText() + ",";
            }
            if (check9.isChecked()) {
                answer = answer + check9.getText() + ",";
            }
            if (check10.isChecked()) {
                answer = answer + check10.getText() + ",";
            }
            if (check11.isChecked()) {
                answer = answer + check11.getText() + ",";
            } else {
                answer = answer + check12.getText() + ",";
            }
        }
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        String str = prefs.getString("english", "");
        english= gson.fromJson(str,English[].class);

        finall.setText( score(answer,text));



    }
    public String score(String answer,String text){
        counter =0;
        String correct="";
        String[] tokens=answer.split(",");
        for(int i=0;i<tokens.length;++i){
            for( int j=0;j< english.length;++j){
                if(tokens[i].compareToIgnoreCase(english[j].getAnswer())==0  ) {
                    ++counter;
                } if(text.compareToIgnoreCase(english[j].getType())==0 && !correct.contains(english[j].getAnswer())){
                    correct=correct+" - "+english[j].getAnswer();
                }
            }
        }

        String result="The Final Score : "+counter+"/3"+"\n"+"" +
                "The Correct answers is : "+correct;
        return result;
    }


}


