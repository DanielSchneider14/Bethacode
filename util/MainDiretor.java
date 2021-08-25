package util;

import model.diretor;
import repository.DiretorRepository;
import service.DiretorService;


import java.sql.SQLException;

public class MainDiretor {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        diretor Diretor = new diretor(2, "Amanda", "047.684.680-39", 2.000, 220.0);

        DiretorService service = new DiretorService();

        service.save(Diretor);

       // Diretor.setNome(Diretor.getNome() + "Daniel");

        service.update(Diretor);

        DiretorRepository repository = new DiretorRepository();

        repository.findAll();

        repository.findById(2);

    }
}