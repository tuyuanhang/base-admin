package cn.barry.tu.baseadmin.sys.sysuserauthority.service;

import java.util.List;

import cn.barry.tu.baseadmin.common.pojo.Result;
import cn.barry.tu.baseadmin.common.service.CommonService;
import cn.barry.tu.baseadmin.sys.sysuserauthority.pojo.SysUserAuthority;
import cn.barry.tu.baseadmin.sys.sysuserauthority.vo.SysUserAuthorityVo;

public interface SysUserAuthorityService extends CommonService<SysUserAuthorityVo, SysUserAuthority, String> {
    Result<List<SysUserAuthorityVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String authorityIdList);
}
