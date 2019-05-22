package com.monke.work.presenter;

import com.monke.basemvplib.IPresenter;
import com.monke.work.bean.SearchBookBean;

public interface IChoiceBookPresenter extends IPresenter{

    int getPage();

    void initPage();

    void toSearchBooks(String key);

    void addBookToShelf(final SearchBookBean searchBookBean);

    String getTitle();
}