package com.nmnmnm.avt;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class page2 extends ActionBarActivity {
    public  final  static  String THIEF = "com.nmnmnm.avt.THIEF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page2, menu);
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

    public void onMarkClick(View v){

        Intent answerMark = new Intent();

        switch (v.getId()){
            case R.id.radioMazda:
                answerMark.putExtra(THIEF, "Mazda");
                break;

            case R.id.radioFord:
                answerMark.putExtra(THIEF, "Ford");
                break;

            case R.id.radioBMW:
                answerMark.putExtra(THIEF, "BMW");
                break;
            default:
                break;
        }
        setResult(RESULT_OK, answerMark);
        finish();
    }
}