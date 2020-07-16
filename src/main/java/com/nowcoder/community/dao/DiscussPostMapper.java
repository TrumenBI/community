package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.ParameterScriptAssert;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //如果需要动态地拼接一个SQL语句条件，而条件需要用到该方法地唯一参数，这个参数就必须通过@Param("")注解取别名
    //即，@Param注解用于给参数取别名，
    //如果只有一个参数，且在<if>里使用，则必须取别名.
    int selectDiscussPostRows(@Param("userId") int userId);
}
