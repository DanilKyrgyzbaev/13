package com.geektech.taskappa2;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardFragment extends Fragment {


    public BoardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_board, container, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textTitle = view.findViewById(R.id.textTitle);
        TextView textDesc = view.findViewById(R.id.textDesc);
        Button btn = view.findViewById(R.id.button);
        Button skip = view.findViewById(R.id.skip);
        RelativeLayout background = view.findViewById(R.id.background);
        int pos = getArguments().getInt("pos");
        switch (pos){
            case 0:
                imageView.setImageResource(R.drawable.photo_1);
                textTitle.setText("Hello");
                background.setBackgroundColor(Color.YELLOW);
                break;
            case 1:
                imageView.setImageResource(R.drawable.photo_3);
                textTitle.setText("Zdraste");
                background.setBackgroundColor(Color.BLUE);
                break;
            case 2:
                imageView.setImageResource(R.drawable.photo_1);
                textTitle.setText("pshlnh");
                background.setBackgroundColor(Color.GREEN);
                skip.setVisibility(View.GONE);
                btn.setVisibility(View.VISIBLE);
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getActivity().getSharedPreferences("settings", Context.MODE_PRIVATE);
                preferences.edit().putBoolean("isShown", true).apply();
                startActivity(new Intent(getContext(), MainActivity.class));
                getActivity().finish();
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getActivity().getSharedPreferences("settings", Context.MODE_PRIVATE);
                preferences.edit().putBoolean("isShown", true).apply();
                startActivity(new Intent(getContext(), MainActivity.class));
                getActivity().finish();
            }
        });

        return view;
    }

}
