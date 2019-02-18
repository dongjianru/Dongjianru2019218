package com.bw.djr2019218.model;

/**
 * @Auther: 董建茹
 * @Date: 2019/2/18 09:02:13
 * @Description:
 */
public class JavaBean1 {
//    {
//        "error_code": 0,
//            "reason": "Success",
//            "result": {
//        "data": [
//        {
//            "albums": [
//            "http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/t/3/2582_722627.jpg"
//                ],
//            "burden": "葱,适量;小辣椒,适量;盐,1勺;鸡精,0.25勺",
//                "id": "2582",
//                "imtro": "绿的菜心碧绿，红的小辣椒鲜艳，看了这样的一道菜在餐桌上，是不是感觉配碗白米饭吃吃就很香？ 很多人说鱼鱼做的菜漂亮，其实所有人做出的这样的炒蔬菜都是一个味道 只不过，鱼鱼更用心地去摆了摆盘子，整个餐桌就显得秀丽起来 我们生活，不止是为了吃 我们吃，也不仅仅就是为了品尝味道 现在大多数人不担心温饱问题，那就花上不到1分钟的时间 把炒好的菜菜在盘子里摆一下 让家人的心情都愉悦起来，让春天的气息也跑到餐桌上去吧",
//                "ingredients": "菜心,100g",
//                "steps": [
//            {
//                "img": "http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/26/2582_6fca0e2abb581d3f.jpg",
//                    "step": "1.菜心洗净，沥干水分。辣椒和葱切碎备用"
//            },
//            {
//                "img": "http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/26/2582_bafe7de7bee985bc.jpg",
//                    "step": "2.锅内放油，先放入辣椒炒香"
//            },
//            {
//                "img": "http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/26/2582_0f02b2784c01c5af.jpg",
//                    "step": "3.然后放入葱炒香"
//            },
//            {
//                "img": "http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/26/2582_6fc26e021d8751be.jpg",
//                    "step": "4.放入洗好的菜心翻炒"
//            },
//            {
//                "img": "http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/26/2582_f034297bfc21a3a5.jpg",
//                    "step": "5.待菜心变软，调入适量盐和鸡精即可出锅"
//            }
//                ],
//            "tags": "家常菜;热菜;咸;10分钟内;炒;简单;干辣椒;孕妇;青少年;素菜;白菜薹;全菜系;1-2人;炒锅;中等难度",
//                "title": "素炒菜心"
//        }
//        ],
//        "pn": "3",
//                "rn": "10",
//                "totalNum": "106"
//    },
//        "resultcode": "200"
//    }
    private String img;
    private String step;

    public JavaBean1(String img, String step) {
        this.img = img;
        this.step = step;
    }

    public JavaBean1() {
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return "JavaBean1{" +
                "img='" + img + '\'' +
                ", step='" + step + '\'' +
                '}';
    }
}
