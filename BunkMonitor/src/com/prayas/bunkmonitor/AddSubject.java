package com.prayas.bunkmonitor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddSubject extends Activity implements OnClickListener {
	Button sub ;
	EditText name ;
	EditText prof ;
	EditText note ;
	String Name,Prof,Note ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subject_input) ;
		sub=(Button)findViewById(R.id.bSubmitSubject);
		name=(EditText)findViewById(R.id.etName) ;
		prof=(EditText)findViewById(R.id.etProf) ;
		note=(EditText)findViewById(R.id.etNote) ;
		sub.setOnClickListener(this) ;
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==sub.getId()){
			Name=name.getText().toString() ;
			Prof=prof.getText().toString() ;
			Note=note.getText().toString() ;
			Toast.makeText(getApplicationContext(), Name, Toast.LENGTH_SHORT).show() ;
			Toast.makeText(getApplicationContext(), Prof, Toast.LENGTH_SHORT).show() ;
			Toast.makeText(getApplicationContext(), Note, Toast.LENGTH_SHORT).show() ;
			finish() ;
		}
	}

}
