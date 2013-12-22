package com.twistedequations.fragmentsexample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ElementListFragment extends Fragment
{

	String tag=this.getClass().getSimpleName();
	ListView ElementsList;
	ArrayAdapter<String> adapter;
	Context context;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.i(tag,"onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		Log.i(tag,"onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i(tag,"onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		Log.i(tag,"onCreateView");
		context=getActivity();
		View view;
		view=inflater.inflate(R.layout.elements_list_fragments, container,false);
		String[] elements=context.getResources().getStringArray(R.array.ElementsArray);
		
		ElementsList= (ListView) view.findViewById(R.id.ElementsList);
		adapter=new ArrayAdapter<String>(context, R.layout.elemients_list_row, R.id.Elements_text_listtext, elements);
		ElementsList.setAdapter(adapter);
		return view;
	}


}
