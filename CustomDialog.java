package com.skyestudios.app;
import android.support.v4.app.*;
import android.widget.*;
import android.os.*;
import android.view.*;

public class CustomDialog extends DialogFragment implements GetStrings
{

	@Override
	public void setName(String s)
	{
		// TODO: Implement this method
		name.setText(s);
	}

	@Override
	public void setUrl(String s)
	{
		// TODO: Implement this method
		url.setText(s);
	}
	
	
	private static String titlee;
	private TextView name, url;
	
	public CustomDialog(){}
	
	public static CustomDialog newIns(String title){
		titlee = title;
		CustomDialog c = new CustomDialog();
		Bundle b = new Bundle();
		b.putString("title", title);
		c.setArguments(b);
		return c;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		return inflater.inflate(R.layout.custom, container);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onViewCreated(view, savedInstanceState);
	    name = view.findViewById(R.id.name);
		url = view.findViewById(R.id.url);
	}
	

}
