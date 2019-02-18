package com.bw.djr2019218.presenter;

import com.bw.djr2019218.model.OkHttpUtils;
import com.bw.djr2019218.view.ImainView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/**
 * @Auther: 董建茹
 * @Date: 2019/2/18 09:37:09
 * @Description:
 */
public class presenter  {
    private ImainView imainView;

    public  presenter(ImainView imainView) {
        this.imainView = imainView;
    }
    public void jiebang(){
        imainView=null;
    }
    public void qing (){
        final String url="http://apis.juhe.cn/cook/query?key=527e2a5b0406daea4e3b3d373c8ac850&menu=%E7%82%92%E8%8F%9C&rn=10&pn=3";
        new Thread(){
            @Override
            public void run() {
                super.run();
              OkHttpUtils.doGet(url, new Callback() {
                  @Override
                  public void onFailure(Call call, IOException e) {

                  }

                  @Override
                  public void onResponse(Call call, Response response) throws IOException {
                      String string = response.body().string();
                      imainView.getDate(string);
                  }
              });
            }
        }.start();
    }
}
