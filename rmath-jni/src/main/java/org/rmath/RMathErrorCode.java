package org.rmath;

/**
 * Error codes of rmath-jni
 *
 * @author Rabin Banerjee
 */
public enum RMathErrorCode
{

    UNKNOWN(0),
    FAILED_TO_LOAD_NATIVE_LIBRARY(1);
    

    public final int id;

    private RMathErrorCode(int id)
    {
        this.id = id;
    }

    public static RMathErrorCode getErrorCode(int id)
    {
        for (RMathErrorCode code : RMathErrorCode.values()) {
            if (code.id == id) {
                return code;
            }
        }
        return UNKNOWN;
    }

    public static String getErrorMessage(int id)
    {
        return getErrorCode(id).name();
    }
}