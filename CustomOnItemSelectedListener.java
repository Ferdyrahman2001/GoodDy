package r.ferdy.gooddy;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by Ferdi on 03/02/2018.
 */

class CustomOnItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(parent.getContext(), "you have selected lannguage" + parent.getItemAtPosition(position).toString(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //TODO Auto-generated  method atub
    }
}
