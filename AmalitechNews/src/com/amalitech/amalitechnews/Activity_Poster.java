package com.amalitech.amalitechnews;



import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Activity_Poster extends Activity {
	
	//initialize the relative layout
	RelativeLayout activity_inputer_parent_id_rl;
	
	//initialize the button
	Button bttn_new_post;
	
	//initialize the cancel button
	ImageView iv_img_cancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_poster);
		
		//now reference all the elements in the UI
		activity_inputer_parent_id_rl = (RelativeLayout)
				findViewById(R.id.activity_inputer_parent_id);
		
		bttn_new_post = (Button)findViewById(R.id.base_bttn_0);
		iv_img_cancel = (ImageView)findViewById(R.id.iv_img_cancel);
		
		bttn_new_post.setText(getResources().getString(R.string.new_post));
		
bttn_new_post.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				if(v.getId()==bttn_new_post.getId()) {
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
  							//check the parent layout and if it is 
  							//not visible, make it visible.
  							if( !activity_inputer_parent_id_rl.isShown() ) {
  								activity_inputer_parent_id_rl.setVisibility(View.VISIBLE);
  							}
  							
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

iv_img_cancel.setOnTouchListener(new OnTouchListener() {
	
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		
		if(v.getId()==iv_img_cancel.getId()) {
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
						//check the parent layout and if it is 
						//not visible, make it visible.
						if( activity_inputer_parent_id_rl.isShown() ) {
							activity_inputer_parent_id_rl.setVisibility(View.GONE);
						}
						
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
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	@Override
	public void onBackPressed() {
		if(activity_inputer_parent_id_rl.isShown()) {
			activity_inputer_parent_id_rl.setVisibility(View.GONE);
		}
		else {
			super.onBackPressed();
		}
	}

	
	
}
