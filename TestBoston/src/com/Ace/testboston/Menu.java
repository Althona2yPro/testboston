package com.Ace.testboston;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {

	String classes[] = { "MainActivity", "EditTextView", "Example2", "Example3",
			"Example4", "Example5", "Example6", "Example7", "Example8" };
	String classes1[] = { "ãÔ ÚÇÑÝ", "love ", "ÐßÑ", "Anas",
			"Foto7", "Example5", "Example6", "Example7", "Example8" };
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1, classes1));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		try {
			String cheese = classes[position];
			Class ourClass = Class.forName("com.Ace.testboston." + cheese);
			Intent ourIntent = new Intent(Menu.this, ourClass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
