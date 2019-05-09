package com.example.user.bottomnavwithactivity;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.bottomnavwithactivity.BooksFragment.HorrorFragment;
import com.example.user.bottomnavwithactivity.MoviesFragment.ActionFilmFragment;
import com.example.user.bottomnavwithactivity.MoviesFragment.HorrorFilmFragment;
import com.example.user.bottomnavwithactivity.MoviesFragment.RomanticFilmFragment;
import com.example.user.bottomnavwithactivity.MusicFragment.JazzMusicFragment;
import com.example.user.bottomnavwithactivity.MusicFragment.PopMusicFragment;
import com.example.user.bottomnavwithactivity.MusicFragment.RockMusicFragment;

public class SettingsActivity extends BaseActivity {


    TabLayout tabLayout;
    ViewPager viewPager;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home);

        viewPager=(ViewPager)findViewById(R.id.movies_viewPager);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new ActionFilmFragment(),"Action Film Section");
        viewPagerAdapter.addFragment(new RomanticFilmFragment(),"Romantic Film Section");
        viewPagerAdapter.addFragment(new HorrorFilmFragment(),"Horror Film Section");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout=(TabLayout)findViewById(R.id.movies_tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    int getContentViewId() {
        return R.layout.activity_settings;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_setting;
    }
}
