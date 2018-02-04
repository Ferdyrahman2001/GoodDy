package r.ferdy.gooddy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Ferdi on 26/01/2018.
 */

public class activity_smart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smart_activity);

        String dataString = getIntent().getStringExtra("dataSring");
        int dataAngka = getIntent().getIntExtra("dataAngka",1);
        float datafloat = getIntent().getFloatExtra("datafloat",2);
        Toast.makeText(this, "Smart Halaman", Toast.LENGTH_SHORT).show();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
