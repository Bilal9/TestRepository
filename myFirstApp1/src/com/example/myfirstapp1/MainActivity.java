package com.example.myfirstapp1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;;
public class MainActivity extends Activity {

	private Button savebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        savebtn=(Button) findViewById(R.id.TestButton);
      //  savebtn.SetOnClickListener(new On))
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
