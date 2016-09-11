
package org.rmath;

public class RMathError
        extends Error
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public final RMathErrorCode errorCode;

    public RMathError(RMathErrorCode code)
    {
        super();
        this.errorCode = code;
    }

    public RMathError(RMathErrorCode code, Error e)
    {
        super(e);
        this.errorCode = code;
    }

    public RMathError(RMathErrorCode code, String message)
    {
        super(message);
        this.errorCode = code;
    }

    @Override
    public String getMessage()
    {
        return String.format("[%s] %s", errorCode.name(), super.getMessage());
    }
}