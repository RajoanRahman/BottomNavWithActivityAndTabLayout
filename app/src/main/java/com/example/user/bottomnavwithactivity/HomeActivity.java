package com.example.user.bottomnavwithactivity;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.bottomnavwithactivity.BooksFragment.HorrorFragment;
import com.example.user.bottomnavwithactivity.BooksFragment.ScienceFictionFragment;
import com.example.user.bottomnavwithactivity.BooksFragment.ThrillerFragment;

import org.w3c.dom.Text;

public class HomeActivity extends BaseActivity {

    TextView textView;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home);

        viewPager=(ViewPager)findViewById(R.id.book_viewPager);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new ScienceFictionFragment(),"Science Fiction");
        viewPagerAdapter.addFragment(new HorrorFragment(),"Horror Book Section");
        viewPagerAdapter.addFragment(new ThrillerFragment(),"Thriller book Section");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout=(TabLayout)findViewById(R.id.book_tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    int getContentViewId() {
        return R.layout.activity_home;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_home;
    }
}
