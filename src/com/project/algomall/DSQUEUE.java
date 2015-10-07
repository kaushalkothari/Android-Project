package com.project.algomall;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class DSQUEUE extends Activity implements OnClickListener{
	TextView t;
	 EditText e;
	 int x=-1;
	 int y=0; 
	 Button b1,b2; 
	 ListView l;
	 ArrayList<String> a=new ArrayList<String>();
	 ArrayAdapter<String> adapter;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dsqueue);
		  l=(ListView)findViewById(R.id.list);
	        b1=(Button)findViewById(R.id.button1 );
	        b2=(Button)findViewById(R.id.button2 );
	        e =(EditText)findViewById(R.id.editText1  );
	        b1.setOnClickListener(this);
	        b2.setOnClickListener(this);
	        if(x==-1)
	        	Toast.makeText(getApplicationContext(), "QUEUE is empty", Toast.LENGTH_SHORT ).show();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dsqueue, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b1)
		{
			if(e.getText().toString().equals(""))
			{
				Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
			}
			else
			{
			x++;
			a.add(x,e.getText().toString());
	        adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1 ,a);
			 Toast.makeText(getApplicationContext(), e.getText().toString()+" ADDED to Queue", Toast.LENGTH_LONG).show();

			l.setAdapter(adapter);
			e.setText("");
			// l.setVisibility(View.VISIBLE) ;

		}
		}
		if(v==b2)
		{
	       
			//int size=a.size();
			if(y<=x)
			{
			 
			 Toast.makeText(getApplicationContext(), a.get(y)+" is REMOVES", Toast.LENGTH_SHORT).show();
                
			 // a.remove(y);
           a.set(y, "");
			 
			 adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1 ,a);

				l.setAdapter(adapter);
				y++;
			}
			
			else{
				
				 Toast.makeText(getApplicationContext(), "Queue is empty", Toast.LENGTH_LONG).show();

			}

				
				

		}
		}
		
	}


