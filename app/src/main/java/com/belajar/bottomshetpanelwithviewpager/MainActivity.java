package com.belajar.bottomshetpanelwithviewpager;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private Button btn;
    private ViewPager viewPager;
    private BottomSheetBehavior bottomSheetBehavior;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablayoute);
        btn=findViewById(R.id.button);
        viewPager=findViewById(R.id.vewpagere);
        bottomSheetBehavior=BottomSheetBehavior.from(findViewById(R.id.bottomSheetLayout));

        ViewpagerAdapter viewpagerAdapter=new ViewpagerAdapter(getSupportFragmentManager());
        viewpagerAdapter.addFrag(new BlankFragment(),"satu");
        viewpagerAdapter.addFrag(new BlankFragment(),"dua");
        viewpagerAdapter.addFrag(new BlankFragment(),"tiga");

        viewPager.setAdapter(viewpagerAdapter);


       tabLayout.setupWithViewPager(viewPager);


       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
           }
       });
    }
}
