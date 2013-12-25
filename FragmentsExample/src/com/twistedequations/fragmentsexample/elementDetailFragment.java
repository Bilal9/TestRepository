package com.twistedequations.fragmentsexample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class elementDetailFragment extends Fragment 
{

	//Context context;
	//ListView ElementsList;
//	ArrayAdapter<String> adapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view;
		
		view=inflater.inflate(R.layout.elements_detail_fragments, container,false);
		
		TextView text=(TextView)view.findViewById(R.id.DetialsText);
		Bundle element=this.getArguments();
		int position=element.getInt("position");
		
String[] elementsDetail=getActivity().getResources().getStringArray(R.array.ElementInfoArray);
		text.setText(elementsDetail[position]);
	//	ElementsList= (ListView) view.findViewById(R.id.ElementsList);
		//adapter=new ArrayAdapter<String>(context, R.layout.elements_detail_fragments, R.id.Elements_text_listtext, elements);
		//ElementsList.setAdapter(adapter);
		//ElementsList.setOnItemClickListener(this);
		return view;
	}
	

}
