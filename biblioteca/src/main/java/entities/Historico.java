package entities;

import java.util.List;


public class Historico {
    private List<Emprestimo> emprestimos;

    /**
     * @return Emprestimo return the emprestimos
     */
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    /**
     * @param emprestimos the emprestimos to set
     */
    public void setEmprestimos(Emprestimo emprestimos) {
        this.emprestimos.add(emprestimos);
    }

}