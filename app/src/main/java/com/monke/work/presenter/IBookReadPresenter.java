package com.monke.work.presenter;

import android.app.Activity;

import com.monke.basemvplib.IPresenter;
import com.monke.work.bean.BookShelfBean;
import com.monke.work.presenter.impl.ReadBookPresenterImpl;
import com.monke.work.widget.contentswitchview.BookContentView;

public interface IBookReadPresenter extends IPresenter{

    int getOpen_from();

    BookShelfBean getBookShelf();

    void initContent();

    void loadContent(BookContentView bookContentView,long bookTag, final int chapterIndex, final int page);

    void updateProgress(int chapterIndex, int pageIndex);

    void saveProgress();

    String getChapterTitle(int chapterIndex);

    void setPageLineCount(int pageLineCount);

    void addToShelf(final ReadBookPresenterImpl.OnAddListner addListner);

    Boolean getAdd();

    void initData(Activity activity);

    void openBookFromOther(Activity activity);
}
