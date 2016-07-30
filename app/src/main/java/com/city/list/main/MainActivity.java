package com.city.list.main;

import java.io.File;
import java.util.ArrayList;

import com.city.list.db.DBManager;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
	/** Called when the activity is first created. */

	Button btn;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btn = (Button) findViewById(R.id.selectBtn);
		btn.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				startActivity(new Intent(MainActivity.this, CityList.class));

			}
		});
	}

}