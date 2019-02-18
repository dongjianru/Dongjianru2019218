package com.bw.djr2019218.model;

import android.app.Application;
import android.os.Environment;

import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.io.File;

/**
 * @Auther: 董建茹
 * @Date: 2019/2/18 09:13:51
 * @Description:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        String path=Environment.getExternalStorageDirectory().getPath()+"/RiKao13";
        File file = new File(path);
        ImageLoaderConfiguration configuration=new ImageLoaderConfiguration.Builder(this)
                .memoryCacheExtraOptions(200,200)
                .memoryCacheSize(2*1024*1024)
                .threadPoolSize(3)
                .threadPriority(1000)
                .diskCacheSize(50*1024*1024)
                .diskCache(new UnlimitedDiskCache(file))
                .diskCacheFileNameGenerator(new Md5FileNameGenerator())
                .diskCacheFileCount(50).build();
        ImageLoader.getInstance().init(configuration);

    }
}
