package com.example.leesohyun.exam01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView tv;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv_hellow);
        btn = (Button)findViewById(R.id.btn);



    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.btn :
                //버튼 눌렀을때
                tv.setText("메세지를 변경 합니다");
                btn.setText("버튼이 클릭 되었습니다");
                break;

        }

    }

}
