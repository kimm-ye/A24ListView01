package com.kosmo.a24listview01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "KOSMO123";
    String[] idolGroup = {"엑소", "방탄", "워너원","뉴이스트", "갓세븐", "비투비", "빅스",
            "엑소2", "방탄2", "워너원2","뉴이스트2", "갓세븐2", "비투비2", "빅스2",
            "엑소3", "방탄3", "워너원3","뉴이스트3", "갓세븐3", "비투비3", "빅스3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        리스트 뷰의 데이터로 사용할 어댑터 객체 생성 및 배열 설정
        형식]
            new ArrayAdapter<>(컨택스트, 리스트뷰의모양, 데이터(배열 혹은 JSON));
         */
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, idolGroup);

        //리스트뷰 위젯을 객체화한다.
        ListView listView1 = findViewById(R.id.listView1);
        //리스트뷰에 어댑터객체를 설정한다.
        listView1.setAdapter(adapter);
        //리스트뷰에 리스너 부착
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                //각 항목을 클릭했을때 index가 전달된다.
                Log.d(TAG, "선택한index : " +position); //로그캣에 출력
                //선택한 항목을 토스트로 출력한다.
                Toast.makeText(getApplicationContext(), idolGroup[position]+" 선택됨",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}