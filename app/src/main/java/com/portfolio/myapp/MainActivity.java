package com.portfolio.myapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById(R.id.button_spotify).setOnClickListener(this);
        findViewById(R.id.button_scoreApp).setOnClickListener(this);
        findViewById(R.id.button_libraryApp).setOnClickListener(this);
        findViewById(R.id.button_buildItBigger).setOnClickListener(this);
        findViewById(R.id.button_xyzReader).setOnClickListener(this);
        findViewById(R.id.button_myOwnApp).setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_spotify:
                Util.showToast(this, getString(R.string.msg_spotify_reder));
                break;
            case R.id.button_scoreApp:
                Util.showToast(this, getString(R.string.msg_score_app));
                break;
            case R.id.button_libraryApp:
                Util.showToast(this, getString(R.string.msg_library_app));
                break;
            case R.id.button_buildItBigger:
                Util.showToast(this, getString(R.string.msg_build_it_bigger));
                break;
            case R.id.button_xyzReader:
                Util.showToast(this, getString(R.string.msg_xyz_reader_app));
                break;
            case R.id.button_myOwnApp:
                Util.showToast(this, getString(R.string.msg_capstone_app));
                break;
        }
    }


}
