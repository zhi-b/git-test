import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    private IAccountService accountService;

    @Test
    public void testSpring(){
        accountService.findAll();
    }
}
