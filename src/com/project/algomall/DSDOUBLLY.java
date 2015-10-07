package com.project.algomall;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DSDOUBLLY extends Activity implements OnClickListener {
	ArrayList<LinearLayout> l1=new ArrayList<LinearLayout>();
	ArrayList<LinearLayout> l2=new ArrayList<LinearLayout>();

	ArrayList<Integer> number=new ArrayList<Integer>();
	int x=-1;
	EditText e,e1;
	Button b1,b2,b3,b4,b5;
	LinearLayout linearlayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dsdoublly);
		linearlayout=(LinearLayout)findViewById(R.id.l1);
		 b1=(Button)findViewById(R.id.btnadd);
		// b2=(Button)findViewById(R.id.btninsertlast);
		 b3=(Button)findViewById(R.id.btndellast);
		 b4=(Button)findViewById(R.id.btninsertfirst);
		 b5=(Button)findViewById(R.id.btndelfirst);

		 e=(EditText)findViewById(R.id.editText1);
		 e1=(EditText)findViewById(R.id.editText2);

		b1.setOnClickListener(this);
		//b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dsdoublly, menu);
		return true;
	}
	LinearLayout addtextview()
	{
 
		
		
		
		x++;
	   	   LinearLayout l=new LinearLayout(getApplicationContext());
	   l.setLayoutParams(new LayoutParams(200, 150));
	   	l.setOrientation(0);
	   	
	    ImageView iv1=new ImageView(getApplicationContext());
	    iv1.setLayoutParams(new LayoutParams(40, 40));
	   	 iv1.setImageResource(R.drawable. background);
	   	 l.addView(iv1);
			
	   		TextView t=new TextView(getApplicationContext());
	   	   t.setLayoutParams(new LayoutParams(40, 40));
			t.setHeight(50);
			t.setWidth(100);
		     number.add(Integer.parseInt( e.getText().toString()));
		     
		     t.setText( e.getText().toString());
		      t.setTextSize(15);
	   	 l.addView(t);
	   	 ImageView iv=new ImageView(getApplicationContext());
	     iv.setLayoutParams(new LayoutParams(40, 40));
	   	 iv.setImageResource(R.drawable.background);
	   	 l.addView(iv);

	//	t.setTextAlignment(Gravity.CENTER);
	   	 return l;
		
		
		
	}

    /*@Override
    public void onBackPressed() {
    	Intent i=new Intent(getApplication(),Menu_acc.class);
    	startActivity(i);
    }*/
    
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b1)
		{
			if(e.getText().toString().equals(""))
			{
				Toast.makeText(getApplicationContext(), "Enter data", Toast.LENGTH_LONG).show();
			}
			else
			{
			LinearLayout l= addtextview();
			l1.add(l);

			linearlayout.addView(l1.get(x));
			e.setText("");
			}
			
		}
		if(v==b3)
		{

		  linearlayout.removeView(l1.get(x));
			x--;
int size=l1.size();
		  l1.remove(size-1);
		  number.remove(number.size()-1);
		  Toast.makeText(getApplicationContext(), "Element Removed From Last", Toast.LENGTH_LONG).show();
		  
		}
		
		if(v==b4)
			
		{
			if(e.getText().toString().equals(""))
				
			{
				Toast.makeText(getApplicationContext(), "Enter data", Toast.LENGTH_LONG).show();

			}
			else
			{
			LinearLayout l= addtextview();
			
			l1.add(0, l);
		
			
			linearlayout.removeAllViews();
			
			for(int i=0;i<l1.size();i++)
			{
				
				linearlayout.addView(l1.get(i));
			}
			e.setText("");
			}

		}
		if(v==b5)
		{

			linearlayout.removeView(l1.get(0));
			x--;

		  l1.remove(0);
		  number.remove(0);
		  Toast.makeText(getApplicationContext(), "Element Removed From First", Toast.LENGTH_LONG).show();
		  
			

		}

	}

}



