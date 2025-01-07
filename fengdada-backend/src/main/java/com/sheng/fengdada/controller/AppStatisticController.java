package com.sheng.fengdada.controller;

import com.sheng.fengdada.common.BaseResponse;
import com.sheng.fengdada.common.ErrorCode;
import com.sheng.fengdada.common.ResultUtils;
import com.sheng.fengdada.exception.ThrowUtils;
import com.sheng.fengdada.mapper.UserAnswerMapper;
import com.sheng.fengdada.model.dto.statistic.AppAnswerCountDTO;
import com.sheng.fengdada.model.dto.statistic.AppAnswerResultCountDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/app/statistic")
public class AppStatisticController {

    @Resource
    private UserAnswerMapper userAnswerMapper;

    @GetMapping("/answer_count")
    public BaseResponse<List<AppAnswerCountDTO>> getAppAnswerCount() {
        return ResultUtils.success(userAnswerMapper.doAppAnswerCount());
    }

    @GetMapping("/answer_result_count")
    public BaseResponse<List<AppAnswerResultCountDTO>> getAppAnswerResultCount(Long appId) {
        ThrowUtils.throwIf(appId == null || appId <= 0, ErrorCode.PARAMS_ERROR);
        return ResultUtils.success(userAnswerMapper.doAppAnswerResultCount(appId));
    }
}
