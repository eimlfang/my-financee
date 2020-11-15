package org.naijiz.myfinance.api.auth.controller;

import org.naijiz.myfinance.api.auth.model.LoginModel;
import org.naijiz.myfinance.common.http.entity.HttpResponse;
import org.naijiz.myfinance.common.http.entity.HttpResponseUtil;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author naijiz
 */
@RestController
@RequestMapping("auth")
public class LoginController {

    @PostMapping("login")
    public HttpResponse login(@RequestBody @Validated LoginModel loginModel) {
        return HttpResponseUtil.fail("Login fail");
    }
}
