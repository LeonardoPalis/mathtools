package com.example.mathtoolsfinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menuprincipal extends Activity {

	private Button btFer,btSai;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menuprincipal);
		
		btFer.findViewById(R.id.button1);
		/*btSai.findViewById(R.id.button2);

		btFer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it1 = new Intent("com.mathtools.OPCAOS");
				startActivity(it1);
				
			}
		});
		
		btSai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
	}
	*/
}}
