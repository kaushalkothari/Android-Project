package com.project.algomall;

//import com.project.algomall.R.layout;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu_daa extends ListActivity {

	String Classes[]={"Introduction","DivideAndConquer","GreedyMethod",
			"DynamicProgramming","Backtracking","BasicTraversal","SearchTechniques"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu_daa.this,android.R.layout.simple_list_item_1,Classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		//System.out.println("1111");
		String cheese=Classes[position];
		try{
			Class ourClass=Class.forName("com.project.algomall."+ cheese);
			Intent i=new Intent(Menu_daa.this,ourClass);
			startActivity(i);
			//Toast.makeText(getApplication(), "success..!",Toast.LENGTH_LONG).show();
		}
		catch(Exception e){
			e.printStackTrace();		
		}
	}

	

	
}
