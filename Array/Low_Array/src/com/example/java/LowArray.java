package com.example.java;

public class LowArray
    {
    private long[] a;  // ref to array
///////////////////////////////////////////////////
    public LowArray(int size) // constructor
    {a = new long[size]; } // create array
//--------------------------------------------------
    public void setElem(int index, long value)
    {a[index] = value; }
//--------------------------------------------------
    public long getElem(int index)
    {return a[index]; }
//--------------------------------------------------
} // end class LowArray
