package com.example.buttonlearn1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Display1 extends Activity implements OnClickListener{
  
	TextView mTextview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display1);
		 mTextview = (TextView)findViewById(R.id.textView1);

	       mTextview.setText(getIntent().getStringExtra("mytext"));
	    //   show=mTextview.toString();
	 // textshow= (TextView) findViewById(R.id.);
	 //   textshow.setText(R.id.button1);
	 //  Toast.makeText(getApplicationContext(),  show, Toast.LENGTH_LONG).show();
	}
	 public void onClick(View v){
	      

	    
	    	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display1, menu);
		return true;
	}

}
