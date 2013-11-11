package com.example.listview;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView listview; 
	String[] planets;
	Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context=this;
		listview=(ListView) findViewById(R.id.listView);
		
		
	 planets=this.getResources().getStringArray(R.array.Planetsarray); 
		
		ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this,R.layout.listviewrow,R.id.TextView, planets);
		listview.setAdapter(Adapter);
		listview.setOnItemClickListener(new ClickListHander());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	private class ClickListHander implements OnItemClickListener 
	{
		
		@Override
		public void onItemClick(AdapterView<?> arg0, View view, int position,long arg3) {
			TextView listtext = (TextView) view.findViewById(R.id.TextView);
			String text=listtext.getText().toString();
			
			Toast.makeText(context, text+"Click at position "+position, Toast.LENGTH_SHORT).show();
			
		}
		
	}
}
