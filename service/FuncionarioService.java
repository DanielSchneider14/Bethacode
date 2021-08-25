package service;

import model.funcionario;
import service.IService;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioService implements IService<funcionario> {
    @Override
    public funcionario save(funcionario Funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement insert = conn.prepareStatement("insert into curso.funcionario values(?,?,?,?)");
        insert.setInt(1, Funcionario.getId());
        insert.setString(2, Funcionario.getNome());
        insert.setString(3, Funcionario.getDocumento());
        insert.setDouble(4, Funcionario.getSalario());
        insert.executeUpdate();
        conn.close();

        return Funcionario;
    }

    @Override
    public funcionario update(funcionario Funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE curso.funcionario SET nome = ?, cpf = ?, salario = ? WHERE id = ?");
        update.setString(2, Funcionario.getNome());
        update.setString(3, Funcionario.getDocumento());
        update.setDouble(4, Funcionario.getSalario());
        update.setInt(1, Funcionario.getId());
        update.executeUpdate();
        conn.close();

        return Funcionario;
    }

    @Override
    public funcionario delete(funcionario Funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM curso.funcionario WHERE id = ?");
        statement2.setInt(1, Funcionario.getId());
        statement2.executeUpdate();
        conn.close();

        return Funcionario;
    }
}
