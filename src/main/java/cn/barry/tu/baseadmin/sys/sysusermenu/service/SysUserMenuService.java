package cn.barry.tu.baseadmin.sys.sysusermenu.service;

import java.util.List;

import cn.barry.tu.baseadmin.common.pojo.Result;
import cn.barry.tu.baseadmin.common.service.CommonService;
import cn.barry.tu.baseadmin.sys.sysmenu.vo.SysMenuVo;
import cn.barry.tu.baseadmin.sys.sysusermenu.pojo.SysUserMenu;
import cn.barry.tu.baseadmin.sys.sysusermenu.vo.SysUserMenuVo;

public interface SysUserMenuService extends CommonService<SysUserMenuVo, SysUserMenu, String> {
    Result<List<SysMenuVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String menuIdList);
}
