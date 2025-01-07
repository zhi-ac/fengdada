package com.sheng.fengdada.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sheng.fengdada.model.dto.statistic.AppAnswerCountDTO;
import com.sheng.fengdada.model.dto.statistic.AppAnswerResultCountDTO;
import com.sheng.fengdada.model.entity.UserAnswer;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author zzs
* @description 针对表【user_answer(用户答题记录)】的数据库操作Mapper
* @createDate 2024-12-19 20:13:57
* @Entity generator.domain.UserAnswer
*/
public interface UserAnswerMapper extends BaseMapper<UserAnswer> {
    @Select("select appid, count(id) as answerCount from user_answer " +
            "group by appid order by answerCount desc limit 10")
    List<AppAnswerCountDTO> doAppAnswerCount();

    @Select("select resultName, count(id) as resultCount from user_answer " +
            "where appId = #{appId} group by resultName order by resultCount desc")
    List<AppAnswerResultCountDTO> doAppAnswerResultCount(Long appId);
}




