package com.kikinsoft.mobile.leaguechampions.sync;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by fvelazquez on 8/22/15.
 */
public class VolleySingleton {

    private static VolleySingleton mInstance;
    private static Context mCtx;
    private RequestQueue requestQueue;

    private VolleySingleton(Context context) {
        mCtx = context;
        requestQueue = getRequestQueue();
    }

    public static synchronized VolleySingleton getmInstance(Context context) {
        if (mInstance == null) {
            mInstance = new VolleySingleton(context);
        }

        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }

        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }
}
