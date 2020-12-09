package cn.barry.tu.baseadmin.sys.sysshortcutmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.barry.tu.baseadmin.common.controller.CommonController;
import cn.barry.tu.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import cn.barry.tu.baseadmin.sys.sysshortcutmenu.service.SysShortcutMenuService;
import cn.barry.tu.baseadmin.sys.sysshortcutmenu.vo.SysShortcutMenuVo;

@RestController
@RequestMapping("/sys/sysShortcutMenu/")
public class SysShortcutMenuController extends CommonController<SysShortcutMenuVo, SysShortcutMenu, String> {
    @Autowired
    private SysShortcutMenuService sysShortcutMenuService;
}
