package com.project.algomall;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
public class DSSINGLLY extends Activity implements OnClickListener {
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
		setContentView(R.layout.activity_dssinglly);
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
		getMenuInflater().inflate(R.menu.dssinglly, menu);
		return true;
	}
	LinearLayout addtextview()
	{
 
		
		
		
		x++;
	   	   LinearLayout l=new LinearLayout(getApplicationContext());
	   l.setLayoutParams(new LayoutParams(100, 60));
	   	l.setOrientation(0);
			
	   		TextView t=new TextView(getApplicationContext());
			t.setHeight(50);
			t.setWidth(70);
		     number.add(Integer.parseInt( e.getText().toString()));
		     
		     t.setText( e.getText().toString());
		      t.setTextSize(15);
	   	 l.addView(t);
	   	 ImageView iv=new ImageView(getApplicationContext());
	   	 iv.setImageResource(R.drawable.arrow);
	   	 l.addView(iv);
	//	t.setTextAlignment(Gravity.CENTER);
	   	 return l;
		
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b1)
		{
	if(e.getText().toString().equals(""))
				
			{
				Toast.makeText(getApplicationContext(), "enter data", Toast.LENGTH_LONG).show();

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
		  Toast.makeText(getApplicationContext(), "ELEMENT REMOVED", Toast.LENGTH_LONG).show();
		  
		}
		
		if(v==b4)
			
		{
	if(e.getText().toString().equals(""))
				
			{
				Toast.makeText(getApplicationContext(), "enter data", Toast.LENGTH_LONG).show();

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
		  Toast.makeText(getApplicationContext(), "ELEMENT REMOVED", Toast.LENGTH_LONG).show();
		  
			
		}
		
	}

	}


