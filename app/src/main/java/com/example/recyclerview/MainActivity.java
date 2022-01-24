package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();




    }

    private void initData() {

        userList= new ArrayList<>();

        userList.add(new ModelClass(R.drawable.gi,"Mahamud","Hey! I am Mahamud, How are you?","10.46 PM"));
        userList.add(new ModelClass(R.drawable.bo,"Najib","Kire ki korirs? xm kobe?","12.39 PM"));
        userList.add(new ModelClass(R.drawable.girl,"Tuba","Oi shun, ektu meet a aste parbi?","11.16 PM"));
        userList.add(new ModelClass(R.drawable.boy,"Siam","Ki mahmud koi acho?","9.26 PM"));
        userList.add(new ModelClass(R.drawable.bo,"Aurobita","Mahmud achis?","10.46 PM"));
        userList.add(new ModelClass(R.drawable.gi,"Farhan","Mama achos, ektu ber hote parbi?","2:47 PM"));
        userList.add(new ModelClass(R.drawable.girl,"Nafisa","kmn achis?🙂","10.46 PM"));
        userList.add(new ModelClass(R.drawable.boy,"Sumiya","Hi!","10.46 PM"));
        userList.add(new ModelClass(R.drawable.bo,"Maruf","Ki koro?","3:14 AM"));

    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();



    }
}