import java.util.List;

public class Aluno {
    private Curso curso;
    private List<Double> notas;

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public void imprimir() {
        System.out.println("Aluno: " + curso.getNome());
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Notas: " + notas);
        System.out.println("Média: " + calcularMedia());
    }
}

