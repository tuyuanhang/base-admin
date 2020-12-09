package cn.barry.tu.baseadmin.sys.sysshortcutmenu.service;

import java.util.List;

import cn.barry.tu.baseadmin.common.pojo.Result;
import cn.barry.tu.baseadmin.common.service.CommonService;
import cn.barry.tu.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import cn.barry.tu.baseadmin.sys.sysshortcutmenu.vo.SysShortcutMenuVo;

public interface SysShortcutMenuService extends CommonService<SysShortcutMenuVo, SysShortcutMenu, String> {
    Result<List<SysShortcutMenuVo>> findByUserId(String userId);
}
