package cn.barry.tu.baseadmin.sys.sysmenu.service;

import java.util.List;

import cn.barry.tu.baseadmin.common.pojo.Result;
import cn.barry.tu.baseadmin.common.service.*;
import cn.barry.tu.baseadmin.sys.sysmenu.pojo.SysMenu;
import cn.barry.tu.baseadmin.sys.sysmenu.vo.SysMenuVo;

public interface SysMenuService extends CommonService<SysMenuVo, SysMenu, String> {
    Result<List<SysMenuVo>> listByTier(SysMenuVo entityVo);
}
