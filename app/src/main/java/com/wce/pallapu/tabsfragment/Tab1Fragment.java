package com.wce.pallapu.tabsfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by A7718 on 12/26/2017.
 */

public class Tab1Fragment extends Fragment {
    public static final String TAG="Tab1Fragment";

    Button b1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View view= inflater.inflate(R.layout.tab1_fragment,container,false);
b1=(Button)view.findViewById(R.id.f1);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Toast.makeText(getContext(), "Button 1 is clicked", Toast.LENGTH_SHORT).show();

    }
});


return view;
    }
}
