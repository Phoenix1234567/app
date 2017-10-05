package com.india.cservices.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;

import com.india.cservices.common.ApiConstants;
import com.india.cservices.inerfaces.INetworkResponse;
import com.india.cservices.inerfaces.trackAppListner;

import org.json.JSONObject;

/**
 * Created by lab1 on 22/09/17.
 *
 */

public abstract class BaseFragment extends Fragment implements INetworkResponse, View.OnClickListener, trackAppListner {


    public  void setFragment()
    {

    }

    public abstract void trackEvent();

    protected void setFragment(int containerId, Fragment fragment, String tag) {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(containerId,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void trackApp(String d,String dw) {
        Log.e(""+d,">>>>>>");
    }
    @Override
    public void onSuccess(JSONObject obj, ApiConstants.networkRequestType networkRequestType) {

    }

    @Override
    public void onError(JSONObject error, ApiConstants.networkRequestType networkRequestType) {

    }
}