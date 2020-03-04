package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SavePlanReq {

    private BasePlanDetailResp coopPlanData;

    @ApiModelProperty("方案id")
    private Long id;

   /** private Long hotelId;

    private String name;


    @ApiModelProperty("评估方案key")
    private String  key;;**/

}