/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import config.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Status;


/**
 *
 * @author Dell
 */
public class StatusRepository {
    
    public List<Status> select() throws SQLException {
        List<Status> list = null;
        Connection con = DBContext.getConnection();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from status");
        list = new ArrayList<>();
        while (rs.next()) {
            Status status = new Status();
           status.setId(rs.getInt("id"));
           status.setName(rs.getString("name"));
            list.add(status);
        }

        con.close();
        return list;
    }
}
