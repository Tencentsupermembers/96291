package com.monke.work.presenter;

import com.monke.basemvplib.IPresenter;
import com.monke.work.bean.SearchBookBean;

public interface ISearchPresenter extends IPresenter{

    Boolean getHasSearch();

    void setHasSearch(Boolean hasSearch);

    void insertSearchHistory();

    void querySearchHistory();

    void cleanSearchHistory();

    int getPage();

    void initPage();

    void toSearchBooks(String key,Boolean fromError);

    void addBookToShelf(final SearchBookBean searchBookBean);

    Boolean getInput();

    void setInput(Boolean input);
}
