package com.wce.pallapu.tabsfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Tab2Fragment extends Fragment {
    public static final String TAG="Tab2Fragment";

    Button b2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.tab2_fragment,container,false);
        b2=(Button)view.findViewById(R.id.f2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Button 2 is clicked", Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }
}