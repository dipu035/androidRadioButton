package com.example.radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;
/**
 * 
 * @author dipu
 * @email dipu035_mbstu@yahoo.com
 *
 */
public class MainActivity extends Activity implements OnCheckedChangeListener, OnClickListener{

	RadioButton rbQ1, rb1Q1, rb2Q1, rbQ2, rb1Q2, rb2Q2;
	RadioGroup rgQ1, rgQ2;
	Button btnSubmit;
	TextView tvResult;
	int totalMarks = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();
        
    }
	private void init() {
		
		rgQ1 = (RadioGroup) findViewById(R.id.rgQ1);
		rgQ2 = (RadioGroup) findViewById(R.id.rgQ2);
		
		rbQ1 = (RadioButton) findViewById(R.id.rbQ1);
		rb1Q1 = (RadioButton) findViewById(R.id.rb1Q1);
		rb2Q1 = (RadioButton) findViewById(R.id.rb2Q1);
		
		rbQ2 = (RadioButton) findViewById(R.id.rbQ2);
		rb1Q2 = (RadioButton) findViewById(R.id.rb1Q2);
		rb2Q2 = (RadioButton) findViewById(R.id.rb2Q2);
		
		tvResult = (TextView) findViewById(R.id.tvReasult);
		
		btnSubmit = (Button) findViewById(R.id.btnSubmit);
		
		rgQ1.setOnCheckedChangeListener(this);
		rgQ2.setOnCheckedChangeListener(this);
		
		btnSubmit.setOnClickListener(this);
		
	}
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		
	}
	
	@Override
	public void onClick(View v) {
		int marks = 0;
		if(rgQ1.getCheckedRadioButtonId() == R.id.rb1Q1){
			marks += 10;
		}
		
		if(rgQ2.getCheckedRadioButtonId() == R.id.rbQ2){
			marks += 10;
		}
		
		tvResult.setText(String.valueOf(marks));
	}

    
}
