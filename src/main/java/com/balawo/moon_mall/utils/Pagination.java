package com.balawo.moon_mall.utils;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

@Data
public class Pagination<T> {
    private static final long serialVersionUID = 1L;
    //当前页
    private int currentPage;
    //每页的数量
    private int pageSize;
    //总记录数
    private long totalNum;
    //总页数
    private int totalPages;
    //结果集
    private List<T> list;


    public static <T> Pagination<T> initPage(PageInfo<T> pageInfo) {
        Pagination<T> result = new Pagination<T>();
        result.setCurrentPage(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotalNum(pageInfo.getTotal());
        result.setTotalPages(pageInfo.getPages());
        result.setList(pageInfo.getList());
        return result;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

}
