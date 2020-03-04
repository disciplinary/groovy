package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @author oyo02933
 */
@ToString(callSuper = true)
@Data
public class StartEvent extends BaseElement {
    @NotNull(message = "startEvent不能为空")
    private String startEvent;

    private String startInfo;

}