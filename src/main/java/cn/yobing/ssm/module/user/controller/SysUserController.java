package cn.yobing.ssm.module.user.controller;

import cn.yobing.ssm.module.user.pojo.SysUser;
import cn.yobing.ssm.module.user.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/1.
 */
@Controller
public class SysUserController {
    @Resource
    private SysUserService sysUserService;
    @RequestMapping("/showUser")
    public String showUser(Model model, Long id) {
        SysUser user = sysUserService.getById(id);
        model.addAttribute("user", user);
        return "showUser";
    }


    @RequestMapping("/user")
    @ResponseBody
    public SysUser showUser(Long id) {
        SysUser user = sysUserService.getById(id);
        return user;
    }


}
