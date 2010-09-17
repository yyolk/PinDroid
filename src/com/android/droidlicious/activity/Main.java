package com.android.droidlicious.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class Main extends Activity {

	WebView mWebView;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		Intent i = new Intent(this, BrowseTags.class);
		
		startActivity(i);
		
		finish();
	}

}
