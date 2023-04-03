package com.example.ex230331;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);//xml의 Button과 java를 연결해주는 명령어..

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast = 화면 하단에 뜨는 팝업 알림의 명칭, LENGTH_SHORT는 알림이 떠있는 시간을 짧게 한다는 의미.
                Toast.makeText(getApplicationContext(),"버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}