package com.app.desafio_mobile_android.intrastructure.error;


import com.app.desafio_mobile_android.intrastructure.Constants;

public class OperationError {

    private Constants.ErrorType errorType;
    private String errorMsg;

    public Constants.ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(Constants.ErrorType errorType) {
        this.errorType = errorType;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isCustomError() {
        return errorType == Constants.ErrorType.CUSTOM_ERROR;
    }
}
