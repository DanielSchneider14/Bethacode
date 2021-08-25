package repository;

import model.funcionario;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository implements IRepository<funcionario> {
    @Override
    public List<funcionario> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM curso.funcionario ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<funcionario> func = new ArrayList<>();

        System.out.println("---- BUSCA POR ID INI ----");
        while (resultSet.next()) {
            String index = resultSet.getString(2);
            System.out.println(index);
        }
        System.out.println("---- BUSCA POR ID FIM ----");
        conn.close();

        return func;
    }

    @Override
    public funcionario findById(Integer id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement3 = conn.prepareStatement("SELECT * FROM curso.funcionario WHERE id = ?");
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

        return new funcionario(4, "Daniel da Silva Schneider", "000.090.999-12", 2.400);
    }

}
