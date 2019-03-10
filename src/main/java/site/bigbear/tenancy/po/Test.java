package site.bigbear.tenancy.po;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * test
 * @author cheyantao
 */
@TableName("base_test")
public class Test extends BaseEntity{
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
