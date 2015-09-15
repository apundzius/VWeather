package com.accuweather.algirdas.vweather;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;

import com.accuweather.algirdas.vweather.DataSingleton;

/**
 * Created by Algirdas on 2015.09.10.
 */
abstract public class BaseFragment extends Fragment {

    public DataSingleton dataProvider;

    private BroadcastReceiver mMessageReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String message = intent.getStringExtra("message");
            gotMessage(message);
        }
    };

    abstract public void initDesign();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataProvider = DataSingleton.getInstance(getActivity().getApplicationContext());
    }

    public void gotMessage(String message)
    {
        if(message.equals("update"))
            dataLoaded();
    }

    public void dataLoaded()
    {
        if(dataProvider.hasData()) {
            initDesign();
        }
    }

    @Override
    public void onPause() {
        LocalBroadcastManager.getInstance(this.getActivity()).unregisterReceiver(mMessageReceiver);
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        LocalBroadcastManager.getInstance(this.getActivity()).registerReceiver(mMessageReceiver,
                new IntentFilter("LocalBroadcaster"));
    }
}
