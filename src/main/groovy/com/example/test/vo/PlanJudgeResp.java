package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName: PlanJudgeResp
 * Description: 方案评估结果
 * date: 2020/1/15 4:01 下午
 *
 * @author shiyawei
 * @version 1.0
 */
@Data
public class PlanJudgeResp extends BasePlanDetailResp {

    @ApiModelProperty("评估方案key")
    private String  key;;
}
