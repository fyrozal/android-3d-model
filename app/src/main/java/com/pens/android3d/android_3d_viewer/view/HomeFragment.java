package com.pens.android3d.android_3d_viewer.view;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pens.android3d.android_3d_viewer.R;
import com.pens.android3d.android_3d_viewer.demo.ExampleSceneLoader;
import com.pens.android3d.android_3d_viewer.demo.SceneLoader;

import static android.os.Looper.getMainLooper;


public class HomeFragment extends Fragment {
    View rootView;





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        rootView = inflater.inflate(R.layout.fragment_home, container, false);



        return rootView;
    }
}