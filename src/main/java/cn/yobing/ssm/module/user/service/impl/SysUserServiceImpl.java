package cn.yobing.ssm.module.user.service.impl;

import cn.yobing.ssm.module.user.mapper.SysUserMapper;
import cn.yobing.ssm.module.user.pojo.SysUser;
import cn.yobing.ssm.module.user.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/1.
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getById(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
