package com.example.leesohyun.hw01;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv; //문제1
    EditText edit; //답칸1
    Button btn; //확인버튼
    int score; //점수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Loading 액티비티 실행하는 부분
        Intent intent = new Intent(this, Loading.class);
        startActivity(intent);

        tv = (TextView) findViewById(R.id.tv_1); //텍스트뷰 아이디
        edit = (EditText) findViewById(R.id.ed_1); //에딧텍스트 아이디
        btn = (Button) findViewById(R.id.btn_1); //버튼 아이디
    }
    //edit꺼 값 가져와서 확인 버튼 누른 후 값이 보석바랑 같으면 다음페이지로 넘겨
    public void Onclick(View v){
        switch(v.getId()){
            case R.id.btn_1:
                String msg = edit.getText().toString(); //edit 값 문자로 가져와 -> msg로 받아

                String answer = "보석바"; //답이 보석바 임

                if(msg.equals(answer)) { //만약 msg값이 answer이랑 같으면
                    Intent intent = new Intent(this, SecondActivity.class); //SecondActivity로 넘어감
                    startActivity(intent);

                    score++; //정답 +1점
                }
        }

    }


}






