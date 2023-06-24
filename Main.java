
import java.util.ArrayList;
import java.util.List;

public class Main { 
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
pessoa.setNome("João da Silva");
pessoa.setCpf("123.456.789-00");
pessoa.setEmail("joao.silva@example.com");

List<Telefone> telefones = new ArrayList<>();
Telefone telefone1 = new Telefone();
telefone1.setTipo("Celular");
telefone1.setDdd("99");
telefone1.setNumero("987654321");
telefones.add(telefone1);

Telefone telefone2 = new Telefone();
telefone2.setTipo("Residencial");
telefone2.setDdd("99");
telefone2.setNumero("12345678");
telefones.add(telefone2);

pessoa.setTelefones(telefones);

Endereco endereco = new Endereco();
endereco.setRua("Rua Exemplo");
endereco.setCidade("Cidade Exemplo");
endereco.setEstado("Estado Exemplo");
pessoa.setEndereco(endereco);

pessoa.imprimir();

Professor professor = new Professor();
professor.setTitulacao("Doutorado");
professor.setSalario(5000.0);

List<Curso> cursos = new ArrayList<>();
Curso curso1 = new Curso();
curso1.setNome("Engenharia de Software");
cursos.add(curso1);

Curso curso2 = new Curso();
curso2.setNome("Ciência da Computação");
cursos.add(curso2);

professor.setCursos(cursos);

professor.imprimir();
Curso curso = new Curso();
curso.setNome("Engenharia de Software");
curso.imprimirCurso();
Aluno aluno = new Aluno();

Curso.curso = new Curso();
curso.setNome("Engenharia de Software");
aluno.setCurso(curso);

List<Double> notas = new ArrayList<>();
notas.add(7.5);
notas.add(8.0);
notas.add(9.2);
aluno.setNotas(notas);
aluno.imprimir();

Telefone telefone = new Telefone();
telefone.setTipo("Celular");
telefone.setDdd("99");
telefone.setNumero("987654321");

System.out.println("Tipo: " + telefone.getTipo());
System.out.println("DDD: " + telefone.getDdd());
System.out.println("Número: " + telefone.getNumero());

telefone.imprimirTelefone();

Endereco.endereco = new Endereco();
endereco.setRua("Rua Exemplo");
endereco.setCidade("Cidade Exemplo");
endereco.setEstado("Estado Exemplo");

System.out.println("Rua: " + endereco.getRua());
System.out.println("Cidade: " + endereco.getCidade());
System.out.println("Estado: " + endereco.getEstado());

endereco.imprimirEndereco();

    }
    
}
