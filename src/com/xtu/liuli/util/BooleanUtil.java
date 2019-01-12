package com.xtu.liuli.util;

public class BooleanUtil {
    public static boolean checkBoolean(Boolean bool)
    {
        if(bool==false)
            return false;
        return bool;
    }
    public static boolean checkObject(Object o)
    {
        return o==null;
    }
}