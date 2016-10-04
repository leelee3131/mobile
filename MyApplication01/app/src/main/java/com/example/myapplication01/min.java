package com.example.myapplication01;

/**
 * Created by 이지훈 on 2016-10-04.
 */
public class min extends value{

    public int result(int[] arr){
        int value=0;

        if( arr!=null)
        {
            value=arr[0];
            for(int i=1;i<arr.length;i++)
            {
                if (arr[i] < value) {
                    value=arr[i];
                }
            }
        }
        return value;
    }
}
