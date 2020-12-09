package cn.barry.tu.baseadmin.sys.sysuser.service;

import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import cn.barry.tu.baseadmin.common.pojo.Result;
import cn.barry.tu.baseadmin.common.service.CommonService;
import cn.barry.tu.baseadmin.sys.sysuser.pojo.SysUser;
import cn.barry.tu.baseadmin.sys.sysuser.vo.SysUserVo;

public interface SysUserService extends CommonService<SysUserVo, SysUser, String> {
    Result<SysUserVo> findByLoginName(String username);
    Result<SysUserVo> resetPassword(String userId);
    PersistentTokenRepository getPersistentTokenRepository2();
}
