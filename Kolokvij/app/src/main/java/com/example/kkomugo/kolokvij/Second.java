package com.example.kkomugo.kolokvij;

import android.app.SearchManager;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    
    public String dobiven;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        
        dobiven=getIntent().getStringExtra("sport");
        Toast.makeText(this, getIntent().getStringExtra("sport"), Toast.LENGTH_LONG).show();
    }

    public void googleit(View view){
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
        intent.putExtra(SearchManager.QUERY, dobiven);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        RelativeLayout boja= (RelativeLayout)findViewById(R.id.druga);
        switch (item.getOrder()) {
            case 1:
                boja.setBackgroundColor(Color.WHITE);
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                return true;
            case 2:
                boja.setBackgroundColor(Color.RED);
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);

                return true;


        }
        return false;

    }
}
