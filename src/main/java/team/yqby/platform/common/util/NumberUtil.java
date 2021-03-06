package team.yqby.platform.common.util;

import org.apache.http.client.utils.DateUtils;

import java.util.Date;

/**
 * <p>
 *     数字工具
 * </p>
 * User：jumping Date： 2017/1/5 0005 Version：1.0
 */
public class NumberUtil {

    /***
     * 生成订单号随机数
     * @return
     */
    public static String getOrderNoRandom(){
        return DateUtils.formatDate(new Date(), "YYMMDDHHMMSSs" + (int) ((Math.random() * 9 + 1) * 100));
    }
}
