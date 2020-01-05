package com.example.mypriorityshrikant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] arr={"Watching Discovery","Watching Animal Planet","Building  Cool  projects","Competitive Programming","Exploring","Learning New Skills","Reading Books","Listening Music","Playing Cricket","Preffered Mobile Game:cricket,football,pubg,mini_miletia"};

        ListAdapter theAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1
        , arr);
        ListView thelistview=(ListView)findViewById(R.id.layout);
        thelistview.setAdapter(theAdapter);//we tells the listview what data we want to use


        thelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String select="YOU HAVE SELECTED: "+String.valueOf(parent.getItemAtPosition(position)+"As Your "+"Preference Number"+String.valueOf(position+1));
                Toast.makeText(MainActivity.this, select, Toast.LENGTH_SHORT).show();
                if(position==0 || position==1){
                    Toast.makeText(MainActivity.this, "YOU ARE A WILDLIFE LOVER", Toast.LENGTH_SHORT).show();
                }
                else if(position==2){
                    Toast.makeText(MainActivity.this, "YOU LOVE PRACTICAL KNOWLEDGE", Toast.LENGTH_SHORT).show();
                }
                else if(position==3){
                    Toast.makeText(MainActivity.this, "GREAT!!,YOU MIGHT BE HAVING STRONG PROBLEM SOLVING SKILLS ", Toast.LENGTH_SHORT).show();
                }
                else if(position==4){
                    Toast.makeText(MainActivity.this, "YOU LOOK CURIOUS", Toast.LENGTH_SHORT).show();
                }
                else if(position==5){
                    Toast.makeText(MainActivity.this, "YOU MIGHT BE HAVING HIGH IQ", Toast.LENGTH_SHORT).show();
                }
                else if(position==6 || position==7){
                    Toast.makeText(MainActivity.this, "YOU MIGHT BE HAVING HIGH IQ", Toast.LENGTH_SHORT).show();
                }
                else if(position==8){
                    Toast.makeText(MainActivity.this, "THE MOST FAMOUS OUTDOOR GAME OF INDIA", Toast.LENGTH_SHORT).show();
                }
                else if(position==9){
                    Toast.makeText(MainActivity.this, "DON'T GET ADDICTED", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
