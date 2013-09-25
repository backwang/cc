package com.bk.ui;

import com.bk.cc.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 
	}
	/***
	 * 打开‘我的路书’
	 * @param view
	 */
	public void Roadbook_OnClick(View view) {
		Intent intent = new Intent();
		intent.setClass(this, RoadbookActivity.class);
		startActivity(intent);
		
	}
}
