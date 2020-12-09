package cn.barry.tu.baseadmin.sys.syssetting.repository;

import org.springframework.stereotype.Repository;

import cn.barry.tu.baseadmin.common.repository.*;
import cn.barry.tu.baseadmin.sys.syssetting.pojo.SysSetting;

@Repository
public interface SysSettingRepository extends CommonRepository<SysSetting, String> {
}
