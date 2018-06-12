package com.example.sairam.invision;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

public class MainActivity extends AppCompatActivity {

    RecyclerView invisionRecyclerView;
    InvisionRecyclerAdapter invisionRecyclerAdapter;
    RecyclerView.LayoutManager layoutManager;

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle((Html.fromHtml("<font color=\"#5B5E60\">" + "Gaming Mouses" + "</font>")));
       /* actionBar= this.getSupportActionBar();
        this.getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.argb(255, 255, 255, 255)));

       */ /*Spannable text = new SpannableString(actionBar.getTitle());
        text.setSpan(new ForegroundColorSpan(Color.BLUE), 0, text.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        actionBar.setTitle("Gaming Mouses");
*/
        invisionRecyclerView= (RecyclerView) findViewById(R.id.invision_recyclerView);
        invisionRecyclerAdapter= new InvisionRecyclerAdapter(MainActivity.this);
        layoutManager= new LinearLayoutManager(MainActivity.this);
        invisionRecyclerView.setLayoutManager(layoutManager);
        invisionRecyclerView.setAdapter(invisionRecyclerAdapter);
    }

}
