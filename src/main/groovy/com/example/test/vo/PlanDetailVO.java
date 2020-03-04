package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName: PlanDetailResp
 * Description: 合作方案详情
 * date: 2020/1/15 3:45 下午
 *
 * @author shiyawei
 * @version 1.0
 */
@Data
public class PlanDetailVO {

    @ApiModelProperty("基础服务费率title")
    private String baseServiceRateName;

    @ApiModelProperty("基础服务费率Value")
    private String baseServiceRate;

    @ApiModelProperty("基础服务费率Remark")
    private String baseServiceRateRemark;

    @ApiModelProperty("签约时长（月数）title")
    private String signMonthName;
    @ApiModelProperty("签约时长（月数）value ")
    private String signMonth;
    @ApiModelProperty("签约时长（月数）Remark")
    private String signMonthRemark;
}
