package com.example.smartfood;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class alerts extends ActionBarActivity implements OnClickListener {

	private Button alertBtn;
	private TextView format2Txt, content2Txt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alerts_main);
		alertBtn = (Button)findViewById(R.id.filter_button);
		format2Txt = (TextView)findViewById(R.id.filter_format);
		content2Txt = (TextView)findViewById(R.id.filter_content);
		alertBtn.setOnClickListener(this);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
        case R.id.action_alert:
           // alerts.openAlerts();
            return true;
        case R.id.action_settings:
            //openSettings();
            return true;
        default:
            return super.onOptionsItemSelected(item);
    }
	}
	public void onClick(View v){
		//respond to clicks
		if(v.getId()==R.id.filter_button){
			//scan
			IntentIntegrator save = new IntentIntegrator(this);
			save.shareText("Tus alergias han sido guardadas, ya puedes escaenar");
			}
		}
	

}
