import model.funcionario;
import repository.FuncionarioRepository;
import service.FuncionarioService;


import java.sql.SQLException;

public class MainFuncionario {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        funcionario Funcionario = new funcionario(4, "Daniel da Silva Schneider", "000.090.999-12", 2.400);

        FuncionarioService service = new FuncionarioService();

        service.save(Funcionario);

        // Funcionario.setNome(Funcionario.getNome() + "Daniel");

        service.update(Funcionario);

        FuncionarioRepository repository = new FuncionarioRepository();

        repository.findAll();

        repository.findById(4);

    }
}