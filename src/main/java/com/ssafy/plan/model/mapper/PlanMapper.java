package com.ssafy.plan.model.mapper;

import com.ssafy.member.model.dto.MemberDto;
import com.ssafy.plan.model.dto.PlanDetailDto;
import com.ssafy.plan.model.dto.PlanDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlanMapper {
    List<PlanDto> findPlansByMemberDto(MemberDto memberDto);
    List<PlanDetailDto> findPlanDetailsByPlanDto(PlanDto planDto);

    void addPlan(PlanDto planDto);

    void addPlanDetails(List<PlanDetailDto> planDetailDtoList);

    void deletePlanDetails(int planId);
}
