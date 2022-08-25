package entities;

import java.util.ArrayList;
import java.util.List;


public class Historico {
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void registraEmprestimos(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

}