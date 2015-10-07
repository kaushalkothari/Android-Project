package com.project.algomall;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Menu_ds extends ListActivity{
	String Classes[]={"Stack","Queue","Lists","Trees","Graphs"};
	/*int [] images={
			R.drawable.ic_launcher,
			
	};*/
	@Override
			protected void onCreate(Bundle savedInstanceState) {
				// TODO Auto-generated method stub
				super.onCreate(savedInstanceState);
				//setContentView(R.layout.list_ds);
				//ListView lv=(ListView) findViewById(R.id.listView1);
				setListAdapter(new ArrayAdapter<String>(Menu_ds.this,android.R.layout.simple_list_item_1,Classes));
				
				
				//slv.setOnItemClickListener((OnItemClickListener) this);
			}

			@Override
			protected void onListItemClick(ListView l, View v, int position, long id) {
				// TODO Auto-generated method stub
				super.onListItemClick(l, v, position, id);
				//System.out.println("1111");
				String cheese=Classes[position];
				try{
					Class ourClass=Class.forName("com.project.algomall."+ cheese);
					Intent i=new Intent(Menu_ds.this,ourClass);
					startActivity(i);
					//Toast.makeText(getApplication(), "success..!",Toast.LENGTH_LONG).show();
				}
				catch(Exception e){
					e.printStackTrace();		
				}
			}

			
		}


