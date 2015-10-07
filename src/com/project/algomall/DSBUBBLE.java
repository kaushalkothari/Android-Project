package com.project.algomall;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.graphics.Color;
import java.util.ArrayList;
import android.R.bool;
import android.R.interpolator;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DSBUBBLE extends Activity implements OnClickListener {
	ArrayList<Integer> number=new ArrayList<Integer>();
	   ArrayList<TextView> t=new ArrayList<TextView>();
		Button b1,b2,b3;
		EditText e,e1;
		//e.setTextColor(Color.RED);
		int x=-1;
		LinearLayout l,l1;
		int cnt=1;
		int limit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dsbubble);
		l=(LinearLayout)findViewById(R.id.l1);
		l1=(LinearLayout)findViewById(R.id.l2);
        l1.setOrientation(1);
		e=(EditText)findViewById(R.id.txtnum);
		e1=(EditText)findViewById(R.id.EditText01);
		b1=(Button)findViewById(R.id.button1 );
		b2=(Button)findViewById(R.id.Button01 );
		b3=(Button)findViewById(R.id.btnbubble );
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dsbubble, menu);
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
				limit=Integer.parseInt(e.getText().toString());
				e.setEnabled(false);
			e.setText("");
			
			
			}
		}
		if(v==b2)
		{
			
			if(cnt<=limit)
			
			{
				x++;
				TextView t1=new TextView(getApplicationContext());
				t1.setText(e1.getText().toString());
				t1.setId(x);
				t1.setHeight(50);
				t1.setWidth(100);
				int a=Integer.parseInt(e1.getText().toString());
				number.add(a);
				t.add(t1);
				l.addView(t.get(x));
				e1.setText("");
				cnt++;
			
			}
		
		}
		if(v==b3)
		{
			sortarray(number);
			
			
			
		}
		
		
	}
	void sortarray(ArrayList<Integer> num)
	{
		

			
		boolean swap=true;
		while(swap)
		{
			swap=false;
		for(int i=0;i<num.size()-1;i++)
		{

			 
			LinearLayout lin=new LinearLayout(getApplicationContext());
			lin.setLayoutParams(new LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 100));
				
			if(num.get(i)>num.get(i+1))
			{
				int temp=num.get(i);
				num.set(i, num.get(i+1));
				num.set(i+1, temp);
				swap=true;
				
			
				
			}
		
			for(int j=0;j<num.size();j++)
			{
			
				{
				TextView t1=new TextView(getApplicationContext());
				t1.setWidth(100);
				t1.setHeight(30);
				t1.setText(""+num.get(j));
				lin.addView(t1);
				}
			}
			l1.addView(lin);
		}
	
		
		
	   }
		//LinearLayout lin=new LinearLayout(getApplicationContext());

	
		
	
		
		
		Toast.makeText(getApplicationContext(), ""+num, Toast.LENGTH_LONG).show();
	}
	
	}


