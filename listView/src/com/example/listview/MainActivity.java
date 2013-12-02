package com.example.listview;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
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
	LayoutInflater inflater;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context=this;
		listview=(ListView) findViewById(R.id.listView);
		
		
	 planets=this.getResources().getStringArray(R.array.Planetsarray); 
		
	 Planetadapter Adapter = new Planetadapter(this,R.layout.listviewrow,R.id.TextView,planets);
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
	
	private class Planetadapter extends ArrayAdapter<String>
	{
		private String[] planets;
		listTextClickListener Listener=new listTextClickListener();
	
		public Planetadapter(Context context,int Resource,int textViewResuorceId,String[] planets )
		{
			super(context,Resource,textViewResuorceId,planets);
			this.planets= planets;
		
		}

		@Override
		public View getView(int position, View view, ViewGroup parent) {
			
			  View row;
			LayoutInflater inflater=getLayoutInflater();
			
		//	row=inflater.inflate(R.layout.listviewrow, parent, false);
			
			
			if(position%2==0){ 
				View viewleft=inflater.inflate(R.layout.listviewrow,parent,false);
				row=viewleft;
			}
			else{
				View viewright=inflater.inflate(R.layout.listview_right,parent,false);
				row=viewright;	
			}
			String planetName= planets[position];
					
			TextView Label=(TextView)row.findViewById(R.id.TextView);	
			Label.setOnClickListener(Listener);
			Label.setText(planetName);
		
			return row;
		}
		
		private class listTextClickListener implements OnClickListener
		{

			@Override
			public void onClick(View view)
			{
			TextView Clicked=(TextView) view;
			Toast.makeText(context,Clicked.getText().toString() +" Text Clicked",Toast.LENGTH_SHORT).show();	
			}
			
			
		}
		
	}
}
