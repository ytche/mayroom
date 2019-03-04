package site.bigbear.tenancy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import site.bigbear.tenancy.po.BaseEntity;

/**
 * @author cheyantao
 */
public interface BaseCrudMapper<T extends BaseEntity> extends BaseMapper<T> {

}
