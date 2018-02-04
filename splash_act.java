package r.ferdy.gooddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Ferdi on 24/01/2018.
 */

public class splash_act extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);

        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent intentPindahKeActivityUtama = new Intent(
                                splash_act.this,
                                MainActivity.class
                        );
                        startActivity(
                                intentPindahKeActivityUtama);
                        finish();
                    }
                }, 2_000
        );
    }
}
