package com.example.bottom_nav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DashboardFragment extends Fragment {

    TextView tvDashboard;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        tvDashboard = (TextView) view.findViewById(R.id.tvDashboard);
        return view;
    }
}