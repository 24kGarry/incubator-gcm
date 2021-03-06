package io.edurt.gcm.mysql.hikari;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * HikariDataSourceModule Tester.
 *
 * @author qianmoq
 * @version 1.0
 * @since <pre>1月 5, 2021</pre>
 */
public class TestHikariDataSourceModule
{
    @Before
    public void before()
    {
    }

    @After
    public void after()
    {
    }

    /**
     * Method: initialize()
     */
    @Test
    public void test()
    {
        Guice.createInjector(new HikariDataSourceModule());
    }
} 
