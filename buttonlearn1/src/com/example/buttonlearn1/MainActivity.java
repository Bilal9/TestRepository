package com.example.buttonlearn1;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private Button btn1;
	private Button btn2;
	private Button btn3;
 	String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        
        btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        
        btn3=(Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);
      
      
    }
    public void onClick(View v){
      
   
    	if (v.getId()==R.id.button1){
		text = btn1.getText().toString();
		//Textpass=text;
	
	 //Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    	}
    	if (v.getId()==R.id.button2){
    		 text = btn2.getText().toString();
    		//Textpass=text;
    	// Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
        	}
    	if (v.getId()==R.id.button3){
    		 text = btn3.getText().toString();
    		//Textpass=text;
    	 //Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
        	} 
    	Intent myintent = new Intent(MainActivity.this,Display1.class);
    	myintent.putExtra("mytext",text);
    	MainActivity.this.startActivity(myintent);
    	
    	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
