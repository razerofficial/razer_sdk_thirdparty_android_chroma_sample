package com.razer.trial;


import android.graphics.Color;

import com.razer.chromathirdpartysdk.GamePulseEffect;
import com.razer.chromathirdpartysdk.RazerChromaManager;

/**
 * @author joseph Oliver De Guzman
 * joseph.deguzman@razer.com
 * Razer Asia Pacific
 * @version 1.0.0
 */
public class ChromaEffects {

    public static void damage()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setColorHex("#FF0000").setBrightness(255).setOffAfter(300).setRepeatCount(1).build());
    }

    public static void heal()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setColorHex("#FFFFFF").setBrightness(255).setOffAfter(500).setRepeatCount(1).build());
    }

    public static void fire()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setColorHex("#FFF8A3").setBrightness(255).setOffAfter(300).setRepeatCount(1).build());
    }


    public static void enemyexplode()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setColorInt(Color.GREEN).setBrightness(255).setOffAfter(300).setRepeatCount(4).build());
    }


}
