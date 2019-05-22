package com.monke.work.view;

import com.monke.basemvplib.IView;
import com.monke.work.bean.SearchBookBean;
import com.monke.work.view.adapter.ChoiceBookAdapter;
import java.util.List;

public interface IChoiceBookView extends IView{

    void refreshSearchBook(List<SearchBookBean> books);

    void loadMoreSearchBook(List<SearchBookBean> books);

    void refreshFinish(Boolean isAll);

    void loadMoreFinish(Boolean isAll);

    void searchBookError();

    void addBookShelfSuccess(List<SearchBookBean> searchBooks);

    void addBookShelfFailed(int code);

    ChoiceBookAdapter getSearchBookAdapter();

    void updateSearchItem(int index);

    void startRefreshAnim();
}
