package com.Ace.testboston;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class EditTextView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_text);
		final TextView tv_edit = (TextView) findViewById(R.id.tvedittext);
		final EditText et_edit = (EditText) findViewById(R.id.etPassword);
		Button b_edit = (Button) findViewById(R.id.b_edittext);
		final ToggleButton tb_edit = (ToggleButton) findViewById(R.id.tbedittext);

		tb_edit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tb_edit.isChecked()) {
					et_edit.setInputType(InputType.TYPE_CLASS_TEXT
							| InputType.TYPE_TEXT_VARIATION_PASSWORD);
				} else {
					et_edit.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}

		});
		b_edit.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				String check = et_edit.getText().toString();

				if (check.contentEquals("left")) {
					tv_edit.setTextColor(Color.BLUE);
					tv_edit.setGravity(Gravity.LEFT);
					tv_edit.setTextSize(125);
				} else if (check.contentEquals("love")) {
					Random crazy = new Random();
					tv_edit.setText("I Love You");
					tv_edit.setTextSize(crazy.nextInt(75));
					tv_edit.setTextColor(Color.argb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));

				}
			}
		});

	}
}
