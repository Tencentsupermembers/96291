package com.monke.work.presenter;

import com.monke.basemvplib.IPresenter;

public interface IMainPresenter extends IPresenter{
    void queryBookShelf(Boolean needRefresh);
}
