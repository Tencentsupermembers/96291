package com.monke.work.model;

import com.monke.work.bean.LibraryBean;
import com.monke.work.bean.SearchBookBean;
import com.monke.work.cache.ACache;
import java.util.List;
import io.reactivex.Observable;

public interface IGxwztvBookModel extends IStationBookModel {

    Observable<List<SearchBookBean>> getKindBook(String url, int page);

    /**
     * 获取主页信息
     */
    Observable<LibraryBean> getLibraryData(ACache aCache);

    /**
     * 解析主页数据
     */
    Observable<LibraryBean> analyLibraryData(String data);
}
