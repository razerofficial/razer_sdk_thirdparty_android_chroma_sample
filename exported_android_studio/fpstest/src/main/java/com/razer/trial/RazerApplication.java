package com.razer.trial;

import com.razer.chromathirdpartysdk.RazerChromaManager;

/**
 * @author joseph Oliver De Guzman
 * joseph.deguzman@razer.com
 * Razer Asia Pacific
 * @version 1.0.0
 */
public class RazerApplication extends android.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();
        RazerChromaManager.initialize(this,false);
    }
}
