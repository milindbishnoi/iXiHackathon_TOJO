package org.tensorflow.yolo.view;

import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;

import org.tensorflow.yolo.model.Recognition;
import org.tensorflow.yolo.Config;

import java.util.List;
import java.util.Locale;

/**
 * Created by Zoltan Szabo on 4/25/18.
 */

public abstract class TextToSpeechActivity extends CameraActivity implements TextToSpeech.OnInitListener {
    private TextToSpeech textToSpeech;
    private String lastRecognizedClass = "";

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            int result = textToSpeech.setLanguage(Locale.US);
            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e(Config.LOGGING_TAG, "Text to speech error: This Language is not supported");
            }
        } else {
            Log.e(Config.LOGGING_TAG, "Text to speech: Initilization Failed!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textToSpeech = new TextToSpeech(this, this);
    }

    protected void speak(List<Recognition> results,int ans) {
        if (!(results.isEmpty() || lastRecognizedClass.equals(results.get(0).getTitle()))) {
            lastRecognizedClass = results.get(0).getTitle();

            if(lastRecognizedClass.equals("bottle")) {
                ClassifierActivity.found = 1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textToSpeech.speak(lastRecognizedClass + "found", TextToSpeech.QUEUE_FLUSH, null, null);
                } else {
                    textToSpeech.speak(lastRecognizedClass + "found", TextToSpeech.QUEUE_FLUSH, null);
                }

            }else if(ans==2&&lastRecognizedClass.equals("tree")) {
                ClassifierActivity.found=1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null, null);
                } else {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null);
                }
            }else if(ans==3&&lastRecognizedClass.equals("cycle")) {
                ClassifierActivity.found=1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null, null);
                } else {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null);
                }
            }else if(ans==4&&lastRecognizedClass.equals("bag")) {
                ClassifierActivity.found=1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null, null);
                } else {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null);
                }
            }else if(ans==5&&lastRecognizedClass.equals("person")) {
                ClassifierActivity.found=1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null, null);
                } else {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null);
                }
            }else if(ans==6&&lastRecognizedClass.equals("tree")) {
                ClassifierActivity.found=1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null, null);
                } else {
                    textToSpeech.speak(lastRecognizedClass+"found", TextToSpeech.QUEUE_FLUSH, null);
                }
            }else
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textToSpeech.speak("", TextToSpeech.QUEUE_FLUSH, null, null);
                } else {
                    textToSpeech.speak("", TextToSpeech.QUEUE_FLUSH, null);
                }
            }

        }
    }
//    protected void speak(String str) {
//        textToSpeech.speak(str,TextToSpeech.QUEUE_FLUSH,null,null);
//    }

}
