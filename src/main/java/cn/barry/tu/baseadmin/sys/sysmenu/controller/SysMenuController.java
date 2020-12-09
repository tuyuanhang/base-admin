package cn.barry.tu.baseadmin.sys.sysmenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cn.barry.tu.baseadmin.annotation.Decrypt;
import cn.barry.tu.baseadmin.annotation.Encrypt;
import cn.barry.tu.baseadmin.common.controller.CommonController;
import cn.barry.tu.baseadmin.common.pojo.Result;
import cn.barry.tu.baseadmin.sys.sysmenu.pojo.SysMenu;
import cn.barry.tu.baseadmin.sys.sysmenu.service.SysMenuService;
import cn.barry.tu.baseadmin.sys.sysmenu.vo.SysMenuVo;

import java.util.List;

@RestController
@RequestMapping("/sys/sysMenu/")
public class SysMenuController extends CommonController<SysMenuVo, SysMenu, String> {
    @Autowired
    private SysMenuService sysMenuService;

    @GetMapping("menu")
    public ModelAndView menu(){
        return new ModelAndView("sys/menu/menu");
    }

    /**
     * 分层级
     */
    @PostMapping("listByTier")
    @Decrypt
    @Encrypt
    public Result<List<SysMenuVo>> listByTier(SysMenuVo entityVo) {
        return sysMenuService.listByTier(entityVo);
    }
}
