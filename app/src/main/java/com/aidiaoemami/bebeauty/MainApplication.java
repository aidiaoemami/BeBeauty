package com.aidiaoemami.bebeauty;

import android.app.Application;
import android.content.Context;

import com.aidiaoemami.bebeauty.Helper.LocaleHelper;

public class MainApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base, "id"));
    }
}
