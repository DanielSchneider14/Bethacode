package repository;

import model.diretor;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiretorRepository implements IRepository<diretor> {

    @Override
    public List<diretor> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM curso.diretor ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<diretor> Diretor = new ArrayList<>();

        System.out.println("---- BUSCA POR ID INI ----");
        while (resultSet.next()) {
            String index = resultSet.getString(2);
            System.out.println(index);
        }
        System.out.println("---- BUSCA POR ID FIM ----");
        conn.close();

        return Diretor;
    }

    @Override
    public diretor findById(Integer id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement3 = conn.prepareStatement("SELECT * FROM curso.diretor WHERE id = ?");
        statement3.setInt(1, id);
        ResultSet resultSet3 = null;
        resultSet3 = statement3.executeQuery();

        System.out.println("---- Listagem INI ----");
        while (resultSet3.next()) {
            String index = resultSet3.getString(2);
            System.out.println(index);
        }
        System.out.println("---- Listagem FIM ----");
        conn.close();

        return new diretor(2, "Amanda", "047.684.680-39", 2.000, 220.0);
    }

}