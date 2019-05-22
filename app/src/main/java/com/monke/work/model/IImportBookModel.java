package com.monke.work.model;

import com.monke.work.bean.LocBookShelfBean;
import java.io.File;
import io.reactivex.Observable;

public interface IImportBookModel {

    Observable<LocBookShelfBean> importBook(File book);
}
