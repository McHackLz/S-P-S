package net.ddns.nougat.sps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View v){
        if(((CheckBox)findViewById(R.id.idiot_check)).isChecked())
            startActivity(new Intent(this, GameActivity.class));
    }
}
