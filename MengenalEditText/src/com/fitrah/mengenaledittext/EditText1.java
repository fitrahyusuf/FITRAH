package com.fitrah.mengenaledittext;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;


public class EditText1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
    	EditText 
    	fld = (EditText)findViewById(R.id.field);
		fld.setText("Halo widget text halo halo");
    	
    }
}
