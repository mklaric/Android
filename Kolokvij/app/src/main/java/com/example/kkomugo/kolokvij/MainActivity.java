package com.example.kkomugo.kolokvij;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] sportevi;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ListView prviView = getListView();
        prviView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        prviView.setTextFilterEnabled(true);
        sportevi = getResources().getStringArray(R.array.sports);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, sportevi));

    }

    public void onListItemClick(ListView parent, View v, int position, long id){
        if(position==0)
            openOptionsMenu();
        else {
            Intent i = new Intent(this, Second.class);
            i.putExtra("sport", sportevi[position]);
            startActivity(i);
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        ListView boja = getListView();
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
