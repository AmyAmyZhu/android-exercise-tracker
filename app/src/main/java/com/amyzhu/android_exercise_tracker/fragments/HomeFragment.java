package com.amyzhu.android_exercise_tracker.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.amyzhu.android_exercise_tracker.R;

public class HomeFragment extends Fragment {

    Integer daysWorkOut = 30;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayout contributionLL = (LinearLayout) view.findViewById(R.id.contributionLL);
        for(int i = 0; i < daysWorkOut; i++) {
            final ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.ic_one_contribution_20dp);
            imageView.setId(i);
            contributionLL.addView(imageView);
        }
    }
}
