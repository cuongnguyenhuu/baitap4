package com.nhc.cuongnguyen.baitap4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button change ;
    GridView listview;
    ArrayList<String> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        change = (Button) findViewById(R.id.btn_change);
        listview = (GridView) findViewById(R.id.view);
        listview.setNumColumns(3);
        array = new ArrayList<>();
        array.add("C/C++");
        array.add("Java");
        array.add("Android");
        array.add("IOS");
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listview.getNumColumns()==3){
                    change.setText("GridView");
                    listview.setNumColumns(1);
                }
                if(listview.getNumColumns()==1){
                    change.setText("ListView");
                    listview.setNumColumns(3);
                }
            }
        });
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,array);
        listview.setAdapter(adapter);
        listview.deferNotifyDataSetChanged();
    }
}
