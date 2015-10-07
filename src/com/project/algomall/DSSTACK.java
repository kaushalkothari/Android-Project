package com.project.algomall;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


public class DSSTACK extends Activity implements OnClickListener {
	Button b1,b2;
	 ListView l;
	 EditText e;
	 int x=-1;
	ArrayList<String> a=new ArrayList<String>();
	ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dsstack);
		 l=(ListView)findViewById(R.id.list);
	        b1=(Button)findViewById(R.id.button1    );
	        b2=(Button)findViewById(R.id. Button01     );
	       
	        e =(EditText)findViewById(R.id.editText1  );
	        b1.setOnClickListener(this);
	        b2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dsstack, menu);
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
				ArrayList<String> a1=new ArrayList<String>();
			l.setVisibility(View.INVISIBLE );
				x++;
		//	a.add(""+x);
			a.add(x,e.getText().toString());
			for(int i=0;i<a.size();i++)
				a1.add(a.get(i));
			Collections.reverse(a1);
			l.setVisibility(View.VISIBLE );
			  Toast.makeText(getApplicationContext(), e.getText().toString()+" IS PUSHESD", Toast.LENGTH_LONG).show();

	        adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1 ,a1);
	        b2.setEnabled(true );

			l.setAdapter(adapter);			 
			l.setVisibility(View.VISIBLE) ;

			e.setText("");
			}
		}
		if(v==b2)
		{
			ArrayList<String> a1=new ArrayList<String>();

	          x--;
			int size=a.size();
			  l.setVisibility(1);
	          b2.setEnabled(false);

			  Toast.makeText(getApplicationContext(), a.get(size-1) +"IS POPPED", Toast.LENGTH_SHORT).show();

			  
			  a.remove(size-1);
			  if(x>-1)
			  {
					for(int i=0;i<a.size();i++)
						a1.add(a.get(i));
					Collections.reverse(a1);

				//  Collections.reverse(a1);
			  adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1 ,a1);
			  l.setVisibility(1);
	          b2.setEnabled(true );

				l.setAdapter(adapter);
			  }
			  else
			  {
				  
				  l.setVisibility(View.INVISIBLE) ;
				  Toast.makeText(getApplicationContext(),"Stack is empty", Toast.LENGTH_LONG).show();
	                b2.setEnabled(false );
	                
			  
		       }
			  }
	}
		
	}


