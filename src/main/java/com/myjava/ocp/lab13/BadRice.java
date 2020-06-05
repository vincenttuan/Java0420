package com.myjava.ocp.lab13;

public class BadRice {
    public String Title;
    public String 編號;
    public String 品名;
    public String 國際條碼;
    public String 廠商名稱;
    public String 廠商地址;
    public String 檢驗結果;
    public String 不合格原因;
    public String 違反規定;
    public String 行政處分;
    public String Log_UpdateTime;

    @Override
    public String toString() {
        return "BadRice{" + "Title=" + Title + ", \u7de8\u865f=" + 編號 + ", \u54c1\u540d=" + 品名 + ", \u570b\u969b\u689d\u78bc=" + 國際條碼 + ", \u5ee0\u5546\u540d\u7a31=" + 廠商名稱 + ", \u5ee0\u5546\u5730\u5740=" + 廠商地址 + ", \u6aa2\u9a57\u7d50\u679c=" + 檢驗結果 + ", \u4e0d\u5408\u683c\u539f\u56e0=" + 不合格原因 + ", \u9055\u53cd\u898f\u5b9a=" + 違反規定 + ", \u884c\u653f\u8655\u5206=" + 行政處分 + ", Log_UpdateTime=" + Log_UpdateTime + '}';
    }
    
    
}
