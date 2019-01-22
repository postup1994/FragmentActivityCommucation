package com.mycompany.myapp2;

import android.support.v4.app.FragmentManager;
import android.os.*;
import com.tony.app.*;
import android.support.design.widget.*;
import android.widget.*;
import android.view.View.*;
import com.tony.annotation.*;
import android.view.*;


public class MainActivity extends MzActivity
{

	
	

	

	private EditText name, image;
	private Button btnCheck;
	private GetStrings g;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
		g = new CustomDialog();
		
		name = findViewById(R.id.name);
		image = findViewById(R.id.image);
		btnCheck = findViewById(R.id.actionBtn);
		btnCheck.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					g.setName(name.getText().toString());
					g.setUrl(image.getText().toString());
					FragmentManager fm = getSupportFragmentManager();
					CustomDialog c = new CustomDialog();
					c.show(fm, c.getClass().getSimpleName());
				
				}
			});
		

    }
}
