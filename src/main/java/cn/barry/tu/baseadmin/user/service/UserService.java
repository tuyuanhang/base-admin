package cn.barry.tu.baseadmin.user.service;

import cn.barry.tu.baseadmin.common.pojo.Result;
import cn.barry.tu.baseadmin.sys.sysuser.vo.SysUserVo;

public interface UserService {
    Result<SysUserVo> updatePassword(String oldPassword, String newPassword);

    Result<SysUserVo> updateUser(SysUserVo sysUserVo);
}
