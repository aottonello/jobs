package com.example.drivingtrends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
	
	protected static ConteinerFragment conteinerFragment;
	TextView btnScore;
	TextView btnMPG;
	TextView btnFuel;
	TextView btnDistance;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnScore=(TextView)findViewById(R.id.textViewScore);
		btnScore.setOnClickListener(new btnScoreOnClickListener());
		
		btnMPG=(TextView)findViewById(R.id.textViewMpg);
		btnMPG.setOnClickListener(new btnMpgOnClickListener());
		
		btnFuel=(TextView)findViewById(R.id.textViewFuel);
		btnFuel.setOnClickListener(new btnFuelOnClickListener());
		
		btnDistance=(TextView)findViewById(R.id.textViewDistance);
		btnDistance.setOnClickListener(new btnDistanceOnClickListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	 //LISTENERS
	 public class btnScoreOnClickListener implements OnClickListener {

			@Override
			public void onClick(View v) {
				btnScore.setBackgroundResource(R.drawable.setting_tabs);
				btnMPG.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
				btnFuel.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
				btnDistance.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
		            if (conteinerFragment == null) {
		            	conteinerFragment = new ConteinerFragment();
		            }
		            changeFragment(conteinerFragment);
		        }
				
			
			
		};
		 //LISTENERS
		 public class btnMpgOnClickListener implements OnClickListener {

				@Override
				public void onClick(View v) {
					btnMPG.setBackgroundResource(R.drawable.setting_tabs);
					btnScore.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
					btnFuel.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
					btnDistance.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
			            if (conteinerFragment == null) {
			            	conteinerFragment = new ConteinerFragment();
			            }
			            changeFragment(conteinerFragment);
			        }
					
				
				
			};
			 //LISTENERS
			 public class btnFuelOnClickListener implements OnClickListener {

					@Override
					public void onClick(View v) {
						btnFuel.setBackgroundResource(R.drawable.setting_tabs);
						btnMPG.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
						btnScore.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
						btnDistance.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
				            if (conteinerFragment == null) {
				            	conteinerFragment = new ConteinerFragment();
				            }
				            changeFragment(conteinerFragment);
				        }
						
					
					
				};
				 //LISTENERS
				 public class btnDistanceOnClickListener implements OnClickListener {

						@Override
						public void onClick(View v) {
							btnDistance.setBackgroundResource(R.drawable.setting_tabs);
							btnMPG.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
							btnFuel.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
							btnScore.setBackgroundColor(getResources().getColor(R.color.header_action_buttons_selected));
					            if (conteinerFragment == null) {
					            	conteinerFragment = new ConteinerFragment();
					            }
					            changeFragment(conteinerFragment);
					        }
							
						
						
					};
	  protected void changeFragment(Fragment f) {
	        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
	        ft.replace(R.id.fragmment_conteiner, f);
	        ft.addToBackStack(null);
	        ft.commit();
     }
}
