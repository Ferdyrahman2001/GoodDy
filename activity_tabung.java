package r.ferdy.gooddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Ferdi on 26/01/2018.
 */

public class activity_tabung extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabung_activity);

        String dataString = getIntent().getStringExtra("dataString");
        Toast.makeText(this, "Page menabung", Toast.LENGTH_SHORT).show();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
