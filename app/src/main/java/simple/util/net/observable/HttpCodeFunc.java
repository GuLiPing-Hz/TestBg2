package simple.util.net.observable;

import simple.bean.CommonBean;

import rx.functions.Func1;

/**
 * Created by glp on 2016/8/19.
 */

public class HttpCodeFunc implements Func1<CommonBean,Integer> {
    @Override
    public Integer call(CommonBean commonBean) {
        if(commonBean != null)
            return commonBean.code;
        return -1;
    }
}
