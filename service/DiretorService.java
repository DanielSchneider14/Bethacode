package service;

import model.diretor;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DiretorService implements IService<diretor> {
    @Override
    public diretor save(diretor Diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement insert = conn.prepareStatement("insert into curso.diretor values(?,?,?,?,?)");
        insert.setInt(1, Diretor.getId());
        insert.setString(2, Diretor.getNome());
        insert.setString(3, Diretor.getDocumento());
        insert.setDouble(4, Diretor.getSalario());
        insert.setDouble(5, Diretor.getBonus());
        insert.executeUpdate();
        conn.close();

        return Diretor;
    }

    @Override
    public diretor update(diretor Diretor) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE curso.diretor SET nome = ?, cpf = ?, salario = ?, bonus = ? WHERE id = ?");
        update.setString(1, Diretor.getNome());
        update.setString(2, Diretor.getDocumento());
        update.setDouble(3, Diretor.getSalario());
        update.setDouble(4, Diretor.getBonus());
        update.setInt(5, Diretor.getId());
        update.executeUpdate();
        conn.close();
        return Diretor;
    }
    @Override
    public diretor delete(diretor Diretor) throws SQLException, ClassNotFoundException {
            Connection conn = ConnectionManager.getConnection();
            PreparedStatement statement2 = conn.prepareStatement("DELETE FROM curso.diretor WHERE id = ?");
            statement2.setInt(1, Diretor.getId());
            statement2.executeUpdate();
            conn.close();

        return Diretor;
        }
}
