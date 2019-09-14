package com.linkpets.core.dao;

import com.linkpets.core.model.SysUser;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SysUserMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbg.generated  Mon Sep 09 17:37:59 GMT+08:00 2019
	 */
	@Delete({ "delete from sys_user", "where user_id = #{userId,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbg.generated  Mon Sep 09 17:37:59 GMT+08:00 2019
	 */
	@Insert({ "insert into sys_user (user_id, user_name, ", "user_acc, password, ", "role_id, is_active, ",
			"chain_id, union_id, ", "org_id, create_time, ", "update_time, is_valid)",
			"values (#{userId,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
			"#{userAcc,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
			"#{roleId,jdbcType=VARCHAR}, #{isActive,jdbcType=INTEGER}, ",
			"#{chainId,jdbcType=VARCHAR}, #{unionId,jdbcType=VARCHAR}, ",
			"#{orgId,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
			"#{updateTime,jdbcType=TIMESTAMP}, #{isValid,jdbcType=INTEGER})" })
	int insert(SysUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbg.generated  Mon Sep 09 17:37:59 GMT+08:00 2019
	 */
	int insertSelective(SysUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbg.generated  Mon Sep 09 17:37:59 GMT+08:00 2019
	 */
	@Select({ "select", "user_id, user_name, user_acc, password, role_id, is_active, chain_id, union_id, ",
			"org_id, create_time, update_time, is_valid", "from sys_user",
			"where user_id = #{userId,jdbcType=VARCHAR}" })
	@ResultMap("com.linkpets.core.dao.SysUserMapper.BaseResultMap")
	SysUser selectByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbg.generated  Mon Sep 09 17:37:59 GMT+08:00 2019
	 */
	int updateByPrimaryKeySelective(SysUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbg.generated  Mon Sep 09 17:37:59 GMT+08:00 2019
	 */
	@Update({ "update sys_user", "set user_name = #{userName,jdbcType=VARCHAR},",
			"user_acc = #{userAcc,jdbcType=VARCHAR},", "password = #{password,jdbcType=VARCHAR},",
			"role_id = #{roleId,jdbcType=VARCHAR},", "is_active = #{isActive,jdbcType=INTEGER},",
			"chain_id = #{chainId,jdbcType=VARCHAR},", "union_id = #{unionId,jdbcType=VARCHAR},",
			"org_id = #{orgId,jdbcType=VARCHAR},", "create_time = #{createTime,jdbcType=TIMESTAMP},",
			"update_time = #{updateTime,jdbcType=TIMESTAMP},", "is_valid = #{isValid,jdbcType=INTEGER}",
			"where user_id = #{userId,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(SysUser record);

	/**
     * 根据账号获取系统用户
     *
     * @param userName
     * @return
     */
    SysUser selectByUserName(String userName);

    @Select({ "select", "user_id, user_name, user_acc, password, role_id, is_active, chain_id, union_id, ",
		"org_id, create_time, update_time, is_valid", "from sys_user",
		"where is_active = 1 and is_valid = 1 and user_acc = #{userAcc,jdbcType=VARCHAR} and password = #{password,jdbcType=VARCHAR} ",
		"limit 0,1"})
    @ResultMap("com.linkpets.core.dao.SysUserMapper.BaseResultMap")
	SysUser getUserByAccountAndPassword(@Param("userAcc") String userAcc, @Param("password") String password);

    /**
     * 获取系统账号列表
     *
     * @param orgId
     * @param chainId
     * @return
     */
    List<SysUser> listSysUser(@Param("orgId") String orgId, @Param("chainId") String chainId);

    /**
     * 根据用户名获取账号信息
     *
     * @param userName
     * @return
     */
    SysUser getSysUserByUserName(@Param("userName") String userName);

	List<Map<String, Object>> getOrgUserList(String orgId);


}