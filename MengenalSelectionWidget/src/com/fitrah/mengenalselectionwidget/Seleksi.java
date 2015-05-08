package com.fitrah.mengenalselectionwidget;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Seleksi extends ListActivity {
	/** Called when the activity is first created. */
	TextView Seleksi;
	String[] pilihan = { "Merbabu", "Merapi", "Lawu", "Rinjani", "Sumbing",
			"Sindoro", "Krakatau", "Selat Sumda", "Selat bali", "Selat Malaka",
			"Kalimanatan", "Sulawesi", "Jawa" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, pilihan));
		Seleksi = (TextView) findViewById(R.id.yangDipilih);
	}

	public void onListItemClick(ListView parent, View v, int position, long id) {
		Seleksi.setText(pilihan[position]);
	}
}