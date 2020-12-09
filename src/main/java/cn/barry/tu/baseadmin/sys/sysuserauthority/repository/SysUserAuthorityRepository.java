package cn.barry.tu.baseadmin.sys.sysuserauthority.repository;

import org.springframework.stereotype.Repository;

import cn.barry.tu.baseadmin.common.repository.CommonRepository;
import cn.barry.tu.baseadmin.sys.sysuserauthority.pojo.SysUserAuthority;

import java.util.List;

@Repository
public interface SysUserAuthorityRepository extends CommonRepository<SysUserAuthority, String> {
    List<SysUserAuthority> findByUserId(String userId);
}
