package com.example.atame.minecraftrehber;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by atame on 2.12.2017.
 */

public class FragmentCrafting extends Fragment {

TextView textView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_crafting,container,false);
textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }



}
