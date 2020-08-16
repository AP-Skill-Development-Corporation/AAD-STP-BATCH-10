package com.example.navigationcomponent;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Yellow extends Fragment {


    Button y;
    public Yellow() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_yellow, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        y=view.findViewById(R.id.run);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController c1=Navigation.findNavController(view);

                c1.navigate(R.id.action_yellow_to_blue);
            }
        });
    }
}
