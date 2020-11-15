package org.naijiz.myfinance.api.auth.controller;

import org.naijiz.myfinance.common.http.entity.HttpResponse;
import org.naijiz.myfinance.common.http.entity.HttpResponseUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author naijiz
 */
@RestController
@RequestMapping("auth")
public class LogoutController {
    @RequestMapping("logout")
    public HttpResponse logout() {
        return HttpResponseUtil.success("logout success", null);
    }
}
