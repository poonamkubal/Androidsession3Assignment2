package com.example.poonam.vibgyor;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btn_red, btn_orange, btn_yellow, btn_green, btn_blue, btn_indigo, btn_violet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      btn_red = (Button)findViewById(R.id.button);
        btn_orange = (Button)findViewById(R.id.button2);
        btn_yellow = (Button)findViewById(R.id.button3);
        btn_green = (Button)findViewById(R.id.button4);
        btn_blue = (Button)findViewById(R.id.button5);
        btn_indigo = (Button)findViewById(R.id.button6);
        btn_violet = (Button)findViewById(R.id.button7);

        btn_red.setOnClickListener(this);
        btn_orange.setOnClickListener(this);
        btn_yellow.setOnClickListener(this);
        btn_green.setOnClickListener(this);
        btn_blue.setOnClickListener(this);
        btn_indigo.setOnClickListener(this);
        btn_violet.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(getApplicationContext(),"First colour is Red",Toast.LENGTH_LONG).show();
                Log.i("MyActivity", "First colour is Red" );
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "Second colour is Orange", Toast.LENGTH_LONG).show();
                Log.i("MyActivity", "Second colour is Orange");
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(),"Third colour is Yellow",Toast.LENGTH_LONG).show();
                Log.i("MyActivity", "Third colour is Yellow");
                break;
            case R.id.button4:
                Log.i("MyActivity", "Fourth colour is Red" );
                Toast.makeText(getApplicationContext(),"First colour is Green",Toast.LENGTH_LONG).show();
                Log.i("MyActivity", "Fourth colour is Green");
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(),"Fifth colour is Blue",Toast.LENGTH_LONG).show();
                Log.i("MyActivity", "Fifth colour is Blue");
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(),"Sixth colour is Indigo",Toast.LENGTH_LONG).show();
                Log.i("MyActivity", "Sixth colour is Indigo");
                break;
            case R.id.button7:
                Toast.makeText(getApplicationContext(),"Seventh colour is Violet",Toast.LENGTH_LONG).show();
                Log.i("MyActivity", "Seventh colour is Violet");
                break;

        }
    }
}
