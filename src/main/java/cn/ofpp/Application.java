package cn.ofpp;

import cn.ofpp.core.BoyFriend;
import cn.ofpp.core.GirlFriend;
import cn.ofpp.core.MessageFactory;
import cn.ofpp.core.Wx;

/**
 * 启动类
 * 这个理论上只能用测试号 正式的号 个人认证是不支持模板消息的 企业认证的又必须使用微信模板库里的模板 只有测试的可以自定义模板内容
 * <a href="https://mp.weixin.qq.com/debug/cgi-bin/sandboxinfo?action=showinfo&t=sandbox/index">申请公众号测试应用地址</a>
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Application {

    /**
     * <li>创建配置</li>
     * <li>创建几个 男/女 朋友</li>
     * <li>发消息</li>
     */
    public static void main(String[] args) {
        // load and init
        Bootstrap.init();

        // -----------------  以下为演示数据  ------------------------

        // new 一个 女友
//        GirlFriend girlFriend = new GirlFriend("翁媛媛",
//                "湖北省", "天门市", "2001-08-28", "2020-03-14",
//                "oY0hF6DSk6LmLAxXVpowtF2QDNgo", "S1aZOKXYGMNmfV1CjQNVtHk7Oxx4fEYg0gBKDjP1jHY");
//        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend));

        GirlFriend girlFriend2 = new GirlFriend("徐子傲",
                "四川", "成都", "2001-08-28", "2020-03-14",
                "oY0hF6JHruL2m3LfAkDEK6QDtXsM", "S1aZOKXYGMNmfV1CjQNVtHk7Oxx4fEYg0gBKDjP1jHY");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend2));

        // new 一个 男友 也可单独针对一个friend设置模板ID 以达到不同人不同消息
        // BoyFriend boyFriend = new BoyFriend("某男友",
        //         "江苏省", "南京市", "1999-08-08", "2011-04-16", "oY0hF6JHruL2m3LfAkDEK6QDtXsM", "5t7-Ksy8_rw-QmUkxf8J7Pe-QLQ2rBc7RWJi_pSmeh4");
        // Wx.sendTemplateMessage(MessageFactory.resolveMessage(boyFriend));
    }

}
