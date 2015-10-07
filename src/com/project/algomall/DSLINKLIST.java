package com.project.algomall;

import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.app.Activity;
import android.view.Menu;

public class DSLINKLIST extends Activity implements OnClickListener {
	Button b1,b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dslinklist);
		 b1=(Button)findViewById(R.id.btnsinglly);
	        b2=(Button)findViewById(R.id. btndoublly);
	        
	        b1.setOnClickListener(this);
	        b2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dslinklist, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b1)
		{
			Intent i=new Intent(getApplicationContext(), DSSINGLLY.class);
			startActivity(i);
		}
		if(v==b2)
		{
			Intent i=new Intent(getApplicationContext(), DSDOUBLLY.class);
			startActivity(i);
		}
		
	}
	}


