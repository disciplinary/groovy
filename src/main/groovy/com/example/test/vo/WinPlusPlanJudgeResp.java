package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * ClassName: WinPlus
 * Description: 共赢宝评估
 * date: 2020/2/13 2:24 下午
 *
 * @author shiyawei
 * @version 1.0
 */
@ToString(callSuper = true)
@Data
public class WinPlusPlanJudgeResp extends BaseJudgePlanReq{

    @ApiModelProperty("OYO渠道抽佣")
    @NotNull(message = "OYO渠道抽佣不能为空")
    private BigDecimal oyoChannelFee;
}
