package com.duowan.lifecycledemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.duowan.util.LogCat;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LogCat.d("onCreate:");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		LogCat.d("onCreateOptionsMenu:");
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		LogCat.d("onOptionsItemSelected:");
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public Object getLastCustomNonConfigurationInstance() {
		LogCat.d("onRetainCustomNonConfigurationInstance:");
		return super.getLastCustomNonConfigurationInstance();
	}
	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		LogCat.d("onNewIntent:");
	}

	@Override
	protected void onRestart() {
		LogCat.d("onRestart:");
		super.onRestart();
	}
	
	@Override
	public void onStart() {
		LogCat.d("onStart:");
		super.onStart();
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		LogCat.d("onRestoreInstanceState:");
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		LogCat.d("onPostCreate:");
	}

	@Override
	public void onResume() {
		LogCat.d("onResume:");
		super.onResume();
	}

	@Override
	public void onPause() {
		LogCat.d("onPause:");
		super.onPause();
	}

	@Override
	public CharSequence onCreateDescription() {
		CharSequence onCreateDescription = super.onCreateDescription();
		LogCat.d("onCreateDescription: ");
		if(onCreateDescription!=null){
			LogCat.d("onCreateDescription:  CharSequence = "
					+ onCreateDescription.toString());
		}
		return onCreateDescription;
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		LogCat.d("onSaveInstanceState:");
	}

	@Override
	public void onStop() {
		LogCat.d("onStop:");
		super.onStop();
	}
	
	@Override
	public Object onRetainCustomNonConfigurationInstance() {
		LogCat.d("onRetainCustomNonConfigurationInstance:");
		return super.onRetainCustomNonConfigurationInstance();
	}

	@Override
	public void onDestroy() {
		LogCat.d("onDestroy:");
		super.onDestroy();
	}
}
