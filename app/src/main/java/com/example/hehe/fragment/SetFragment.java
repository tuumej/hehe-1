package com.example.hehe.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.hehe.R;
import com.example.hehe.SetIdActivity;


public class SetFragment extends Fragment {
    private Button id_set_btn;

    Button btn_id_set;

    public SetFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_set, container, false);


       btn_id_set= v.findViewById(R.id.id_set_btn);
       btn_id_set.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               Intent intent = new Intent(getActivity(), SetIdActivity.class);
               startActivity(intent);
           }


       });

       return v;
   
    }





}
