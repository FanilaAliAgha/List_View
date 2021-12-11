package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.listview);

        ArrayList<person> arrayList= new ArrayList<>();


        arrayList.add(new person(R.drawable.item1,"Alaya","Hello its me  Allaya","19/8/2021","10:45 Am"));
        arrayList.add(new person(R.drawable.item2,"Arisha","Hello its me  Arisha","23/8/2021","01:30 PM"));
        arrayList.add(new person(R.drawable.item3,"Sara","Happy Birthday girl!","01/12/2021","12:00 Am"));

        arrayList.add(new person(R.drawable.item4,"Zain","Hello  Zain Khan here","29/12/2021","08:00 PM"));
        arrayList.add(new person(R.drawable.five,"Afan","I am Afan Ahmed","14/9/2021","06:40 PM"));
        arrayList.add(new person(R.drawable.six,"Suman","I am Suman Farhan","22/12/2021","02:00 AM"));
        arrayList.add(new person(R.drawable.item7,"Hamza","I am Hamza Ali","24/12/2021","02:02 PM"));
        arrayList.add(new person(R.drawable.item8,"Murtaza","I am Murtaz,CR","29/12/2021","08:30 PM"));
        arrayList.add(new person(R.drawable.item9,"Azeem","I am Your teacher","15/10/2021","09:00 AM"));
        arrayList.add(new person(R.drawable.item10,"Qurban","I am Your teacher","05/12/2021","12:00 PM"));



        //custome adapter

        personAdapter PersonAdapter= new personAdapter(this,R.layout.list_item,arrayList);
        listview.setAdapter(PersonAdapter);

    }
}