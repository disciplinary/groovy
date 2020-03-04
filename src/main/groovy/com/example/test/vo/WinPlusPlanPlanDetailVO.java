package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: PlanDetailResp
 * Description: WinPlusPlanPlanDetailVO
 * date: 2020/1/15 3:45 下午
 *
 * @author shiyawei
 * @version 1.0
 */
@Data
public class WinPlusPlanPlanDetailVO extends PlanDetailVO {

    @ApiModelProperty("OYO渠道抽佣Name")
    private String oyoChannelFeeName;

    @ApiModelProperty("OYO渠道抽佣")
    private BigDecimal oyoChannelFee;

    @ApiModelProperty("OYO渠道抽佣Remark")
    private String oyoChannelFeeRemark;
}
