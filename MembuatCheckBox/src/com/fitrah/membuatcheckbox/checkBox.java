package com.fitrah.membuatcheckbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;




public class checkBox extends Activity implements OnCheckedChangeListener {
	CheckBox cb;

	// called when thee activity is first created
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		cb = (checkBox)findViewById(R.id.check);
		cb.setOnCheckedChangeListener(this);

	}

	public void onCheckedChange(CompoundButton buttonView, boolean isChecked) {

		if (isChecked) {
			cb.setText("checkBox ini: Dicentang!");
		} else {
			cb.setText("checkBox ini: Tidak Dicentang!");
		}
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		
	}

}