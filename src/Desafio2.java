void main() {
  Scanner sc = new Scanner(System.in);
    int cont = 0;
    int[] temperaturas = new int[10];

    for (int i = 0; i < 10; i++) {
        IO.println("Digite as temperaturas:");
        temperaturas[i] = sc.nextInt();
        cont += temperaturas[i];

    }

    IO.println("------MENU DE PESQUISA------" +
            "\n" +
            "1- Maior e Menor temperatura registrada" +
            "\n" +
            "2- Calculo Da Média" +
            "\n" +
            "3- Temperaturas abaixo da média" +
            "\n" +
            "4- Busca De Dados" +
            "\n" +
            "5- Sair");


    int escolha = sc.nextInt();


    switch (escolha) {


        case 1:
            Arrays.sort(temperaturas);
            IO.println("A maior temperatura é " + temperaturas[9]);
            IO.println("A menor temperatura é " + temperaturas[0]);
            break;

        case 2:
            IO.println("Sua media é: " + cont / 10);
            break;
        case 3:
            IO.println("As temperaturas abaixo da média são: ");
            for (int i = 0; i < 10; i++) {
                if (temperaturas[i] < (cont / 10)) {
                    IO.println(temperaturas[i]);
                }
            }
            break;
        case 4:
            IO.println("Digite um valor para verificar se tem no sistema:");

            for (int a = 0; a < 1; a++) {
                int busca = sc.nextInt();
                if (temperaturas[a] == busca)
                {
                    IO.println("Está no sistema");
                }else{  IO.println("Não está no sistema");
                }
            }

            break;


        default:
            IO.println("Você saiu");
    }

}

}
