package com.zh.jpatest.model.protocol;

import lombok.Data;
import org.springframework.data.domain.Page;

/**
 * @author admin_z by 2019/12/17
 * @ClassName MsgPageInfo
 */
@Data
public class MsgPageInfo {
    private Integer page;

    private Integer size;

    private Long total;

    private Integer numberOfElements;

    public static MsgPageInfo loadFromPageable(Page<?> page) {
        MsgPageInfo msgPageInfo = new MsgPageInfo();
        msgPageInfo.setNumberOfElements(page.getNumberOfElements());
        msgPageInfo.setPage(page.getNumber());
        msgPageInfo.setSize(page.getSize());
        msgPageInfo.setTotal(page.getTotalElements());
        return msgPageInfo;
    }
}
