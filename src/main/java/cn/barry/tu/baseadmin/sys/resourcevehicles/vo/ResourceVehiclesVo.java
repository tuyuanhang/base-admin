package cn.barry.tu.baseadmin.sys.resourcevehicles.vo;

import cn.barry.tu.baseadmin. common.pojo.PageCondition;import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class ResourceVehiclesVo extends PageCondition implements Serializable {
    private Integer id;//

    private String resourceCode;//

    private String resourceName;//

    private String resourceStatus;//

    private String capacity;//

    private String tel;//

    private String activeStatus;//

    private Date timestamp;//

    private String createdBy;//

    private Date createdDatetime;//

    private String updatedBy;//

    private Date updatedDatetime;//

}
