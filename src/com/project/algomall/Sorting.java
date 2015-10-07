package com.project.algomall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Sorting extends Activity implements OnClickListener{
	Button b;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sorting_web);
		TabHost th=(TabHost)findViewById(R.id.tabs);
        th.setup();
        TabSpec ts=th.newTabSpec("tag1");
        ts.setContent(R.id.lL1);
        ts.setIndicator("Theory");
           th.addTab(ts);
         ts=th.newTabSpec("tag2");
        ts.setContent(R.id.lL2);
        ts.setIndicator("Examples");
        th.addTab(ts);
        WebView view1= (WebView) findViewById(R.id.theorywebview);
		view1.setVerticalScrollBarEnabled(false);
		view1.loadUrl("file:///android_asset/sorting_theory.html");
		
		 WebView view2= (WebView) findViewById(R.id.examplewebview);
			view2.setVerticalScrollBarEnabled(false);
			view2.loadUrl("file:///android_asset/sorting_example.html");		       
			b=(Button)findViewById(R.id.sorting);
			b.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		MenuInflater blowup=getMenuInflater();
		blowup.inflate(R.menu.main, menu);

		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		return false;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b)
		{
			Intent i=new  Intent(getApplicationContext(),DSSORT.class);
		startActivity(i);
			
		}
	
	}
}





