package com.abs.fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by tyagp001 on 4/1/16.
 */
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.main_activity);

        int screenOrientation = getResources().getConfiguration().orientation;

        if (screenOrientation == Configuration.ORIENTATION_PORTRAIT) {
            hideSidePane();
        }
    }

    private void hideSidePane() {
        View sidePane = findViewById(R.id.side_panel);

        if (sidePane.getVisibility() == View.VISIBLE) {
            sidePane.setVisibility(View.GONE);
        }
    }
}
