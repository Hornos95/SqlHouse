package ru.itpark;

import ru.itpark.model.House;
import ru.itpark.service.HouseService;
import ru.itpark.util.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        HouseService service = new HouseService();
        List<House> houses;
        houses = service.callingData();
        System.out.println(houses);


    }
}
