package cn.barry.tu.baseadmin.sys.resourcedriver.vo;

import cn.barry.tu.baseadmin. common.pojo.PageCondition;import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class ResourceDriverVo extends PageCondition implements Serializable {
    private Integer id;//

    private String resourceCode;//

    private String resourceName;//

    private String resourceStatus;//

    private Date timestamp;//

    private String createdBy;//

    private Date createdDatetime;//

    private String updatedBy;//

    private Date updatedDatetime;//

}
