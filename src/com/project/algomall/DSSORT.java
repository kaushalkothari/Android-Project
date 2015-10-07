package com.project.algomall;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DSSORT extends Activity implements OnClickListener {
	 Button b1,b2,b3,b4,b5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dssort);
		b1=(Button)findViewById(R.id.btn1);
       b2=(Button)findViewById(R.id. Button01);
       b3=(Button)findViewById(R.id.Button02);
       
       b1.setOnClickListener(this);
       b2.setOnClickListener(this);
      b3.setOnClickListener(this);
     //  b4.setOnClickListener(this);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b1)
		{
			Intent i=new Intent(getApplicationContext(), DSBUBBLE.class);
			startActivity(i);
		}
		if(v==b2)
		{
			Intent i=new Intent(getApplicationContext(), DSSELECTION.class);
			startActivity(i);
		}
		if(v==b3)
		{
			Intent i=new Intent(getApplicationContext(), DSINSESRTION.class);
			startActivity(i);
		}
		/*if(v==b4)
		{
			Intent i=new Intent(getApplicationContext(),DSQUICKSORT.class);
			startActivity(i);
		}
		if(v==b5)
		{
			Intent i=new Intent(getApplicationContext(),QOUCK_SORT.class);
			startActivity(i);
		}*/
	}

}
