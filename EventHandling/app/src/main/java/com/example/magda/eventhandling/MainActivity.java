package com.example.magda.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gumb = (Button)findViewById(R.id.magdinButton);

        gumb.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view){
                        TextView onajtekst = (TextView)findViewById(R.id.magdinText);
                        onajtekst.setText("promjena klik");
                    }

                }
        );

        //kada imamo longClick moramo vraćati boolean u smislu da kada smo gotovi vratimo true da je to odrađeno
        //kada returnamo true ostaje promijenjeno. kada returnamo false bude promijenjeno samo za vrijeme dugog klika
        gumb.setOnLongClickListener(
                new Button.OnLongClickListener()
                {
                    public boolean onLongClick(View view){
                        TextView onajtekst = (TextView)findViewById(R.id.magdinText);
                        onajtekst.setText("promjena dugi klik");
                       return false;
                    }

                }
        );

    }

    /*
    //jedan način je da sve radimo u onCreate, stavimo listener i super (kao iznad).
    //drugi je funkcija ispood, ali tada moramo staviti u xml android:onClick="changeText"

    public void changeText(View view){
        TextView onajtekst = (TextView)findViewById(R.id.magdinText);
        onajtekst.setText("radi i ovo");

    }
    */

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
