package com.android.jsoupdemo.Utility;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by liurenyi on 2017/4/14.
 */
public class CreateDialogUtil {

    private Context context;
    private ProgressDialog dialog;

    public CreateDialogUtil(Context context) {
        this.context = context;
        dialog = new ProgressDialog(context);
    }

    public void createDialog() {
        dialog.setTitle("歇后语");
        dialog.setIcon(android.R.mipmap.sym_def_app_icon);
        dialog.setMessage("正在加载，请等待....");
        dialog.show();
    }

    public void dismissDialog() {
        dialog.dismiss();
    }

}
