package com.example.user.bottomnavwithactivity;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.bottomnavwithactivity.BooksFragment.HorrorFragment;
import com.example.user.bottomnavwithactivity.BooksFragment.ScienceFictionFragment;
import com.example.user.bottomnavwithactivity.BooksFragment.ThrillerFragment;
import com.example.user.bottomnavwithactivity.MusicFragment.JazzMusicFragment;
import com.example.user.bottomnavwithactivity.MusicFragment.PopMusicFragment;
import com.example.user.bottomnavwithactivity.MusicFragment.RockMusicFragment;

public class NotificationActivity extends BaseActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home);

        viewPager=(ViewPager)findViewById(R.id.music_viewPager);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new RockMusicFragment(),"Rock Music Section");
        viewPagerAdapter.addFragment(new PopMusicFragment(),"Pop Music Section");
        viewPagerAdapter.addFragment(new JazzMusicFragment(),"Jazz Music Section");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout=(TabLayout)findViewById(R.id.music_tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }



    @Override
    int getContentViewId() {
        return R.layout.activity_notification;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_notification;
    }
}
