package es.miguelgarciagarcia.es.magicball;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    static TextView textView;
    public MainActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_main, container, false);


        initial(rootView);
        return  rootView;
    }

    private void initial(View rootView) {
         textView = (TextView)
                rootView.findViewById(R.id.textView);
        Button button=(Button)rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sPrediction =  MakePrediction.getPrediction(getActivity());
                TextView tPrediction = (TextView)
                        MainActivityFragment.textView.findViewById(R.id.textView);
                tPrediction.setText(sPrediction);

            }
        });
    }
}
