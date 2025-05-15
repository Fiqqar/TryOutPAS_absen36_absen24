
package com.example.bottom_nav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment {

    TextView tvSettings;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        tvSettings = (TextView) view.findViewById(R.id.tvSettings);
        return view;
    }
}
