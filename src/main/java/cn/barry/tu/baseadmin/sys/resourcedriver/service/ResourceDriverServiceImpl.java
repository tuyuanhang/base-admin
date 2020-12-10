package cn.barry.tu.baseadmin.sys.resourcedriver.service;

import cn.barry.tu.baseadmin.common.service.*;
import cn.barry.tu.baseadmin.sys.resourcedriver.pojo.ResourceDriver;
import cn.barry.tu.baseadmin.sys.resourcedriver.vo.ResourceDriverVo;
import cn.barry.tu.baseadmin.sys.resourcedriver.repository.ResourceDriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class ResourceDriverServiceImpl extends CommonServiceImpl<ResourceDriverVo, ResourceDriver, String> implements ResourceDriverService{

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private ResourceDriverRepository resourceDriverRepository;
}
