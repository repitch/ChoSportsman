package com.chokavo.chosportsman.ui.activities.calendar;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.chokavo.chosportsman.R;
import com.chokavo.chosportsman.ui.activities.BaseActivity;
import com.chokavo.chosportsman.ui.fragments.calendar.EditEventFragment;

/**
 * Created by ilyapyavkin on 28.03.16.
 */
public class CreateEventActivity extends BaseActivity {
    public static final int REQUEST_CREATE_EVENT = 1;
    public static final String EXTRA_DATE = "EXTRA_DATE";
    public static final String EXTRA_EVENT = "EXTRA_EVENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        Toolbar mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mActionBarToolbar != null) {
            setSupportActionBar(mActionBarToolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close_white_24dp);
        }

        launchFragmentNoBackStack(EditEventFragment.newInstance(getIntent().getExtras()),
                EditEventFragment.getFragmentTag());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
