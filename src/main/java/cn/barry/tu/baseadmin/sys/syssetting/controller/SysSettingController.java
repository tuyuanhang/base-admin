package cn.barry.tu.baseadmin.sys.syssetting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cn.barry.tu.baseadmin.common.controller.CommonController;
import cn.barry.tu.baseadmin.sys.syssetting.pojo.SysSetting;
import cn.barry.tu.baseadmin.sys.syssetting.service.SysSettingService;
import cn.barry.tu.baseadmin.sys.syssetting.vo.SysSettingVo;
import cn.barry.tu.baseadmin.util.SysSettingUtil;

@RestController
@RequestMapping("/sys/sysSetting/")
public class SysSettingController extends CommonController<SysSettingVo, SysSetting, String> {
    @Autowired
    private SysSettingService sysSettingService;

    @GetMapping("setting")
    public ModelAndView setting() {
        return new ModelAndView("sys/setting/setting", "sys", SysSettingUtil.getSysSetting());
    }
}
