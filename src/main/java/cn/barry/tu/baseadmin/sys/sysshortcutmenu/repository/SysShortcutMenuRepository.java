package cn.barry.tu.baseadmin.sys.sysshortcutmenu.repository;

import org.springframework.stereotype.Repository;

import cn.barry.tu.baseadmin.common.repository.CommonRepository;
import cn.barry.tu.baseadmin.sys.sysshortcutmenu.pojo.SysShortcutMenu;

import java.util.List;

@Repository
public interface SysShortcutMenuRepository extends CommonRepository<SysShortcutMenu, String> {
    List<SysShortcutMenu> findByUserId(String userId);
}
