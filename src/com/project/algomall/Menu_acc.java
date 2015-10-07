package com.project.algomall;

//import com.project.algomall.R.layout;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu_acc extends ListActivity {

	String Classes[]={"StorageClasses","Recursion","StringProcessing",
	"Pointers","Files","AlgorithmAnalysis","Searching","Sorting","Hashing"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.list_acc);
		setListAdapter(new ArrayAdapter<String>(Menu_acc.this,android.R.layout.simple_list_item_1,Classes));
		//setContentView(R.layout.list_acc);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese=Classes[position];
		
		try{
			Class ourClass=Class.forName("com.project.algomall."+ cheese);
			Intent i=new Intent(Menu_acc.this,ourClass);
			startActivity(i);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();		
		}
	}

	
}
