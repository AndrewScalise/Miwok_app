package com.example.android.miwok;

/**
 * Created by Mugen on 1/16/2017.
 */

public class Word {

    private String miwokTranslation;

    private String englishTranslation;

    public Word(String miwok, String english){
        miwokTranslation = miwok;
        englishTranslation = english;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public String getEnglishTranslation(){
        return englishTranslation;
    }
}
