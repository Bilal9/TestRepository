package com.twistedequations.fragmentsexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class ElementsDetailActivity extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		setContentView(R.layout.elements_details_activity);
		super.onCreate(savedInstanceState);
		
		Intent intent=this.getIntent();
		Bundle element=intent.getBundleExtra("bundle");
		
		Fragment ElementDetails=new elementDetailFragment();
		ElementDetails.setArguments(element);
		
		FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id.ElementsDetailFrame, ElementDetails);
		transaction.commit();
		
	}
	

}
