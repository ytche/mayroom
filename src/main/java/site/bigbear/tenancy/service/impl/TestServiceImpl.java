package site.bigbear.tenancy.service.impl;

import org.springframework.stereotype.Service;
import site.bigbear.tenancy.mapper.TestMapper;
import site.bigbear.tenancy.po.Test;
import site.bigbear.tenancy.service.TestService;

/**
 * @author cheyantao
 */
@Service
public class TestServiceImpl extends BaseCrudServiceImpl<Test,TestMapper> implements TestService {
}
