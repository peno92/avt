package com.nmnmnm.avt;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class page1 extends ActionBarActivity {
    private TextView markTextView;
    private TextView colorTextView;

    static  final  private  int CHOOSE_THIEF = 0;
    static  final  private  int CHOOSE_THIEF2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        markTextView = (TextView)findViewById(R.id.textView2);
        colorTextView = (TextView)findViewById(R.id.textView4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page1, menu);
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

    public  void  onClick1(View v) {
        Intent questionMark = new Intent(page1.this, page2.class);
        startActivityForResult(questionMark, CHOOSE_THIEF);
    }
    public  void  onClick2(View v) {
        Intent questionColor = new Intent(page1.this, page3.class);
        startActivityForResult(questionColor, CHOOSE_THIEF2);
    }
    @Override
     protected void onActivityResult(int reqMark, int resMark, Intent data){
    super.onActivityResult(reqMark, resMark, data);
    if (reqMark == CHOOSE_THIEF) {
        if (resMark == RESULT_OK) {
            String markmane = data.getStringExtra(page2.THIEF);
            markTextView.setText(markmane);

        }else {
            markTextView.setText("");
        }
    }if (reqMark == CHOOSE_THIEF2) {
        if (resMark == RESULT_OK) {
            String colorname = data.getStringExtra(page3.THIEF2);
            colorTextView.setText(colorname);

        }else {
            colorTextView.setText("");
        }
    }

}
}
