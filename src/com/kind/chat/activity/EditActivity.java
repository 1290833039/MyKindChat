package com.kind.chat.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditActivity extends BaseActivity{
	private EditText editText;


	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(com.kind.chat.R.layout.activity_edit);
		
		editText = (EditText) findViewById(com.kind.chat.R.id.edittext);
		String title = getIntent().getStringExtra("title");
		String data = getIntent().getStringExtra("data");
		if(title != null)
			((TextView)findViewById(com.kind.chat.R.id.tv_title)).setText(title);
		if(data != null)
			editText.setText(data);
		editText.setSelection(editText.length());
		
	}
	
	
	public void save(View view){
		setResult(RESULT_OK,new Intent().putExtra("data", editText.getText().toString()));
		finish();
	}
}
