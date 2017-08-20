package com.pakistan.kisan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Shakeel Ahmed on 8/20/2017.
 */

public class RestartActivity extends Activity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        finish();
    }

    // This will start an activity which will return result

    protected void onResume() {
        try {
            Bundle extras = getIntent().getExtras();
            String classname = extras.getString("class");
            Class<?> aclass = Class.forName(classname);
            startActivityForResult(new Intent(this, aclass), 0);
        } catch (Exception e) {
            Toast.makeText(this, e + "", Toast.LENGTH_LONG).show();
        }
        super.onResume();
    }
}
