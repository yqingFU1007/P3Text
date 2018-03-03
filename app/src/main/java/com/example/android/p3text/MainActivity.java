package com.example.android.p3text;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int question_counter = 1;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view){
        EditText Name = (EditText) findViewById(R.id.name_field);
        name = Name.getText().toString();
        Name.setVisibility(View.INVISIBLE);

        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.shui_hu_zhuan);

        Button button_start = (Button)findViewById(R.id.start);
        button_start.setVisibility(View.INVISIBLE);

        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("《水浒传》108位好汉中有几位女人？");
        textView.setTextSize(25);
        textView.setTextColor(Color.rgb(255,255,255));

        Button button_one = (Button)findViewById(R.id.button_one);
        button_one.setVisibility(View.VISIBLE);

        Button button_two = (Button)findViewById(R.id.button_two);
        button_two.setVisibility(View.VISIBLE);

        Button button_three= (Button)findViewById(R.id.button_three);
        button_three.setVisibility(View.VISIBLE);

    }

    public void buttonOne(View view){

        if (question_counter == 9){
            questionTen();
        }
        if (question_counter == 8){
            questionNine();
        }
        if (question_counter == 7){
            score += 10;
            questionEight();
        }
        if (question_counter == 6){
            questionSeven();
        }
        if (question_counter == 5){
            questionSix();
        }
        if (question_counter == 4){
            questionFive();
        }
        if (question_counter == 3){
            score += 10;
            questionFour();
        }
        if (question_counter == 2){
            score += 10;
            questionThree();
        }
        if (question_counter == 1){
            questionTwo();
        }
    }

    public void buttonTwo(View view){
        if (question_counter == 9){
            score += 10;
            questionTen();
        }
        if (question_counter == 8){
            score += 10;
            questionNine();
        }
        if (question_counter == 7){
            questionEight();
        }
        if (question_counter == 6){
            questionSeven();
        }
        if (question_counter == 5){
            questionSix();
        }
        if (question_counter == 4){
            score += 10;
            questionFive();
        }
        if (question_counter == 3){
            questionFour();
        }
        if (question_counter == 2){
            questionThree();
        }
        if (question_counter == 1){
            score += 10;
            questionTwo();
        }
    }

    public void buttonThree(View view){
        if (question_counter == 9){
            questionTen();
        }
        if (question_counter == 8){
            questionNine();
        }
        if (question_counter == 7){
            questionEight();
        }
        if (question_counter == 6){
            score += 10;
            questionSeven();
        }
        if (question_counter == 5){
            score += 10;
            questionSix();
        }
        if (question_counter == 4){
            questionFive();
        }
        if (question_counter == 3){
            questionFour();
        }
        if (question_counter == 2){
        questionThree();
        }
        if (question_counter == 1){
            questionTwo();
        }
    }

    private void questionTwo(){
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.li_yu_chun);
        Button buttonOne = (Button)findViewById(R.id.button_one);
        buttonOne.setText("玉米");
        Button buttonTwo = (Button)findViewById(R.id.button_two);
        buttonTwo.setText("春天");
        Button buttonThree = (Button)findViewById(R.id.button_three);
        buttonThree.setText("红薯");
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("歌手李宇春的粉丝叫什么");
        textView.setTextColor(Color.rgb(255,255,255));
        question_counter = 2;
    }

    private void questionThree(){
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.yue_qi);
        Button buttonOne = (Button)findViewById(R.id.button_one);
        buttonOne.setText("琵琶");
        Button buttonTwo = (Button)findViewById(R.id.button_two);
        buttonTwo.setText("古筝");
        Button buttonThree = (Button)findViewById(R.id.button_three);
        buttonThree.setText("扬琴");
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("\"大珠小珠落玉盘\"所形容的是什么乐器的弹奏声");
        question_counter = 3;
    }

    private void questionFour(){
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.huo_yan_shan);
        Button buttonOne = (Button)findViewById(R.id.button_one);
        buttonOne.setText("甘肃");
        Button buttonTwo = (Button)findViewById(R.id.button_two);
        buttonTwo.setText("新疆");
        Button buttonThree = (Button)findViewById(R.id.button_three);
        buttonThree.setText("青海");
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("《西游记》中的火焰山位于");
        textView.setTextColor(Color.rgb(0,0,0));
        question_counter = 4;
    }

    private void questionFive(){
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.mei_ren);
        Button buttonOne = (Button)findViewById(R.id.button_one);
        buttonOne.setText("杨玉环");
        Button buttonTwo = (Button)findViewById(R.id.button_two);
        buttonTwo.setText("貂蝉");
        Button buttonThree = (Button)findViewById(R.id.button_three);
        buttonThree.setText("赵飞燕");
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("相传古代能作\"掌上舞\"的是");
        textView.setTextColor(Color.rgb(255,255,255));
        question_counter = 5;
    }

    private void questionSix(){
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.ri_chu);
        Button buttonOne = (Button)findViewById(R.id.button_one);
        buttonOne.setText("曹操");
        Button buttonTwo = (Button)findViewById(R.id.button_two);
        buttonTwo.setText("刘备");
        Button buttonThree = (Button)findViewById(R.id.button_three);
        buttonThree.setText("谢安");
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("\"东山再起\"这个典故出自于");
        question_counter = 6;
    }

    private void questionSeven(){
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.shu_yuan);
        Button buttonOne = (Button)findViewById(R.id.button_one);
        buttonOne.setText("东林书院");
        Button buttonTwo = (Button)findViewById(R.id.button_two);
        buttonTwo.setText("岳麓书院");
        Button buttonThree = (Button)findViewById(R.id.button_three);
        buttonThree.setText("白鹿书院");
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("历史上曾有的\"风声雨声读书声声声入耳，家事国事天下事事事关心\"对联是在");
        question_counter = 7;
    }

    private void questionEight(){
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.gu_zhuang);
        Button buttonOne = (Button)findViewById(R.id.button_one);
        buttonOne.setText("西施");
        Button buttonTwo = (Button)findViewById(R.id.button_two);
        buttonTwo.setText("貂蝉");
        Button buttonThree = (Button)findViewById(R.id.button_three);
        buttonThree.setText("杨玉环");
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("古代小说常用\"沉鱼落雁，闭月羞花\"形容女性之美，其中\"闭月\"是指");
        question_counter = 8;
    }

    private void questionNine(){
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.jing_ju);
        Button buttonOne = (Button)findViewById(R.id.button_one);
        buttonOne.setText("青衣");
        Button buttonTwo = (Button)findViewById(R.id.button_two);
        buttonTwo.setText("花旦");
        Button buttonThree = (Button)findViewById(R.id.button_three);
        buttonThree.setText("彩旦");
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("京剧中，饰演性格活泼、开朗的青年女性的应是");
        textView.setTextColor(Color.rgb(0,255,255));
        question_counter = 9;
    }

    private void questionTen(){
        Button buttonOne = (Button)findViewById(R.id.button_one);
        buttonOne.setVisibility(View.INVISIBLE);
        Button buttonTwo = (Button)findViewById(R.id.button_two);
        buttonTwo.setVisibility(View.INVISIBLE);
        Button buttonThree = (Button)findViewById(R.id.button_three);
        buttonThree.setVisibility(View.INVISIBLE);
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.hong_lou_meng);

        CheckBox checkBoxOne = (CheckBox)findViewById(R.id.box_one);
        checkBoxOne.setVisibility(View.VISIBLE);
        CheckBox checkBoxTwo = (CheckBox)findViewById(R.id.box_two);
        checkBoxTwo.setVisibility(View.VISIBLE);
        CheckBox checkBoxThree = (CheckBox)findViewById(R.id.box_three);
        checkBoxThree.setVisibility(View.VISIBLE);
        CheckBox checkBoxFour = (CheckBox)findViewById(R.id.box_four);
        checkBoxFour.setVisibility(View.VISIBLE);

        Button submit = (Button)findViewById(R.id.submit);
        submit.setVisibility(View.VISIBLE);
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText("下列哪些是形容林黛玉的");
        textView.setTextColor(Color.rgb(255,255,255));

    }

    public void submit(View view){
        CheckBox checkBoxOne = (CheckBox)findViewById(R.id.box_one);
        boolean isCheckOne = checkBoxOne.isChecked();

        CheckBox checkBoxTwo = (CheckBox)findViewById(R.id.box_two);
        boolean isCheckTwo = checkBoxTwo.isChecked();

        CheckBox checkBoxThree = (CheckBox)findViewById(R.id.box_three);
        boolean isCheckThree = checkBoxThree.isChecked();

        CheckBox checkBoxFour = (CheckBox)findViewById(R.id.box_four);
        boolean isCheckFour = checkBoxFour.isChecked();

        if (isCheckOne && (!isCheckTwo) && isCheckThree && (!isCheckFour)){
            score += 10;
        }
        end();
    }



    private void end(){
        ImageView imageView = (ImageView)findViewById(R.id.first_page_book);
        imageView.setImageResource(R.drawable.shi_juan);
        TextView textView = (TextView)findViewById(R.id.title);
        textView.setText(name + "的测试结果");
        textView.setTextColor(Color.rgb(255,0,0));
        textView.setTextSize(40);
        CheckBox checkBoxOne = (CheckBox)findViewById(R.id.box_one);
        checkBoxOne.setVisibility(View.INVISIBLE);
        boolean isCheckOne = checkBoxOne.isChecked();
        CheckBox checkBoxTwo = (CheckBox)findViewById(R.id.box_two);
        checkBoxTwo.setVisibility(View.INVISIBLE);
        boolean isCheckTwo = checkBoxOne.isChecked();
        CheckBox checkBoxThree = (CheckBox)findViewById(R.id.box_three);
        checkBoxThree.setVisibility(View.INVISIBLE);
        boolean isCheckThree = checkBoxOne.isChecked();
        CheckBox checkBoxFour = (CheckBox)findViewById(R.id.box_four);
        checkBoxFour.setVisibility(View.INVISIBLE);
        boolean isCheckFour = checkBoxOne.isChecked();
        Button submit = (Button)findViewById(R.id.submit);
        submit.setVisibility(View.INVISIBLE);
        TextView scoreText = (TextView)findViewById(R.id.score);
        scoreText.setVisibility(View.VISIBLE);
        String result = "" + score;
        scoreText.setText(result);
    }
}
