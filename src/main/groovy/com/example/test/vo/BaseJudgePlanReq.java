package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: PlanDetailResp
 * Description: 合作方案填写 公共部分
 * date: 2020/1/15 3:45 下午
 *
 * @author shiyawei
 * @version 1.0
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "cooperationType", visible =
        true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = WinPlusPlanJudgeResp.class, name = "CHINA_2_WIN_PLUS"),
        @JsonSubTypes.Type(value = EndEvent.class, name = "event")
})
@Data
public class BaseJudgePlanReq {

    @ApiModelProperty("方案ID")
    private Long planId;

    @ApiModelProperty("酒店ID")
    private Long hotelId;

    @ApiModelProperty("合作类型")
    private String cooperationType;

    @ApiModelProperty("合作类型名称")
    private String cooperationTypeName;

    @ApiModelProperty("基础服务费率")
    private BigDecimal baseServiceRate;

    @ApiModelProperty("是否易耗品")
    private Boolean supplyConsumables;

    @ApiModelProperty("易耗品服务类型：1-尊享,2-智享")
    private String consumableServiceType;

    @ApiModelProperty("易耗品服务类型名称：1-尊享,2-智享")
    private String consumableServiceTypeName;

    @ApiModelProperty("易耗品服务费率")
    private String consumableServiceRate;

    @ApiModelProperty("签约时长")
    private Integer signedMonths;

    @ApiModelProperty("是否重谈")
    private String renegotiation;

   private Long UserId;




}