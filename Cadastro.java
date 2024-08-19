import java.util.Scanner;

public class Cadastro {

    private String matricula;
    private String nome;
    private String curso;
    private String campus;

    // Construtor
    public Cadastro(String matricula, String nome, String curso, String campus) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.campus = campus;
    }

    // Métodos para obter os valores
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getCampus() {
        return campus;
    }

    // Método principal para exibir as informações
    public void exibirCadastro() {
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Curso: " + getCurso());
        System.out.println("Campus: " + getCampus());
    }

    // Método main para executar o programa
    public static void main(String[] args) {
        // Criando o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados ao usuário
        System.out.println("Digite a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o curso: ");
        String curso = scanner.nextLine();

        System.out.println("Digite o campus: ");
        String campus = scanner.nextLine();

        // Criando um objeto Cadastro com os dados inseridos pelo usuário
        Cadastro aluno = new Cadastro(matricula, nome, curso, campus);

        // Exibindo os dados
        aluno.exibirCadastro();

        // Fechando o scanner
        scanner.close();
    }
}
