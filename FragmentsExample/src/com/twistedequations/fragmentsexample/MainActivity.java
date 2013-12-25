package com.twistedequations.fragmentsexample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends FragmentActivity implements ElementListFragment.ElementsListClickHandle{
	
	String tag=this.getClass().getSimpleName();
	boolean dualpane;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onHandelElementClick(int position) {
		Bundle element=new Bundle(); 
		element.putInt("position",position);

		Log.i(tag, "Clicked at Position "+ position);
		Intent intent=new Intent(this, ElementsDetailActivity.class);
		intent.putExtra("bundle", element);
		startActivity(intent);
		
		
	}


	

	
}
