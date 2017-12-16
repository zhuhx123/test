package cn.com.ssm.admin;

import cn.com.ssm.admin.service.web.provider.TestService;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Nathy on 2017/12/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:configs/spring/applicationContexts.xml"})
public class MongodbTest {
    private Logger logger = Logger.getLogger(MongodbTest.class);

    @Autowired
    TestService testService;
    @org.junit.Test
    public void insert() {
        System.out.print(testService.s());
    }
}
