package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * ClassName: PlanJudgeResp
 * Description: 评估结果和保存过合作方案共用部分
 * date: 2020/1/15 4:01 下午
 *
 * @author shiyawei
 * @version 1.0
 */
@Data
public class BasePlanDetailResp {

    @ApiModelProperty("方案基本信息")
    private PlanBaseVO basePlanInfo;

    @ApiModelProperty("方案详情(父类)")
    private PlanDetailVO planDetailVO;

    @ApiModelProperty("酒店ID")
    private Long hotelId;

    @ApiModelProperty("方案状态")
    private String status;
@NotNull
    @ApiModelProperty("评估结果名称")
    private String statusName;

}
