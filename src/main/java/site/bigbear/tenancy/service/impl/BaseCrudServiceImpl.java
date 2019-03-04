package site.bigbear.tenancy.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import site.bigbear.tenancy.po.BaseEntity;
import site.bigbear.tenancy.service.BaseCrudService;

public class BaseCrudServiceImpl<T extends BaseEntity,M extends BaseMapper<T>> extends ServiceImpl<M,T> implements BaseCrudService<T> {
}
