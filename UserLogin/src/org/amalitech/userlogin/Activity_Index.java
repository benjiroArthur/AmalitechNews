package org.amalitech.userlogin;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Index extends Activity {

	ImageView user_img_iv;
	EditText email_et, pswd_et;
	Button signup_btn;
	TextView login_tv;
	
	int email_lf_i = 8;
	int password_lf_i = 8;
	int email_lf_i_max = 45;
	int password_lf_i_max = 32;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index_layout);
		user_img_iv = (ImageView) findViewById(R.id.user_img_iv);
		email_et = (EditText) findViewById(R.id.email_et);
		pswd_et = (EditText) findViewById(R.id.pswd_et);
		signup_btn = (Button) findViewById(R.id.signup_btn);
		login_tv = (TextView) findViewById(R.id.login_tv);
		
		signup_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(v.getId()==signup_btn.getId()) {
					//login_tv.setText("Sign Up Now");
					//get user input from email textbox and trim all white spaces before and after the text
					
				
					
					
					et_validator(email_et);
				}
			}

			/**
			 * @param et_email_cntnt_str_len
			 */
			private boolean et_validator(EditText email_et) {
				boolean et_valid_bool = false;
				
				String et_email_cntnt_str = email_et.getText().toString().trim();
				
				//get the length of the email
				int et_email_cntnt_str_len = et_email_cntnt_str.length();
				//check for mim=nimum length
				if(et_email_cntnt_str_len < email_lf_i) 
				{
					//email is not qualified
					email_et.setBackgroundColor(Color.RED);
					et_valid_bool = false;
				}
				else {
					if(et_email_cntnt_str_len <= email_lf_i_max) 
					{
						//qualified
						email_et.setBackgroundColor(Color.WHITE);
						et_valid_bool = true;
					}
					else
					{
						//not qualified
						email_et.setBackgroundColor(Color.GRAY);
						et_valid_bool = false;
					}
				}
				return et_valid_bool;
			}
		});
		
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
