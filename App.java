import java.util.Scanner;

public class App {
    static int quantidadeTurma = 0;
    static int quantidadeEstudante = 0;
    static Turma[] turmas = new Turma[10];
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) throws Exception {
        int opcao = 0;
        
        do {
            exibirMenu();
            opcao = keyboard.nextInt();
            roteador(opcao);
        } while (opcao != 0);
    }
    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarTurma();
                break;
            case 2:
                //fazer cadatro de Campus
                break;
            case 3:
                //fazer cadatro de Curso
                break;
            case 4:
                //fazer cadatro de Estudante
                break;
            case 5:
                //fazer cadatro de Matricula
                break;
            case 6:
                geraRelatorio();
                break;
        
            default:
                if (opcao != 0){
                    System.out.println("Opcao invalida!");
                }
                break;
        }
    }
    public static void geraRelatorio(){
        for (int i = 0; i < quantidadeTurma; i++) {
            System.out.println("Nome turma: "+ turmas[i].nome);
            System.out.println("Numero minimo: "+ turmas[i].numeroMinimo);
            System.out.println("Ano de ingresso: "+ turmas[i].anoIngresso);
        }
    }
    public static void cadastrarTurma() {
        keyboard.nextLine(); // apaga o enter (\n) quebra de linha
        Turma turma = new Turma();
        System.out.println("Digite o nome da turma:");
        turma.nome = keyboard.nextLine();
        System.out.println("Digite a quantidade de alunos:");
        turma.numeroMinimo = keyboard.nextInt();
        System.out.println("Digite o ano de ingresso:");
        turma.anoIngresso = keyboard.nextInt();
        turmas[quantidadeTurma] = turma;
        quantidadeTurma++;
    }
    public static void exibirMenu() {
        System.out.println("*********************");
        System.out.println("Digite [1] para cadastrar Turma:");
        System.out.println("Digite [2] para cadastrar Campus:");
        System.out.println("Digite [3] para cadastrar Curso:");
        System.out.println("Digite [4] para cadastrar Estudante:");
        System.out.println("Digite [5] para cadastrar Matricula:");
        System.out.println("Digite [6] Exibir tudo:");
        System.out.println("Digite [0] para sair do cadastro:");
        System.out.println("*********************");
    }
}
