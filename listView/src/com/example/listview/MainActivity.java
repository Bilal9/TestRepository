package com.example.listview;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView listview; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listview=(ListView) findViewById(R.id.listView);
		
		
		//String [] planets=this.getResources().getStringArray(R.array.Planetsarray); 
		
		ArrayAdapter Adapter = new ArrayAdapter(this,R.array.Planetsarray);
		listview.setAdapter(Adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
