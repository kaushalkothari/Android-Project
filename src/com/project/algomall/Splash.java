package com.project.algomall;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer=new Thread(){
				public void run(){
					try{
							sleep(2000);
					     }
				    catch(InterruptedException e){
				    		e.printStackTrace();
						}
					finally{
						Intent openStartinPoint=new Intent("com.project.algomall.MAINACTIVITY");
							startActivity(openStartinPoint);
					    }
	

								}

								};timer.start();

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
}
