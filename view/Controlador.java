package view;

import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controlador {

    public void executor() {

        Scanner teclado = new Scanner(System.in);
        //Listagem de contas À RECEBER
        ArrayList<Credor> ListaDeCredores = new ArrayList<>();
        ArrayList<TipoDeRecebimento> ListaDeTipoDeRecebimento = new ArrayList<>();
        ArrayList<Receber> listaDeTitulosReceber = new ArrayList<>();
        //Listagem de contas À PAGAR
        ArrayList<Fornecedor> ListaDeFornecedores = new ArrayList<>();
        ArrayList<TipoDeDespesa> ListaDeTipoDeDespesas = new ArrayList<>();
        ArrayList<Pagar> LisaDeTitulosPagar = new ArrayList<>();

        //Variáveis final do MENU
        final int CADASTRO_CREDOR = 1;
        final int CADASTRO_TIPODERECEBIMENTO = 2;
        final int CADASTRO_TITULORECEBER = 3;
        final int CADASTRO_FORNECEDOR = 4;
        final int CADASTRO_TIPODEDESPESA = 5;
        final int CADASTRO_TITULOPAGAR = 6;
        final int SAIR = 9;


        int escolha;

        do {
            System.out.println("\n");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar um novo Credor. ");
            System.out.println("2 - Cadastrar tipo de recebimento.");
            System.out.println("3 - Cadastrar Título à Receber.");
            System.out.println("4 - Cadastrar novo Fornecedor.");
            System.out.println("5 - Cadastrar tipo de despesa.");
            System.out.println("6 - Cadastrar Título à Pagar.");
            System.out.println("9 - Sair");

            System.out.print("\nDigite aqui a sua opção: ");

            escolha = teclado.nextInt();
            teclado.nextLine();

            //Instanciação dos objetos de classes (CONTAS À RECEBER)
            Credor credor = new Credor(0, null, null);
            TipoDeRecebimento tipoRecebimento = new TipoDeRecebimento(0,null);

            //Objetos criados para armazenar as informações que vão para o título à Receber que está sendo criado no momento
            Credor ultimoCredor = new Credor();
            TipoDeRecebimento ultimoTipoDeRecebimento = new TipoDeRecebimento();

            //Instanciação dos objetos de classes (CONTAS À PAGAR)
            Fornecedor fornecedor = new Fornecedor();
            TipoDeDespesa tipoDeDespesa = new TipoDeDespesa();

            //Objetos criados para armazenar as informações que vão para o título à Pagar que está sendo criado no momento
            Fornecedor ultimoFornecedor = new Fornecedor();
            TipoDeDespesa ultimoTipoDeDespesa = new TipoDeDespesa();


            switch (escolha) {

                case CADASTRO_CREDOR:

                    credor = new Credor();

                    credor.cadastrar();
                    ListaDeCredores.add(credor);


                    System.out.println("Credor Cadastrado com sucesso! ");

                    break;

                case CADASTRO_TIPODERECEBIMENTO:

                    tipoRecebimento = new TipoDeRecebimento();

                    tipoRecebimento.cadastrar();
                    ListaDeTipoDeRecebimento.add(tipoRecebimento);

                    System.out.println("Tipo de Recebimento Cadastrado com sucesso! ");

                    break;

                case CADASTRO_TITULORECEBER:
                    int escolhaReceber; // variável pra essa situação de escolher um cadastrado ou cadastrar um novo.

                    Receber tituloReceber = new Receber();

                    System.out.println("Vamos Cadastrar um título a Receber!");
                    System.out.println("");
                    System.out.println("1 - Informar um Credor já cadastrado.");
                    System.out.println("2 - Cadastrar um novo Credor.");
                    System.out.print("Digite aqui a sua opção: ");

                    escolhaReceber = teclado.nextInt();
                    teclado.nextLine();

                    int escolhaCadastrarCredor = 0;
                    // isEmpty é pra ver se tá vazio viu
                    if (escolhaReceber == 1) {

                        if (ListaDeCredores.isEmpty()) {
                            System.out.println("Nenhum credor cadastrado.");
                            System.out.println("Deseja cadastrar um novo Credor? 1-Sim, 2-Não");
                            System.out.println("");
                            escolhaCadastrarCredor = teclado.nextInt();

                                if(escolhaCadastrarCredor == 1){
                                    credor = new Credor();
                                    credor.cadastrar();
                                    ListaDeCredores.add(credor);
                                    ultimoCredor = ListaDeCredores.getLast();

                                }else {
                                    //continue volta ao menu principal
                                    if (escolhaCadastrarCredor == 2) {
                                        continue;
                                    }
                                }

                        } else {
                            Collections.sort(ListaDeCredores, comparing(Credor::getNome));
                            System.out.println("Escolha o CREDOR:");
                            int i = 1;
                            for (Credor x : ListaDeCredores) {
                                System.out.println(i + " - " + x);
                                i++;
                            }
                            //boolean que determina se o do while continua ou nem
                            boolean escolhaValida = false;

                            //Do valida a escolha do usuário, caso ele escolha algum número que não esteja na lista, o sistema pede novamente
                            do {
                                int credorEscolhido = 0;
                            System.out.print("Digite o número do credor: ");
                            credorEscolhido = teclado.nextInt();
                            teclado.nextLine();

                                //Aqui ele verifica se o número informado é maior que zero e menor que o último da lista
                                if (credorEscolhido > 0 && credorEscolhido <= ListaDeCredores.size()) {
                                       Credor credorSelecionado = ListaDeCredores.get(credorEscolhido - 1);
                                       System.out.println("Credor selecionado: " + credorSelecionado);
                                       //Armazeno o credor selecionado em uma variável que será vinculada ao título a receber
                                       ultimoCredor = credorSelecionado;
                                       //Validação dessa ação, caso não seja validado ele informa o else e refaz o do while
                                       escolhaValida = true;

                                   } else {
                                       System.out.println("Opção inválida.");
                                   }

                               }while (!escolhaValida);
                        }
                    }
                    //essa é a opção dois lá do primeiro menu
                      else if (escolhaReceber == 2) {

                        credor = new Credor();
                        credor.cadastrar();
                        ListaDeCredores.add(credor);
                        System.out.println("Novo credor cadastrado com sucesso!");
                        ultimoCredor = ListaDeCredores.getLast();

                    } else {
                        System.out.println("Opção inválida.");

                    }

                    int escolhaTipoTituloReceber; // variável pra essa situação de escolher um tipo ja cadastrado ou cadastrar um novo.

                    System.out.println("1 - Informar um Tipo de Recebimento já cadastrado.");
                    System.out.println("2 - Cadastrar um novo Tipo de Recebimento.");
                    System.out.print("Digite aqui a sua opção: ");

                    escolhaTipoTituloReceber = teclado.nextInt();
                    teclado.nextLine();

                    int escolhaCadastrarTipoRecebimento = 0;

                    // isEmpty é pra ver se tá vazio viu
                    if (escolhaReceber == 1) {

                        if (ListaDeTipoDeRecebimento.isEmpty()) {
                            System.out.println("Nenhum Tipo de Recebimento cadastrado.");
                            System.out.println("Deseja cadastrar um novo Tipo de Recebimento? 1-Sim, 2-Não");
                            escolhaCadastrarTipoRecebimento = teclado.nextInt();

                            if(escolhaCadastrarTipoRecebimento == 1){
                                tipoRecebimento = new TipoDeRecebimento();
                                tipoRecebimento.cadastrar();
                                ListaDeTipoDeRecebimento.add(tipoRecebimento);
                                ultimoTipoDeRecebimento = ListaDeTipoDeRecebimento.getLast();

                            }else {
                                if (escolhaCadastrarTipoRecebimento == 2) {
                                    continue;
                                }
                            }

                        } else {

                            boolean escolhaValida = false;
                            do{
                                //Verificar como podemos ordenar essa lista

                                //Collections.sort(ListaDeCredores, comparing(Credor::getNome));
                                System.out.println("Escolha o Tipo Recebimento:");
                                    int i = 1;
                                        for (TipoDeRecebimento y : ListaDeTipoDeRecebimento) {
                                            System.out.println(i + " - " + y);
                                            i++;
                                }

                                System.out.print("Digite o número do Tipo de recebimento: ");
                                    int tipoRecebimentoEscolhido = teclado.nextInt();
                                    teclado.nextLine();
                                    //Verificar se o ID selecionado está entre o zero e o maior da listagem
                                        if (tipoRecebimentoEscolhido > 0 && tipoRecebimentoEscolhido <= ListaDeTipoDeRecebimento.size()) {
                                        TipoDeRecebimento tipoRecebimentoSelecionado = ListaDeTipoDeRecebimento.get(tipoRecebimentoEscolhido - 1);
                                        System.out.println("Tipo de Recebimento selecionado: " + tipoRecebimentoSelecionado);
                                        ultimoTipoDeRecebimento = ListaDeTipoDeRecebimento.get(tipoRecebimentoEscolhido - 1);
                                        escolhaValida = true;


                                    }   else {
                                    System.out.println("Opção inválida.");

                                }
                            }while (!escolhaValida);
                        }
                    } else if (escolhaReceber == 2) {

                        tipoRecebimento = new TipoDeRecebimento();
                        tipoRecebimento.cadastrar();
                        ListaDeTipoDeRecebimento.add(tipoRecebimento);
                        ultimoTipoDeRecebimento = ListaDeTipoDeRecebimento.getLast();
                        System.out.println("Novo tipo de Recebimento cadastrado com sucesso!");

                    } else {
                        System.out.println("Opção inválida.");
                    }

                    tituloReceber.cadastrar(ultimoCredor, ultimoTipoDeRecebimento);
                    listaDeTitulosReceber.add(tituloReceber);
                    System.out.println("Título à Receber cadastrado com sucesso!");
                    System.out.println(tituloReceber);
                    break;


                case CADASTRO_FORNECEDOR:

                    fornecedor = new Fornecedor();
                    fornecedor.cadastrar();
                    ListaDeFornecedores.add(fornecedor);

                    System.out.println("Credor Cadastrado com sucesso! ");

                    break;

                case CADASTRO_TIPODEDESPESA:

                    tipoDeDespesa = new TipoDeDespesa();
                    tipoDeDespesa.cadastrar();
                    ListaDeTipoDeDespesas.add(tipoDeDespesa);

                    System.out.println("Tipo de Recebimento Cadastrado com sucesso! ");

                    break;

                case  CADASTRO_TITULOPAGAR:

                    int escolhaPagar; // variável pra essa situação de escolher um cadastrado ou cadastrar um novo.

                    Pagar tituloPagar = new Pagar();

                    System.out.println("Vamos Cadastrar um novo título à Pagar!");
                    System.out.println("");
                    System.out.println("1 - Informar um Fornecedor já cadastrado.");
                    System.out.println("2 - Cadastrar um novo Fornecedor.");
                    System.out.print("Digite aqui a sua opção: ");

                    escolhaPagar = teclado.nextInt();
                    teclado.nextLine();

                    int escolhaCadastrarFornecedor = 0;
                    // isEmpty é pra ver se tá vazio viu
                    if (escolhaPagar == 1) {

                        if (ListaDeCredores.isEmpty()) {
                            System.out.println("Nenhum credor cadastrado.");
                            System.out.println("Deseja cadastrar um novo Fornecedor? 1-Sim, 2-Não");
                            System.out.println("");
                            escolhaCadastrarFornecedor = teclado.nextInt();

                            if(escolhaCadastrarFornecedor == 1){
                                fornecedor = new Fornecedor();
                                fornecedor.cadastrar();
                                ListaDeFornecedores.add(fornecedor);
                                ultimoFornecedor = ListaDeFornecedores.getLast();

                            }else {
                                //continue volta ao menu principal
                                if (escolhaCadastrarFornecedor == 2) {
                                    continue;
                                }
                            }

                        } else {
                            Collections.sort(ListaDeCredores, comparing(Credor::getNome));
                            System.out.println("Escolha o FORNECEDOR:");
                            int i = 1;
                            for (Fornecedor x : ListaDeFornecedores) {
                                System.out.println(i + " - " + x);
                                i++;
                            }
                            //boolean que determina se o do while continua ou nem
                            boolean escolhaValida = false;

                            //Do valida a escolha do usuário, caso ele escolha algum número que não esteja na lista, o sistema pede novamente
                            do {
                                int fornecedorEscolhido = 0;
                                System.out.print("Digite o número do credor: ");
                                fornecedorEscolhido = teclado.nextInt();
                                teclado.nextLine();

                                //Aqui ele verifica se o número informado é maior que zero e menor que o último da lista
                                if (fornecedorEscolhido > 0 && fornecedorEscolhido <= ListaDeCredores.size()) {
                                    Fornecedor fornecedorSelecionado = ListaDeFornecedores.get(fornecedorEscolhido - 1);
                                    System.out.println("Fornecedor selecionado: " + fornecedorSelecionado);
                                    //Armazeno o fornecedor selecionado em uma variável que será vinculada ao título à pagar
                                    ultimoFornecedor = fornecedorSelecionado;
                                    //Validação dessa ação, caso não seja validado ele informa o else e refaz o do while
                                    escolhaValida = true;

                                } else {
                                    System.out.println("Opção inválida.");
                                }

                            }while (!escolhaValida);
                        }
                    }
                    //essa é a opção dois lá do primeiro menu
                    else if (escolhaPagar == 2) {

                        fornecedor = new Fornecedor();
                        fornecedor.cadastrar();
                        ListaDeFornecedores.add(fornecedor);
                        System.out.println("Novo Fornecedor cadastrado com sucesso!");
                        ultimoFornecedor = ListaDeFornecedores.getLast();

                    } else {
                        System.out.println("Opção inválida.");

                    }

                    int escolhaTipoTituloPagar; // variável pra essa situação de escolher um tipo ja cadastrado ou cadastrar um novo.

                    System.out.println("1 - Informar um Tipo de Recebimento já cadastrado.");
                    System.out.println("2 - Cadastrar um novo Tipo de Recebimento.");
                    System.out.print("Digite aqui a sua opção: ");

                    escolhaTipoTituloPagar = teclado.nextInt();
                    teclado.nextLine();

                    int escolhaCadastrarTipoDespesa = 0;

                    // isEmpty é pra ver se tá vazio viu
                    if (escolhaTipoTituloPagar == 1) {

                        if (ListaDeTipoDeRecebimento.isEmpty()) {
                            System.out.println("Nenhum Tipo de Pagamento cadastrado.");
                            System.out.println("Deseja cadastrar um novo Tipo de Pagamento? 1-Sim, 2-Não");
                            escolhaCadastrarTipoDespesa = teclado.nextInt();

                            if(escolhaCadastrarTipoDespesa == 1){
                                tipoDeDespesa = new TipoDeDespesa();
                                tipoDeDespesa.cadastrar();
                                ListaDeTipoDeDespesas.add(tipoDeDespesa);
                                ultimoTipoDeDespesa = ListaDeTipoDeDespesas.getLast();

                            }else {
                                if (escolhaCadastrarTipoDespesa == 2) {
                                    continue;
                                }
                            }

                        } else {

                            boolean escolhaValida = false;
                            do{
                                //Verificar como podemos ordenar essa lista

                                //Collections.sort(ListaDeCredores, comparing(Credor::getNome));
                                System.out.println("Escolha o Tipo de Despesa:");
                                int i = 1;
                                for (TipoDeDespesa y : ListaDeTipoDeDespesas) {
                                    System.out.println(i + " - " + y);
                                    i++;
                                }

                                System.out.print("Digite o número do Tipo de despesa: ");
                                int tipoDespesaEscolhida = teclado.nextInt();
                                teclado.nextLine();
                                //Verificar se o ID selecionado está entre o zero e o maior da listagem
                                if (tipoDespesaEscolhida > 0 && tipoDespesaEscolhida <= ListaDeTipoDeDespesas.size()) {
                                    TipoDeDespesa tipoDespesaSelecionado = ListaDeTipoDeDespesas.get(tipoDespesaEscolhida - 1);
                                    System.out.println("Tipo de Despesa selecionado: " + tipoDespesaSelecionado);
                                    ultimoTipoDeDespesa = tipoDespesaSelecionado;
                                    escolhaValida = true;


                                }   else {
                                    System.out.println("Opção inválida.");

                                }
                            }while (!escolhaValida);
                        }
                    } else if (escolhaPagar == 2) {

                        tipoDeDespesa = new TipoDeDespesa();
                        tipoDeDespesa.cadastrar();
                        ListaDeTipoDeDespesas.add(tipoDeDespesa);
                        ultimoTipoDeDespesa = ListaDeTipoDeDespesas.getLast();
                        System.out.println("Novo tipo de Despesa cadastrado com sucesso!");

                    } else {
                        System.out.println("Opção inválida.");
                    }

                    tituloPagar.cadastrar(ultimoFornecedor, ultimoTipoDeDespesa);
                    LisaDeTitulosPagar.add(tituloPagar);
                    System.out.println("Título à PAGAR cadastrado com sucesso!");
                    System.out.println(tituloPagar);
                    break;

                    case SAIR:
                    System.out.println("\nSair ...\n");
                    break;

                default:
                    System.out.println("\nOpção inválida !  Tente novamente ...\n");
            }

        } while (escolha != SAIR);

    }
}
