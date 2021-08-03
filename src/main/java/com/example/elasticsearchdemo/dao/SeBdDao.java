package com.example.elasticsearchdemo.dao;

import com.example.elasticsearchdemo.pojo.SeBd;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SeBd)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-27 19:19:49
 */
@Mapper
public interface SeBdDao {

    /**
     * 通过ID查询单条数据
     *
     * @param urid 主键
     * @return 实例对象
     */
    SeBd queryById(Integer urid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SeBd> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param seBd 实例对象
     * @return 对象列表
     */
    List<SeBd> queryAll(SeBd seBd);

    List<SeBd> selectAll();
    /**
     * 新增数据
     *
     * @param seBd 实例对象
     * @return 影响行数
     */
    int insert(SeBd seBd);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SeBd> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SeBd> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SeBd> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SeBd> entities);

    /**
     * 修改数据
     *
     * @param seBd 实例对象
     * @return 影响行数
     */
    int update(SeBd seBd);

    /**
     * 通过主键删除数据
     *
     * @param urid 主键
     * @return 影响行数
     */
    int deleteById(Integer urid);

}

