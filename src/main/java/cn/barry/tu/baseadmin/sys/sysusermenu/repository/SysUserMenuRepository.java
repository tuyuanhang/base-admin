package cn.barry.tu.baseadmin.sys.sysusermenu.repository;

import org.springframework.stereotype.Repository;

import cn.barry.tu.baseadmin.common.repository.CommonRepository;
import cn.barry.tu.baseadmin.sys.sysusermenu.pojo.SysUserMenu;

import java.util.List;

@Repository
public interface SysUserMenuRepository extends CommonRepository<SysUserMenu, String> {
    List<SysUserMenu> findByUserId(String userId);
}
