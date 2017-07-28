package com.example.mehedihassanpiash.diuresult2;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Mehedi Hassan Piash on 1/10/2016.
 */
public class MyVolley {
    private static MyVolley instance;
    private RequestQueue requestQueue;
    private static Context context;

    private MyVolley(Context context) {
        this.context = context;
        requestQueue = getRequestQueue();

    }

    public static synchronized MyVolley getInstance(Context context) {
        if(instance == null) {
            instance = new MyVolley(context);
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
        if(requestQueue == null) {
            requestQueue = Volley.newRequestQueue(context);
        }
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> request) {
        getRequestQueue().add(request);
    }
}
