package com.ming.test;

/**
 * @author Ming
 * 8/24/21
 */
public class ConWrapper implements Con {
    private Con con;

    public ConWrapper(Con con) {
        this.con = con;
    }

    @Override
    public void start() {
        con.start();
    }
}
