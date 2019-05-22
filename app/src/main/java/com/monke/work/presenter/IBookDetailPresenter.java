package com.monke.work.presenter;

import com.monke.basemvplib.IPresenter;
import com.monke.work.bean.BookShelfBean;
import com.monke.work.bean.SearchBookBean;

public interface IBookDetailPresenter extends IPresenter{

    int getOpenfrom();

    SearchBookBean getSearchBook();

    BookShelfBean getBookShelf();

    Boolean getInBookShelf();

    void getBookShelfInfo();

    void addToBookShelf();

    void removeFromBookShelf();
}
