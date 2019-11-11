package ru.itpark.service;

import ru.itpark.model.House;
import ru.itpark.util.JdbcTemplate;


import java.sql.SQLException;
import java.util.List;

public class HouseService {
    public HouseService() {
    }


    public List<House> callingData() throws SQLException {
        return JdbcTemplate.executeQuery(
                "jdbc:sqlite:db.sqlite",
                "SELECT id, price, rooms, district, underground FROM house ",
                resultSet -> new House(
                        resultSet.getInt("id"),
                        resultSet.getInt("price"),
                        resultSet.getInt("rooms"),
                        resultSet.getString("district"),
                        resultSet.getString("underground")
                )
        );
    }




    public List<House> sortByPrice() throws SQLException {
        List<House> houses = callingData();
        houses.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
        return houses;
    }

    public List<House> sortByUnderground() throws SQLException {
        List<House> houses = callingData();
        houses.sort((o1, o2) -> o1.getUnderground().compareTo(o2.getUnderground()));
        return houses;
    }

}
