package site.bigbear.tenancy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.bigbear.tenancy.service.TestService;
import site.bigbear.tenancy.vo.Message;

import java.util.List;

/**
 * @author cheyantao
 */
@Controller
@RequestMapping("/api/v1/test")
@ResponseBody
public class TestController {
    @Autowired
    private TestService service;

    @GetMapping
    public Message listTest(){
        return Message.success(this.service.list());
    }
}
