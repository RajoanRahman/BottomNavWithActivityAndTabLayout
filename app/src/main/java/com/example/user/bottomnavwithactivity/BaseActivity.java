package com.example.user.bottomnavwithactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public abstract class BaseActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());

        bottomNavigationView=findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        updateNavigationBarState();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        bottomNavigationView.postDelayed(()-> {
            int itemId = item.getItemId();
            if (itemId == R.id.navigation_home) {
                startActivity(new Intent(this, HomeActivity.class));
            } else if (itemId == R.id.navigation_notification) {
                startActivity(new Intent(this, NotificationActivity.class));
            } else if (itemId == R.id.navigation_setting) {
                startActivity(new Intent(this, SettingsActivity.class));
            }
            finish();
        }, 300);
        return true;
    }




    private void updateNavigationBarState() {

        int actionId = getNavigationMenuItemId();
        selectBottomNavigationBarItem(actionId);

    }

    //protected abstract void selectBottomNavigationBarItem(int actionId);

    void selectBottomNavigationBarItem(int itemId) {
        MenuItem item = bottomNavigationView.getMenu().findItem(itemId);
        item.setChecked(true);
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
    abstract int getContentViewId();

    abstract int getNavigationMenuItemId();
}
