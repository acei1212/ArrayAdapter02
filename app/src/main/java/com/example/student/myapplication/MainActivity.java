package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    SimpleAdapter adapter;
    ArrayList<Map<String,Object>> mydata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        HashMap<String,Object> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        m1.put("img", R.drawable.taipei);
        mydata.add(m1);
        HashMap<String,Object> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        m2.put("img", R.drawable.taichung);
        mydata.add(m2);
        HashMap<String,Object> m3 = new HashMap<>();
        m3.put("city", "高雄");
        m3.put("code", "07");
        m3.put("img", R.drawable.kaohsing);
        mydata.add(m3);
        adapter = new SimpleAdapter(MainActivity.this,
                mydata,
                R.layout.myitem,
                new String[]{"city", "code", "img"},
                new int[]{R.id.textView, R.id.textView2, R.id.imageView});
        lv.setAdapter(adapter);


    }

}
