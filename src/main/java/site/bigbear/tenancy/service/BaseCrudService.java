package site.bigbear.tenancy.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import site.bigbear.tenancy.po.BaseEntity;

/**
 * crud service基类
 * @author cheyantao
 */
public interface BaseCrudService<T extends BaseEntity> extends IService<T> {
}
