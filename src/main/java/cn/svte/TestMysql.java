package cn.svte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestMysql {


    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        long l1 = System.currentTimeMillis();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://172.16.20.124:3306/micro_paas_test?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true", "root", "123456")) {
            try (PreparedStatement stmt = conn.prepareStatement("select * from dockerfiles")) {
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(rs.getString(1) + "->" + rs.getString(2));
                        System.out.println("----------------------------------------------------------");
                    }
                }
            }
        }
        long l2 = System.currentTimeMillis();
        System.out.println("总耗时：" + (l2 -l1));
    }
}
