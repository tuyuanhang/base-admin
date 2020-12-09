package cn.barry.tu.baseadmin.sys.sysuser.repository;

import org.springframework.stereotype.Repository;

import cn.barry.tu.baseadmin.common.repository.*;
import cn.barry.tu.baseadmin.sys.sysuser.pojo.SysUser;

@Repository
public interface SysUserRepository extends CommonRepository<SysUser, String> {
    SysUser findByLoginName(String username);
}
