package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName: PlanBaseVO
 * Description: 方案基本信息
 * date: 2020/1/15 4:03 下午
 *
 * @author shiyawei
 * @version 1.0
 */
@Data
public class PlanBaseVO {

    @ApiModelProperty("合作模式类型名称")
    private Integer cooperationModel;
    @ApiModelProperty("合作模式类型")
    private String cooperationModelName;

    @ApiModelProperty("合作类型")
    private String  cooperationType;
    @ApiModelProperty("合作类型名称")
    private String cooperationTypeName;

    /** 酒店房间数 */
    @ApiModelProperty("酒店房间数")
    private Integer roomNum;
    /** 签约房间总数 */
    @ApiModelProperty("签约房间总数")
    private Integer signedRoomNum;

    @ApiModelProperty("可售黑房数")
    private Integer sellableBlackRoomCount;

}
