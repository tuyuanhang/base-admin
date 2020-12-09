package cn.barry.tu.baseadmin.common.service;


import java.util.List;

import cn.barry.tu.baseadmin.common.pojo.PageInfo;
import cn.barry.tu.baseadmin.common.pojo.Result;

/**
 * 通用Service
 *
 * @param <V> 实体类Vo
 * @param <E> 实体类
 * @param <T> id主键类型
 */
public interface CommonService<V, E,T> {

    Result<PageInfo<V>> page(V entityVo);

    Result<List<V>> list(V entityVo);

    Result<V> get(T id);

    Result<V> save(V entityVo);

    Result<T> delete(T id);
}
