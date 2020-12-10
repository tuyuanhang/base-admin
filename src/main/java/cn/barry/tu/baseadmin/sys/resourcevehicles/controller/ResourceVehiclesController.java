package cn.barry.tu.baseadmin.sys.resourcevehicles.controller;

import cn.barry.tu.baseadmin.common.controller.*;
import cn.barry.tu.baseadmin.sys.resourcevehicles.pojo.ResourceVehicles;
import cn.barry.tu.baseadmin.sys.resourcevehicles.vo.ResourceVehiclesVo;
import cn.barry.tu.baseadmin.sys.resourcevehicles.service.ResourceVehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sys/resourceVehicles/")
public class ResourceVehiclesController extends CommonController<ResourceVehiclesVo, ResourceVehicles, String> {
    @Autowired
    private ResourceVehiclesService resourceVehiclesService;
}
