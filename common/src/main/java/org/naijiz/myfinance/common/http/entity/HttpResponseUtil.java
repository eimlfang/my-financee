package org.naijiz.myfinance.common.http.entity;

import org.naijiz.myfinance.common.http.ResponseCode;

/**
 * @author naijiz
 */
public class HttpResponseUtil {
    public static <P> HttpResponse<P> build(String code, String message, P data) {
        HttpResponse response = new HttpResponse<>();
        response.setCode(code);
        response.setMessage(message);
        response.setData(data);
        return response;
    }

    public static <P> HttpResponse<P> success(String message, P data) {
        return build(ResponseCode.SUCCESS, message, data);
    }

    public static <P> HttpResponse<P> success(String message) {
        return build(ResponseCode.SUCCESS, message, null);
    }

    public static <P> HttpResponse<P> fail(String message) {
        return build(ResponseCode.SYSTEM_ERROR, message, null);
    }
}
