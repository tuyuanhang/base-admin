package cn.barry.tu.baseadmin.sys.sysmenu.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.barry.tu.baseadmin.common.pojo.PageCondition;

@Data
public class SysMenuVo extends PageCondition implements Serializable {
    private String menuId;//菜单id

    private String menuName;//菜单名称

    private String menuPath;//菜单路径

    private String menuParentId;//上级id

    private Date createTime;//创建时间

    private Date updateTime;//修改时间

    private List<SysMenuVo> children = new ArrayList<>();//如果是父类，这里存孩子节点
}
