package com.project.algomall;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import java.util.ArrayList;
import java.util.Collections;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DSBINARYSEARCH extends Activity implements OnClickListener {
	ArrayList<TextView> a=new ArrayList<TextView>(5);
	LinearLayout l;
	Button b1,b2;
	int x=-1;
	int c,n;
	EditText e,e1;
	ArrayList<Integer> number=new ArrayList<Integer>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dsbinarysearch);

		e=(EditText)findViewById(R.id.txtnum);
		e1=(EditText)findViewById(R.id.editText2  );
		l=(LinearLayout )findViewById(R.id.lay );
		b1=(Button)findViewById(R.id.btnaddnumber );
		b2=(Button)findViewById(R.id.btnsearchnumber );
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dsbinarysearch, menu);
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
			addtextview(); 
		    
			e.setText("");
			}
		}
		
		if(v==b2)
		{
			Collections.sort(number);
			for(int i=0;i<a.size();i++)
				a.get(i).setText(number.get(i).toString());
			
			
			if(e1.getText().toString().equals(""))
			{
				Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
			}
			else 
			{ 
			 
			int n=Integer.parseInt(e1.getText().toString());
			int size=number.size();
			int first=0;
			int last=size-1;
			int mid=(first+last)/2;
			while(first<=last)
			{
				Toast.makeText(getApplicationContext(), "mid is now ="+mid, Toast.LENGTH_LONG).show();

				a.get(mid).setBackgroundColor(Color.GREEN);
				if(number.get(mid)==n)
				{
					a.get(mid).setBackgroundColor(Color.WHITE);
					Toast.makeText(getApplicationContext(), "number is found at at"+(mid+1), Toast.LENGTH_LONG).show();
				    break;
				}
		
				
				
				else  if(number.get(mid)<n)
				{
					first=mid+1;
					
				}
				
				else
					last=mid-1;
				mid=(first+last)/2;
		
				
			}
			if(first>last)
				Toast.makeText(getApplicationContext(), "number is  not present" , Toast.LENGTH_LONG).show();
			}
		}
		
	}

	
	
	void addtextview()
	{

		
	   	   
	   		x++;
			
	   		TextView t=new TextView(getApplicationContext());
			t.setHeight(100);
			t.setWidth(100);
		      t.setText(e.getText().toString());
		      t.setTextSize(15);
	   	      a.add(t);
	   	    int num=Integer.parseInt(e.getText().toString());
	   	    number.add(num);
	//	t.setTextAlignment(Gravity.CENTER);
		
		
		
		
		l.addView(a.get(x));
	}

	}
