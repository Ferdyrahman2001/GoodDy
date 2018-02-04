package r.ferdy.gooddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;
import android.widget.Toast;

/**
 * Created by Ferdi on 26/01/2018.
 */

public class activity_smile extends AppCompatActivity {
    private ScrollView scroller;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smile_activity);

        String dataString = getIntent().getStringExtra("dataString");
        Toast.makeText(this, "Page smile", Toast.LENGTH_SHORT).show();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
