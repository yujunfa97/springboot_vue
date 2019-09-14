package cn.opm.vue.controller;

import cn.opm.vue.entity.JsonResult;
import cn.opm.vue.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ExampleProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apis")
@Api(value = "apis", tags = "Demo接口", produces = "application/json,application/xml")
public class DemoController {

    @ApiOperation(value = "登录接口", notes = "登录接口", httpMethod = "POST")
    @PostMapping(value = "test")
    public JsonResult<User> test(
            @ApiParam(value = "msg", name = "测试") String msg)
    {
        JsonResult<User> jr = new JsonResult<>();
        jr.setStatus(200);
        jr.setMessage("成功");
        System.err.println("msg: " + msg);
        jr.setData(new User("张三", 20));
        return jr;
    }
}
