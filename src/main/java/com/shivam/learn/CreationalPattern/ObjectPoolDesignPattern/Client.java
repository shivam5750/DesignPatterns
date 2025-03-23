package com.shivam.learn.CreationalPattern.ObjectPoolDesignPattern;

import javafx.geometry.Point2D;

public class Client {
    
    public static final ObjectPool<BitMap> bitMapPool = new ObjectPool<>(() -> new BitMap("logo.png"), 5);
    public static void main(String[] args) {
        BitMap bi = bitMapPool.get();
        bi.setLocation(new Point2D(10, 10));
        BitMap bi2 = bitMapPool.get();
        bi2.setLocation(new Point2D(20, 5));

        bi.draw();
        bi2.draw();

        bitMapPool.release(bi);
        bitMapPool.release(bi2);
        
    }
}
