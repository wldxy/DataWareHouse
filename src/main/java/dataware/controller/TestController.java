package dataware.controller;

import dataware.service.MovieService;
import dataware.util.DataConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by ocean on 17-1-2.
 */
@RestController
public class TestController {

    @Autowired
    @Qualifier("movieServiceHiveImpl")
    MovieService hiveService;

    @RequestMapping("/test")
    public String test() throws SQLException {
        Connection connection = DataConnection.getConnection("hive");

        if (connection == null)
            return "Null";
        else{
            connection.close();
            return "yes";
        }

    }

}
