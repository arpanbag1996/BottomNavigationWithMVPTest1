package com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.views;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.innovationredefined.bottomnavigationwithmvptest1.R;
import com.innovationredefined.bottomnavigationwithmvptest1.ui.fragments.presenter.FragmentPresenterImplementer;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View secondFragmentRootView = inflater.inflate(R.layout.fragment_first, container, false);
        TextView textView = secondFragmentRootView.findViewById(R.id.textview);

        FragmentPresenterImplementer fragmentPresenterImplementer = new FragmentPresenterImplementer();
        fragmentPresenterImplementer.subscribe(this);

        textView.setText(fragmentPresenterImplementer.getData());
        return secondFragmentRootView;
    }

}
