package com.ming.test;

import android.util.Log;

/**
 * @author Ming
 * 8/24/21
 */
public class Act extends ConWrapper{
    public Act(Con con) {
        super(con);
    }

    @Override
    public void start() {
        Log.e("Act","Act");
    }
}
