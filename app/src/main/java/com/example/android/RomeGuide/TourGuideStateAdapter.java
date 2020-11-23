package com.example.android.RomeGuide;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TourGuideStateAdapter extends FragmentStateAdapter {

    TourGuideStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HotelFragment();
            case 1:
                return new SchoolFragment();
            case 2:
                return new MallFragment();
            default:
                return new RestaurantFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
