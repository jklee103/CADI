package com.example.a0.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView memView;
    private ArrayList<Member> memberList;
    private MemAdapter memAdapter;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        memView=(ListView)findViewById(R.id.memView);
        memberList=new ArrayList<>();
        memberList.add(new Member("이재경","15학번"));
        memberList.add(new Member("박재경","11학번"));
        memberList.add(new Member("김재경","12학번"));
        memberList.add(new Member("최재경","13학번"));
        memberList.add(new Member("가재경","14학번"));
        memberList.add(new Member("나재경","15학번"));
        memberList.add(new Member("다재경","16학번"));
        memberList.add(new Member("라재경","17학번"));
        memberList.add(new Member("마재경","11학번"));
        memberList.add(new Member("바재경","12학번"));
        memberList.add(new Member("사재경","13학번"));
        memberList.add(new Member("아재경","14학번"));
        memberList.add(new Member("자재경","15학번"));

        memAdapter=new MemAdapter(memberList, MainActivity.this);
        memView.setAdapter(memAdapter);

    }

}
