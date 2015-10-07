package com.project.algomall;

import java.util.ArrayList;

import java.util.List;

import android.R.integer;
import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class TREEActivity extends Activity implements android.view.View.OnClickListener{
	TextView t1,t2,t3,t4,t5,t6,t7;
ArrayList<Integer> pre=new ArrayList<Integer>();
ArrayList<Integer> inorder1=new ArrayList<Integer>();
ArrayList<Integer> post=new ArrayList<Integer>();


	 Button b1;
	  EditText e1;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_tree);
			 b1=(Button)findViewById(R.id.button1);

			 e1=(EditText)findViewById(R.id.editText1);

			b1.setOnClickListener(this);
			
			t1=(TextView)findViewById(R.id.textView1);
			t2=(TextView)findViewById(R.id.textView2);
			t3=(TextView)findViewById(R.id.textView3);
			t4=(TextView)findViewById(R.id.textView4);
			t5=(TextView)findViewById(R.id.textView5);
			t6=(TextView)findViewById(R.id.textView6);
			t7=(TextView)findViewById(R.id.textView7);
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}

	
		
	 class Node{
		
	
		   	int obj;
			 Node left;
			 Node right;

//	private  final String Node = "1";
	public Node (int obj)
	{
		this.obj=obj;
		
	}
		

	 } 
	 
	 

	 

	 
	 
	
	 
	
public class bst
{
	public Node root;
	public bst insert(int value)
	{
		Node node=new Node(value);
		if(root==null)
		
		{
			root=node;
			return this;
		}
		
		
	insertrec(root,node);
	return this;
	}
	
	
	private void insertrec(Node latestroot,Node node)
	{
		if(latestroot.obj> node.obj)
		{
			if(latestroot.left==null)
			{
				latestroot.left=node;
				return;
			}
			else
				insertrec(latestroot.left, node);
		}
		
		else
			{
			if(latestroot.right==null)
		  {
			  latestroot.right=node;
		    	return;
	    	}
	    	   else
			   insertrec(latestroot.right, node);
		   }
	   }
	
	
 	
	
                 public void printinorder()
                 {
                	 inorder(root);
                	 Log.d("msg", "");
                 }
                 
                 void inorder(Node root)
            	 {
            		 if(root==null) return;
            		 inorder(root.left);
            		  inorder1.add(root.obj);
            		//	Toast.makeText(getApplicationContext(), ""+root.getnodevlue(), Toast.LENGTH_SHORT).show() ;
            		 inorder(root.right);	
                   }
                 
                 
                 void printpreorder()
                 {
                	 preorder(root);
                	 Log.d("msg", "");
                 }
                 
                 void preorder(Node root)
            	 {
            		 if(root==null) return;
            		 pre.add(root.obj);
            		//Toast.makeText(getApplicationContext(), ""+root.getnodevlue(), Toast.LENGTH_SHORT).show() ;
            		
            		preorder(root.left);
            		 preorder(root.right);
                 
	           }
                  void printpostorder()
                 {
                	  postorder(root);
                	 Log.d("msg", "");
                 }

                 
                 void postorder(Node root)
            	 {
            		 if(root==null) return;
            		 postorder(root.left);
            		 postorder(root.right);
            	 post.add(root.obj);
            		//Toast.makeText(getApplicationContext(), ""+root.getnodevlue(), Toast.LENGTH_SHORT).show() ;	
                  }
                 


	 } //bst
	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b1)
		{
			pre.clear();
			post.clear();
			inorder1.clear();
			
			bst b=new bst();
           b.insert(40);
           b.insert(25);
           b.insert(78);
           b.insert(10);
           b.insert(3);
           b.insert(17);
           b.insert(32);
           
           
           
		b.printinorder();
		b.printpreorder();
		b.printpostorder();
			
		t1.setText(""+inorder1.get(3));
		t2.setText(""+inorder1.get(1));
		t3.setText(""+inorder1.get(5));
		t4.setText(""+inorder1.get(0));
		t5.setText(""+inorder1.get(2));
		t6.setText(""+inorder1.get(4));
		t7.setText(""+inorder1.get(6));



		
		
		
			Toast.makeText(getApplicationContext(), "PREORDER  "+pre, Toast.LENGTH_LONG).show();
			Toast.makeText(getApplicationContext(), "POSTORDER  "+post, Toast.LENGTH_LONG).show();
			Toast.makeText(getApplicationContext(), "INORDER  "+inorder1, Toast.LENGTH_LONG).show();

		}
	
	 }

}

