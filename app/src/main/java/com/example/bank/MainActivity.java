package com.example.bank;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.ru, R.string.russian,R.string.russianRUB));
        list.add(new DataFlags(R.drawable.za, R.string.africa,R.string.africaZAR));
        list.add(new DataFlags(R.drawable.jp, R.string.singapore,R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.ru, R.string.russian,R.string.russianRUB));
        list.add(new DataFlags(R.drawable.ru, R.string.russian,R.string.russianRUB));

        MyListAdapter myListAdapter = new MyListAdapter(this,list);
        listView.setAdapter(myListAdapter);
    }

    @Override
    public void onItemClick (AdapterView<?> parent, View view, int position, long id){
        Toast.MakeText(this, ((DataFlags)((MyListAdapter)parent).getItem(position)).header, Toast.LENGTH_LONG).show();
    }
}