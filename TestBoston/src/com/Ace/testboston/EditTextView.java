package com.Ace.testboston;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
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
		TextView tv_edit = (TextView) findViewById(R.id.tvedittext);
		final EditText et_edit = (EditText) findViewById(R.id.etPassword);
		Button b_edit = (Button) findViewById(R.id.b_edittext);
		final ToggleButton tb_edit = (ToggleButton) findViewById(R.id.tbedittext);
		
		tb_edit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				if (tb_edit.isChecked()){
					et_edit.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}else{
					et_edit.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
			
		});
		
		
		
	}

}
