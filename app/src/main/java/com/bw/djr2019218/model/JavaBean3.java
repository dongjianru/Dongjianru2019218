package com.bw.djr2019218.model;

/**
 * @Auther: 董建茹
 * @Date: 2019/2/18 09:09:40
 * @Description:
 */
public class JavaBean3 {

    private String error_code;
    private String reason;
    private  result result;
    private String resultcode;

    public JavaBean3(String error_code, String reason, com.bw.djr2019218.model.result result, String resultcode) {
        this.error_code = error_code;
        this.reason = reason;
        this.result = result;
        this.resultcode = resultcode;
    }

    public JavaBean3() {
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public com.bw.djr2019218.model.result getResult() {
        return result;
    }

    public void setResult(com.bw.djr2019218.model.result result) {
        this.result = result;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    @Override
    public String toString() {
        return "JavaBean3{" +
                "error_code='" + error_code + '\'' +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                ", resultcode='" + resultcode + '\'' +
                '}';
    }
}
