package org.naijiz.myfinance.api.auth.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author naijiz
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginModel {
    private String username;
    private String password;
}
