package team.yqby.platform.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 手机号归属地标识
 * Author: luwanchuan
 * Date: 2017/1/2
 */
@ToString
@Getter
@Setter
public class PhoneBelongDto {

    @JSONField(name = "phoneBelong")
    private String phoneBelong;

}
