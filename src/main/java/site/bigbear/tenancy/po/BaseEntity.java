package site.bigbear.tenancy.po;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 数据库对应实体基类
 * @author cheyantao
 */
public class BaseEntity {
    @TableId
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
