package com.Ace.testboston;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button Aywa = (Button) findViewById(R.id.b_main);
		Aywa.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Aywa.setText("7alawa");
				TextView ScreenText = (TextView) findViewById(R.id.tv_main);
				ScreenText.setText("Peace Ya Man");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
