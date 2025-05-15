
package com.example.bottom_nav.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.bottom_nav.R;

public class InformationFragment extends Fragment {

    TextView tvInfo;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_information, container, false);
        tvInfo = (TextView) view.findViewById(R.id.tvInfo);
        return view;
    }
}
