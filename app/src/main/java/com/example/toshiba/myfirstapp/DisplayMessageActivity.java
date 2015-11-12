package com.example.toshiba.myfirstapp;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_message);

        //Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        //Create a TextView
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        //add the TextView as the root view of the activity layout by passing it to setContentView()
        setContentView(textView);

//        if(savedInstanceState == null){
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment()).commit();
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
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

    //A placeholder fragment containing a simple view
    public static class PlaceholderFragment extends Fragment{
        public PlaceholderFragment(){}

        @Override
        public View onCreateView(LayoutInflater inflater
                ,ViewGroup container, Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.activity_display_message, container, false);
                                                //     ^ This is wrong on the tutorial
            return rootView;
        }
    }
}
