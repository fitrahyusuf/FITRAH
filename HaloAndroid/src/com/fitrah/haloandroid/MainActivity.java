package com.fitrah.haloandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	/** called when the activity is first created. */
	
	@Override
	public  void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		TextView tv=new TextView(this);
		tv.setText("Halo android.. :D");
		setContentView(tv);
	}

    /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/


/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
