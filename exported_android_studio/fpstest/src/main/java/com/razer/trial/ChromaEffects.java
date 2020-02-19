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
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setSingleColorHex("#FF0000").setBrightness(255).setOffAfter(300).setRepeatCount(1).build());
    }

    public static void heal()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setSingleColorHex("#00FF00").setBrightness(255).setOffAfter(500).setRepeatCount(1).build());
    }

    public static void fire()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setColorInt(new int[]{Color.BLUE,Color.YELLOW, Color.YELLOW,Color.BLUE,Color.YELLOW, Color.GREEN}).setBrightness(255).setOffAfter(300).setRepeatCount(1).build());
    }


    public static void enemyexplode()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setColorInt(new int[]{Color.GREEN,Color.RED, Color.YELLOW,Color.GREEN,Color.RED, Color.YELLOW,Color.GREEN,Color.RED, Color.YELLOW,Color.GREEN,Color.RED, Color.YELLOW}).setBrightness(255).setOffAfter(300).setRepeatCount(4).build());
    }


}
