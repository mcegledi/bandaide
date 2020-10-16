package com.guergen.tonicandscales;

public class Scale {
    private long scale;
    private String name;
    private int pointer = 0;
    private int maxPointerValue = 11;


    public Scale(Long scale, String name) {
        this.scale = scale;
        this.name = name;
    }

    public long getScale() {
        return scale;
    }

    public boolean getCurrent() {
        return (scale & pow(2, pointer)) > 0;
    }

    private int increment() {
        pointer++;
        if(pointer > maxPointerValue)
            pointer = 0;

        return pointer;
    }

    private int decrement() {
        pointer--;
        if(pointer < 0)
            pointer = maxPointerValue;

        return pointer;
    }

    public boolean next() {
        increment();
        return getCurrent();
    }

    public boolean previous() {
        decrement();
        return  getCurrent();
    }

    private long pow(int base, int power) {
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Scale{" +
                "scale=" + scale +
                ", name='" + name + '\'' +
                '}';
    }
}
