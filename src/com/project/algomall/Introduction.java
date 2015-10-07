package com.project.algomall;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Introduction extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.introduction_web);
		TabHost th=(TabHost)findViewById(R.id.tabs);
        th.setup();
        TabSpec ts=th.newTabSpec("tag1");
        ts.setContent(R.id.lL1);
        ts.setIndicator("Theory");
           th.addTab(ts);
          WebView view1= (WebView) findViewById(R.id.theorywebview);
		view1.setVerticalScrollBarEnabled(false);
		view1.loadUrl("file:///android_asset/introduction_theory.html");
		
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
}





