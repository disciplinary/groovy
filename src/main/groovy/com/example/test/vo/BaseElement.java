package com.oyo.apollo.bff.mobile.controller.cooperationplan.vo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author shiwei.feng
 */
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible =
        true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = StartEvent.class, name = "startEvent"),
        @JsonSubTypes.Type(value = EndEvent.class, name = "endEvent"),
        @JsonSubTypes.Type(value = EndEvent.class, name = "event")
})
public class BaseElement {
    @NotNull(message = "Id不能为空")
    String id;
    @NotNull(message = "type不能为空")
    String type;
}
