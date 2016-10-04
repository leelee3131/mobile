package com.example.myapplication01;

/**
 * Created by 이지훈 on 2016-10-04.
 */

public class avg extends value{

    public int result(int[] arr){
        int value=0;
        if(arr !=null)
        {
            for(int i=0;i<arr.length;i++)
            {
                value += arr[i];
            }
            value /= arr.length;
        }
        return value;
    }
}



