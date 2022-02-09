package contextListener;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClearJDBCContextListener implements ServletContextListener {

    private Logger logger = Logger.getLogger(ClearJDBCContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {}

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        try {
            while(DriverManager.getDrivers().hasMoreElements()) {
                DriverManager.deregisterDriver(DriverManager.getDrivers().nextElement());
            }
            logger.info("jdbc Driver close");
            AbandonedConnectionCleanupThread.checkedShutdown();
            logger.info("clean thread success");
            /*获取c3p0连接池
            ApplicationContext ctx = new ClassPathXmlApplicationContext("../WEB-INF/dispatcher-servlet.xml");
            DataSource dataSource = (DataSource) ctx.getBean("dataSource");
            dataSource.getConnection().close();
            //JDBCUtil.getDataSource().close();*/
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
