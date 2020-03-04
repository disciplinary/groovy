package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import com.oyo.apollo.bff.mobile.controller.cooperationplan.domain.ApplyRemarkAndEvidence;
import com.oyo.apollo.bff.mobile.controller.cooperationplan.dto.CooperationPlanFlowVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName: PlanJudgeResp
 * Description: 方案详情
 * date: 2020/1/15 4:01 下午
 *
 * @author shiyawei
 * @version 1.0
 */
@Data
public class PlanDetailResp extends BasePlanDetailResp {

    @ApiModelProperty("审批流程")
    private CooperationPlanFlowVO flowData;

    @ApiModelProperty("特批说明和证明")
    private ApplyRemarkAndEvidence applyRemarkAndEvidence;

    @ApiModelProperty("方案ID")
    private Long planId;

    @ApiModelProperty("酒店ID")
    private Long hotelId;

    @ApiModelProperty("评估结果页是否可编辑")
    private Boolean editable = true;

}
