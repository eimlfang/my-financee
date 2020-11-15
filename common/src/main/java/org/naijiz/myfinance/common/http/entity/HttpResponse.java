package org.naijiz.myfinance.common.http.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;
import org.naijiz.myfinance.common.http.ResponseCode;

/**
 * @author naijiz
 */
@Data
@ToString
public class HttpResponse<T> {
    private String code;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

}
