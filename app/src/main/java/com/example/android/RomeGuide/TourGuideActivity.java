package com.example.android.RomeGuide;

        import android.os.Bundle;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.viewpager2.widget.ViewPager2;

        import com.google.android.material.tabs.TabLayout;
        import com.google.android.material.tabs.TabLayoutMediator;


public class TourGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_guide);

        ViewPager2 viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new TourGuideStateAdapter(this));


        TabLayout tabLayout = findViewById(R.id.tabLayout);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0: {
                        tab.setText(getString(R.string.hotel));
                        break;
                    }
                    case 1: {
                        tab.setText(getString(R.string.school));
                        break;
                    }
                    case 2: {
                        tab.setText(getString(R.string.mall));
                        break;
                    }
                    case 3: {
                        tab.setText(getString(R.string.restaurant));
                        break;
                    }
                }
            }
        }
        );
        tabLayoutMediator.attach();
    }
}