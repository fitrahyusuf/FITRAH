package com.fitrah.radiobutton;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class RadioButton extends Activity implements
		RadioGroup.OnCheckedChangeListener {

	RadioGroup orientation;
	RadioGroup gravity;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		orientation = (RadioGroup) findViewById(R.id.orientation);
		orientation.setOnCheckedChangeListener(this);
		gravity = (RadioGroup) findViewById(R.id.gravity);
		gravity.setOnCheckedChangeListener(this);
	}

	public void onCheckedChanged(RadioGroup group, int checkId) {
		switch (checkId) {
		case R.id.horizontal:
			orientation.setOrientation(LinearLayout.HORIZONTAL);
			break;
		case R.id.vertical:
			orientation.setOrientation(LinearLayout.VERTICAL);
			break;
		case R.id.kiri:
			gravity.setGravity(Gravity.LEFT);
			break;
		case R.id.tengah:
			gravity.setGravity(Gravity.CENTER);
			break;
		case R.id.kanan:
			gravity.setGravity(Gravity.RIGHT);
			break;

		}

	}

}
