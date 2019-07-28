// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SDPException.java

package com.samsung.core.exception;


public class SDPException extends RuntimeException
{

    public SDPException(String errorCode)
    {
        super(errorCode);
    }

    public SDPException(String errorCode, Throwable cause)
    {
        super(errorCode, cause);
    }

    public SDPException(Throwable cause)
    {
        super(cause);
    }

    private static final long serialVersionUID = 0x56e7bd0236a003edL;
}
