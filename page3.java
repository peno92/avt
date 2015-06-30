package com.nmnmnm.avt;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class page3 extends ActionBarActivity {

    public  final  static  String THIEF2 = "com.nmnmnm.avt.THIEF2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page3, menu);
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

    public void onColorClick(View v){

        Intent answerColor = new Intent();

        switch (v.getId()){
            case R.id.radioRed:
                answerColor.putExtra(THIEF2, R.string.red);
                break;

            case R.id.radioBlue:
                answerColor.putExtra(THIEF2, R.string.blue);
                break;

            case R.id.radioGreen:
                answerColor.putExtra(THIEF2, R.string.green);
                break;
            default:
                break;
        }
        setResult(RESULT_OK, answerColor);
        finish();
    }
}
