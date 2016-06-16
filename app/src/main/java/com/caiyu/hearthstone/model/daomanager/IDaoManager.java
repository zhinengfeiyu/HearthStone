package com.caiyu.hearthstone.model.daomanager;

import java.util.List;

/**
 * Created by 渝 on 2016/1/30.
 */
public interface IDaoManager<T> {

    void addData(T t);  //增加一条记录

    void deleteByKey(long id);  //根据主键删除一条记录

    T getDataById(long id); //根据主键查找一条记录

    List<T> getAll();   //获得所有记录

    void update(T t);   //更新一条记录

}
