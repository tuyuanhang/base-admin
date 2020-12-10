package cn.barry.tu.baseadmin.sys.resourcedriver.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "resource_driver")
@Data
public class ResourceDriver implements Serializable {
    @Id
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
