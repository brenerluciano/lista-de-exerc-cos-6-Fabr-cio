import java.util.Scanner;

public class App4 {
    static final int NUM_AVIOES = 12;
    static String[] numerosVoo = new String[NUM_AVIOES];
    static String[] origens = new String[NUM_AVIOES];
    static String[] destinos = new String[NUM_AVIOES];
    static int[] lugaresDisponiveis = new int[NUM_AVIOES];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Leitura das informações dos voos
        lerInformacoes(scanner);

        do {
            // Exibição do menu principal
            System.out.println("\nMenu Principal:");
            System.out.println("1. Consultar");
            System.out.println("2. Efetuar reserva");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultarMenu(scanner);
                    break;
                case 2:
                    efetuarReserva(scanner);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    // Função para ler as informações dos voos
    static void lerInformacoes(Scanner scanner) {
        System.out.println("Por favor, insira as informações dos voos:");

        for (int i = 0; i < NUM_AVIOES; i++) {
            System.out.println("\nVoo " + (i + 1) + ":");
            System.out.print("Número do voo: ");
            numerosVoo[i] = scanner.next();
            System.out.print("Origem: ");
            origens[i] = scanner.next();
            System.out.print("Destino: ");
            destinos[i] = scanner.next();
            System.out.print("Número de lugares disponíveis: ");
            lugaresDisponiveis[i] = scanner.nextInt();
        }
    }

    // Função para exibir o menu de consulta
    static void consultarMenu(Scanner scanner) {
        int opcao;

        System.out.println("\nMenu de Consulta:");
        System.out.println("1. Por número do voo");
        System.out.println("2. Por origem");
        System.out.println("3. Por destino");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                consultarPorNumero(scanner);
                break;
            case 2:
                consultarPorOrigem(scanner);
                break;
            case 3:
                consultarPorDestino(scanner);
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }

    // Função para consultar por número do voo
    static void consultarPorNumero(Scanner scanner) {
        System.out.print("Digite o número do voo: ");
        String numeroVoo = scanner.next();

        for (int i = 0; i < NUM_AVIOES; i++) {
            if (numerosVoo[i].equals(numeroVoo)) {
                System.out.println("Origem: " + origens[i]);
                System.out.println("Destino: " + destinos[i]);
                System.out.println("Lugares disponíveis: " + lugaresDisponiveis[i]);
                return;
            }
        }

        System.out.println("Voo inexistente.");
    }

    // Função para consultar por origem
    static void consultarPorOrigem(Scanner scanner) {
        System.out.print("Digite a origem: ");
        String origem = scanner.next();

        for (int i = 0; i < NUM_AVIOES; i++) {
            if (origens[i].equalsIgnoreCase(origem)) {
                System.out.println("Número do voo: " + numerosVoo[i]);
                System.out.println("Destino: " + destinos[i]);
                System.out.println("Lugares disponíveis: " + lugaresDisponiveis[i]);
            }
        }
    }

    // Função para consultar por destino
    static void consultarPorDestino(Scanner scanner) {
        System.out.print("Digite o destino: ");
        String destino = scanner.next();

        for (int i = 0; i < NUM_AVIOES; i++) {
            if (destinos[i].equalsIgnoreCase(destino)) {
                System.out.println("Número do voo: " + numerosVoo[i]);
                System.out.println("Origem: " + origens[i]);
                System.out.println("Lugares disponíveis: " + lugaresDisponiveis[i]);
            }
        }
    }

    // Função para efetuar reserva
    static void efetuarReserva(Scanner scanner) {
        System.out.print("Digite o número do voo: ");
        String numeroVoo = scanner.next();
        boolean encontrado = false;

        for (int i = 0; i < NUM_AVIOES; i++) {
            if (numerosVoo[i].equals(numeroVoo)) {
                encontrado = true;
                if (lugaresDisponiveis[i] > 0) {
                    lugaresDisponiveis[i]--;
                    System.out.println("Reserva confirmada!");
                } else {
                    System.out.println("Voo lotado.");
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Voo inexistente.");
        }
    }
}