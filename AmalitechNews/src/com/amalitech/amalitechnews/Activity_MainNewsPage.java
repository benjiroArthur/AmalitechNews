package com.amalitech.amalitechnews;

import com.amalitech.amalitechnews.Activity_MainNewsPage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity_MainNewsPage extends Activity {

	TextView tab_1, tab_2;
	Button bttn_base_0, bttn_base_1;
	
	Context ctx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_news_page_layout);
		ctx = Activity_MainNewsPage.this;
		
		//Reference ui elements
		tab_1 = (TextView )findViewById(R.id.tab_1);
		tab_2 = (TextView )findViewById(R.id.tab_2);
		bttn_base_0=(Button)findViewById(R.id.base_bttn_0);
		
		bttn_base_1=(Button)findViewById(R.id.base_bttn_1);
		//nav_V(3, "nav_v_", 0).setVisibility(View.VISIBLE);
		
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
		
tab_2.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(v.getId()==tab_2.getId()) {
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
  							Intent activity_Post_intent = new Intent(Activity_MainNewsPage.this, Activity_Profile.class );
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
		

		for(int x=0; x<3; x++) {
			//because we are in the Activity_MainNewsPage,
			//turn off all the views under the tv except 
			//the first one.
			if(x==0) {
				nav_V(3, "nav_v_", x).setVisibility(View.VISIBLE);
				
			}else {
				nav_V(3, "nav_v_", x).setVisibility(View.GONE);
			}
		}
		
		
		
		
	}
	
	public TextView nav_TV(int total_num_i, String prefix_str, int tv_i){

		String[] textView_tv_ids = new String[total_num_i];

		TextView[] textView_full_IDs = new TextView[total_num_i];

		textView_tv_ids[tv_i] = prefix_str+Integer.toString(tv_i);

		int textView_tv_ID = ctx.getResources().getIdentifier(textView_tv_ids[tv_i], "id", "com.amalitech.amalitechnews");
		textView_full_IDs[tv_i] = (TextView)findViewById(textView_tv_ID);

		return textView_full_IDs[tv_i];
	}
	public View nav_V(int total_num_i, String prefix_str, int v_i){


		String[] view_ids = new String[total_num_i];

		View[] view_full_IDs = new View[total_num_i];

		view_ids[v_i] = prefix_str+Integer.toString(v_i);

		int view_ID = ctx.getResources().getIdentifier(view_ids[v_i], "id", "com.amalitech.amalitechnews");
		view_full_IDs[v_i] = (View)findViewById(view_ID);

		return view_full_IDs[v_i];
	}
	
	
}
