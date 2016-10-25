package cl.adachersoft.shrinkquizz.views;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;

import cl.adachersoft.shrinkquizz.R;
import cl.adachersoft.shrinkquizz.adapters.PagerAdapter;

public class MainActivity extends AppCompatActivity {
    private PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        pagerAdapter =new PagerAdapter(getSupportFragmentManager(),this);

        // Set up the ViewPager with the sections adapter.
        ViewPager viewPager= (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        }

    }


