package cn.barry.tu.baseadmin.sys.resourcevehicles.service;

import cn.barry.tu.baseadmin.common.service.*;
import cn.barry.tu.baseadmin.sys.resourcevehicles.pojo.ResourceVehicles;
import cn.barry.tu.baseadmin.sys.resourcevehicles.vo.ResourceVehiclesVo;
import cn.barry.tu.baseadmin.sys.resourcevehicles.repository.ResourceVehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class ResourceVehiclesServiceImpl extends CommonServiceImpl<ResourceVehiclesVo, ResourceVehicles, String> implements ResourceVehiclesService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private ResourceVehiclesRepository resourceVehiclesRepository;
}
