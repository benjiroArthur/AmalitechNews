package com.amalitech.amalitechnews;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/*
@author : SD and the wizard
@description : This activity would be used for
multiple instance of creating someting new, eg.
1. Creating new account
2. Creating a new post
3. Creating a new comment or feedback
4. Creating a new payment order

*/

public class Activity_Inputer extends Activity {

	ImageView iv_img;
	EditText et_email, et_pswd_0, et_pswd_1;
	Button bttn_sign_up;
	
	//when ever the intent is received,
	//we would have to check on the intent payload
	// to see what the new instruction would be.
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.input_layout);
		
		//Reference all relevant ids here 
		iv_img = (ImageView)findViewById(R.id.iv_img);
		et_email = (EditText)findViewById(R.id.et_email);
		et_pswd_0 = (EditText)findViewById(R.id.et_pswd_0);
		et_pswd_1 = (EditText)findViewById(R.id.et_pswd_1);
		bttn_sign_up = (Button)findViewById(R.id.bttn_sign_up);
		
		//do default visibilities {  GONE, INVISIBLE, VISIBLE  }
		et_pswd_1.setVisibility(View.GONE);
		
		
		//doing on click listening . . . 
		bttn_sign_up.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v){
				
				if(et_validator_bool (et_pswd_0, et_pswd_min_lnf, et_pswd_max_lnf)) {
					et_pswd_1.setVisibility(View.VISIBLE);
				}else{
					et_pswd_1.setVisibility(View.GONE);
				}
				
				if(et_validator_bool(et_email, et_mail_min_lnf, et_mail_max_lnf)
				&& et_validator_bool (et_pswd_0, et_pswd_min_lnf, et_pswd_max_lnf)
				&& et_validator_bool (et_pswd_1, et_pswd_min_lnf, et_pswd_max_lnf)
				&& et_compare(et_pswd_0, et_pswd_1)){
					
					Intent main_news_page_intent = new Intent(Activity_Inputer.this, Activity_MainNewsPage.class);
					
					startActivity(main_news_page_intent);
					
					finish();
					
				}else {
					
					
					
				}
				
			}
		});
		
		
	}
	
	int et_mail_min_lnf = 8, et_mail_max_lnf=45,
			et_pswd_min_lnf = 8, et_pswd_max_lnf=32;
	
	
	public boolean et_validator_bool(
			EditText et,
			int et_min_lnf,
			int et_max_lnf
	){
		
		boolean et_valid_bool = false;
		
		String et_str = et.getText().toString().trim();
		int et_countr_i = et_str.length();
		
		if(et_countr_i < et_min_lnf){
			et.setBackgroundColor(Color.RED);
			et_valid_bool = false;
		}else {
			if(et_countr_i <= et_max_lnf){
				et.setBackgroundColor(Color.WHITE);
				et_valid_bool = true;
			}else {
				et.setBackgroundColor(Color.GRAY);
				et_valid_bool = false;
			}
		}
		
		return et_valid_bool;
		
	}

	public boolean et_compare(EditText et_0, EditText et_1) {
		//boolean et_0_n_et_1_equal = false;
		String et_0_str = et_0.getText().toString();
		String et_1_str = et_1.getText().toString();
		
		if(et_0_str.equals(et_1_str)){
			et_0.setBackgroundColor(Color.WHITE);
			et_1.setBackgroundColor(Color.WHITE);
			return true;
		}else{
			et_0.setBackgroundColor(Color.RED);
			et_1.setBackgroundColor(Color.RED);
			return false;
		}
		
		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	

}
