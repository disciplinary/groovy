package com.oyo.apollo.bff.mobile.controller.cooperationplan;

import com.oyo.apollo.bff.mobile.controller.BaseInfoController;
import com.oyo.apollo.bff.mobile.controller.cooperationplan.vo.BaseJudgePlanReq;
import com.oyo.apollo.bff.mobile.controller.cooperationplan.vo.PlanDetailResp;
import com.oyo.apollo.bff.mobile.controller.cooperationplan.vo.PlanJudgeResp;
import com.oyo.apollo.bff.mobile.controller.cooperationplan.vo.SavePlanReq;
import com.oyo.apollo.bff.mobile.enums.PlanTypeAndGroupCodeEnum;
import com.oyo.apollo.bff.mobile.integration.cooperationplan.bo.DrmCooperationPlanDTO;
import com.oyo.apollo.bff.mobile.rop.base.RopResponse;
import com.oyo.apollo.bff.mobile.service.AbstractCooperationService;
import com.oyo.apollo.bff.mobile.service.CooperationService;
import com.oyo.apollo.bff.mobile.util.SpringBeanUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: CooperationPlanController
 * Description: 合作方案Controller
 * date: 2020/1/17 2:46 下午
 *
 * @author shiyawei
 * @version 1.0
 */

@Slf4j
@RestController
@RequestMapping("/api/v2/drm/app/cooperationPlan")
@Api(tags = "drm 合作方案 API")
public class CooperationPlanController  extends BaseInfoController {
    @Autowired
    private CooperationService cooperationService;

    @GetMapping(value = "queryPlanById")
    @ApiOperation(value = "根据合作方案ID查看合作方案信息")
    public RopResponse<DrmCooperationPlanDTO> queryPlanById(@RequestParam Long cooperationPlanId) {
        PlanTypeAndGroupCodeEnum planTypeAndGroupCodeEnum=cooperationService.queryById(cooperationPlanId);
        AbstractCooperationService serviceProvider= (AbstractCooperationService) SpringBeanUtil.getBean(planTypeAndGroupCodeEnum.getType());
        return RopResponse.success(serviceProvider.queryById(cooperationPlanId));
    }


    /**
     * 评估方案
     * @param judgePlanReq
     * @return
     */
    @GetMapping(value = "judgePlan")
    @ApiOperation(value = "评估合作方案")
    public RopResponse<PlanJudgeResp> judgePlan(BaseJudgePlanReq judgePlanReq){
        AbstractCooperationService serviceProvider= (AbstractCooperationService) SpringBeanUtil.getBean(judgePlanReq.getCooperationType());
        return serviceProvider.judgePlan(judgePlanReq);

    }


    /**
     * 查询合作方案详情
     * @param hotelId
     * @return
     */
    @GetMapping(value = "judgePlan")
    @ApiOperation(value = "评估合作方案")
    RopResponse<PlanDetailResp> judgePlanDetail(Long hotelId, Long planId){
        PlanTypeAndGroupCodeEnum planTypeAndGroupCodeEnum=cooperationService.queryById(planId);
        AbstractCooperationService serviceProvider= (AbstractCooperationService) SpringBeanUtil.getBean(planTypeAndGroupCodeEnum.getType());
        return serviceProvider.judgePlanDetail(hotelId,planId);

    }

    /**
     * 保存合作方案
     * @param savePlanReq
     * @return
     */
    public RopResponse savePlan(SavePlanReq savePlanReq) {
       String cooperationType= savePlanReq.getCoopPlanData().getBasePlanInfo().getCooperationType();
        AbstractCooperationService serviceProvider= (AbstractCooperationService) SpringBeanUtil.getBean(cooperationType);
        return serviceProvider.savePlan(savePlanReq);

    }

}
