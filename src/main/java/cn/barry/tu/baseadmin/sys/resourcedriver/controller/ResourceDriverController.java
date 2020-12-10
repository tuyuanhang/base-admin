package cn.barry.tu.baseadmin.sys.resourcedriver.controller;

import cn.barry.tu.baseadmin.common.controller.*;
import cn.barry.tu.baseadmin.sys.resourcedriver.pojo.ResourceDriver;
import cn.barry.tu.baseadmin.sys.resourcedriver.vo.ResourceDriverVo;
import cn.barry.tu.baseadmin.sys.resourcedriver.service.ResourceDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sys/resourceDriver/")
public class ResourceDriverController extends CommonController<ResourceDriverVo, ResourceDriver, String> {
    @Autowired
    private ResourceDriverService resourceDriverService;
}
