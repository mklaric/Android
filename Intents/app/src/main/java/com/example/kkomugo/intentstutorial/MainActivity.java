package com.example.kkomugo.intentstutorial;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
    public void onClick(View view){
        Intent i= new Intent(this, Bacon.class);
        final EditText applesInput= (EditText) findViewById(R.id.applesInput);
        String userMessage = applesInput.getText().toString();
        i.putExtra("appleMessage", userMessage);


        startActivity(i);
    }*/

    public void thirdA(View v)
    {
        Intent i = new Intent(this, ThirdActivity.class);

        i.putExtra("str1","Ovo je prvi string");
        i.putExtra("br1",25);

        Bundle extras=new Bundle();
        extras.putString("str2","Ovo je drugi string");
        extras.putInt("br2",27);
        i.putExtras(extras);

        i.setData(Uri.parse("neki tekst treci"));

        startActivity(i);

    }

    public void openBrowser(View v)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));

    }

    public void openMaps(View v)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.7749,-122.4194")));
    }

    public void dial(View v)
    {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +385996983888")));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
