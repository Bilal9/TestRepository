package com.twistedequations.fragmentsexample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ElementListFragment extends Fragment implements OnItemClickListener
{

	String tag=this.getClass().getSimpleName();
	ListView ElementsList;
	ArrayAdapter<String> adapter;
	Context context;
	ElementsListClickHandle handler;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.i(tag,"onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		Log.i(tag,"onAttach");
		
		super.onAttach(activity);
	try 
	{
		handler = (ElementsListClickHandle) getActivity();
		
	}
	catch(ClassCastException ex) {
		Log.i(tag,"Activity" + getActivity().getClass().getSimpleName() + "Doesnt implement it");
	}
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
		ElementsList.setOnItemClickListener(this);
		return view;
	}

	public interface ElementsListClickHandle 
	{
		public void onHandelElementClick(int position);
		
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View view, int position, long arg3) {
		
		handler.onHandelElementClick(position);
	}

}
