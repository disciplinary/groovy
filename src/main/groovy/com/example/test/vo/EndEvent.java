package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @author shiwei.feng
 */
@ToString(callSuper = true)
@Data
public class EndEvent extends BaseElement{
    @NotNull(message = "endEvent不能为空")
    private String endEvent;
    private String endInfo;
}