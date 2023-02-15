package com.ifohoo.firm25.ifms.middata.common.dto.core;

import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.dto.PageDto;

import java.util.List;

/**
 * 增加操作
 *
 * @author: hj
 * @date: 2023/2/14
 * @time: 5:12 PM
 */
public interface MidDataOperation<T> {


    /**
     * 初始化操作
     *
     */
    void init();

    /**
     * 增加操作
     *
     * @param t
     * @return
     */
    boolean add(T t);


    /**
     * 批量增加操作
     *
     * @param t
     * @return
     */
    boolean addAll(List<T> t);

    /**
     * 修改操作
     *
     * @param t
     * @return
     */
    boolean update(T t);

    /**
     * 删除操作
     *
     * @param t
     * @return
     */
    boolean delete(T t);

    /**
     * 查询操作
     *
     * @param t
     * @return
     */
    List<T> query(T t);


    /**
     * 分页查询操作
     *
     * @param t
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageDto<T> queryPage(T t, int pageNum, int pageSize);
}
