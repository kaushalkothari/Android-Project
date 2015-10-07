package com.project.algomall;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import java.lang.reflect.Array;
import java.util.ArrayList;

import android.R.integer;
import android.R.string;
import android.os.Bundle;
import android.renderscript.Int2;
import android.renderscript.Int3;
import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DSLINEARSEARCH extends Activity implements OnClickListener{
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
		setContentView(R.layout.activity_dslinearsearch);
		e=(EditText)findViewById(R.id.txtnum);
		e1=(EditText)findViewById(R.id.editText2);
		l=(LinearLayout )findViewById(R.id.lay );
		b1=(Button)findViewById(R.id.button1 );
		b2=(Button)findViewById(R.id.button2 );
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dslinearsearch, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b2)
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
		if(v==b1)
		{
			if(e1.getText().toString().equals(""))
			{
				Toast.makeText(getApplicationContext(), "Enter the number", Toast.LENGTH_SHORT).show();
			}
			else 
			{
		 n=Integer.parseInt(e1.getText().toString());
		// n=Integer.parseInt(e1.getText().toString());
		
		
	    //  n=4;
		 
	   for( c=0;c<number.size();c++)
	    {
	    	if(number.get(c)==n)
	    	{
	    		
	    		  a.get(c).setBackgroundColor(Color.CYAN);
				  Toast.makeText(getApplicationContext(),""+n + "  is present at position  " +(c+1)+".", Toast.LENGTH_LONG).show();

	    	}
	    	
	    	//if(number.get(c)!=n)
	    	else
	    	{
				  Toast.makeText(getApplicationContext(),""+n+"  is not present ", Toast.LENGTH_SHORT).show();

	    	}
	    	//	  Toast.makeText(getApplicationContext(),""+n+"  is not present ", Toast.LENGTH_SHORT).show();

	    	}
	    }
			}
		}
		
		
		void addtextview()
		{

			 x++;
				
		   		TextView t=new TextView(getApplicationContext());
				t.setHeight(50);
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


