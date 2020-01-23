package com.amalitech.amalitechnews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity_MainNewsPage extends Activity {

	TextView tab_1;
	Button bttn_base_0, bttn_base_1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_news_page_layout);
		
		//Reference ui elements
		tab_1 = (TextView )findViewById(R.id.tab_1);
		bttn_base_0=(Button)findViewById(R.id.base_bttn_0);
		
		bttn_base_1=(Button)findViewById(R.id.base_bttn_1);
		
		bttn_base_0.setText(getResources().getString(R.string.get_your_account_for_more_features));
		
		
		tab_1.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(v.getId()==tab_1.getId()) {
				switch (event.getActionMasked()){

  						case MotionEvent.ACTION_DOWN:
  						case MotionEvent.ACTION_POINTER_DOWN: {
  							//change color or background  ( new )
  							break;
  						}

  						case MotionEvent.ACTION_UP:
  						case MotionEvent.ACTION_POINTER_UP: {
  							
  							//change color to default
  							
  							//do the action
  							Intent activity_Post_intent = new Intent(Activity_MainNewsPage.this, Activity_Poster.class );
  							startActivity(activity_Post_intent);
  							
  							break;
  						}
  						case MotionEvent.ACTION_MOVE:{
  							
  							//finger moved : deactivate the whole action 
  							
  							break;
  						}
  					}
				}
				return true;
			}
		});
		
		
	}
	
}
