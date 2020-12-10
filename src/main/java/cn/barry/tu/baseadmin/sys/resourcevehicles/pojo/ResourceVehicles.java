package cn.barry.tu.baseadmin.sys.resourcevehicles.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "resource_vehicles")
@Data
public class ResourceVehicles implements Serializable {
    @Id
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
