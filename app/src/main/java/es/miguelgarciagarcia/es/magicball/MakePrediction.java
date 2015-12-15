package es.miguelgarciagarcia.es.magicball;

import android.content.Context;

import java.util.Random;

/**
 * return random
 * Created by Vaio on 15/12/2015.
 */
public class MakePrediction {

    public static String getPrediction(Context context){
        String[]prediction=context.getResources().getStringArray(R.array.prediction);
        Random random=new Random();
        int aleatorio=random.nextInt(prediction.length);
        return  prediction[aleatorio];
    }
}
