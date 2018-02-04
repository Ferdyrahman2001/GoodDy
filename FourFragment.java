package r.ferdy.gooddy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

/**
 * Created by Ferdi on 27/01/2018.
 */

@SuppressWarnings("ALL")
public class FourFragment extends Fragment {
    private Spinner spinner1,spinner2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.setting_activity, container, false);


        return inflater.inflate(R.layout.setting_activity, container, false);

    }

}


