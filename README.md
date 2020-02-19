# Overview

Razer Third-party chroma SDK provides a way to extend the game context beyond the phone screen. 
It allows game developers to control physical LED lights.


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 


### Installing

1. Add gradle dependencies

build.gradle
```
repositories {
    maven {
        url "https://dl.bintray.com/razer/com.razer.android"
    }
}
 
dependencies{
    ...
    implementation 'com.razer.android:chromathirdpartysdk:0.4.0'
    ...
}
```



2. Initialize RazerChromaManager
RazerApplication.java
```
public class RazerApplication extends android.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();
        RazerChromaManager.initialize(this,false);
    }
}

```


## Running the sample App
1. Clone the sample project.
2. Open the exported_android_studio/fpstest in android studio
3. Modify single zone effects
ChromaEffects.java
```
public class ChromaEffects {

    public static void damage()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setColorHex("#FF0000").setBrightness(255).setOffAfter(300).setRepeatCount(1).build());
    }

    public static void heal()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setSingleColorHex("#00FF00").setBrightness(255).setOffAfter(500).setRepeatCount(1).build());;
    }

    public static void fire()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setColorInt(new int[]{Color.BLUE,Color.YELLOW, Color.YELLOW,Color.BLUE,Color.YELLOW, Color.GREEN}).setBrightness(255).setOffAfter(300).setRepeatCount(1).build());
    }


    public static void enemyexplode()
    {
        RazerChromaManager.getInstance().gameEffect(new GamePulseEffect.Builder().setColorInt(Color.GREEN).setBrightness(255).setOffAfter(300).setRepeatCount(4).build());
    }

}
```
