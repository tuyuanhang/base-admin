package cn.barry.tu.baseadmin.sys.sysmenu.repository;

import org.springframework.stereotype.Repository;

import cn.barry.tu.baseadmin.common.repository.*;
import cn.barry.tu.baseadmin.sys.sysmenu.pojo.SysMenu;

@Repository
public interface SysMenuRepository extends CommonRepository<SysMenu, String> {
}
