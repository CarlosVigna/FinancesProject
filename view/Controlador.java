package view;

import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controlador {

    public void executor() {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Credor> ListaDeCredores = new ArrayList<>();

        ArrayList<TipoDeRecebimento> ListaDeTipoDeRecebimento = new ArrayList<>();
        ArrayList<Receber> listaDeTitulosReceber = new ArrayList<>();

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

            Credor credor = new Credor(0, null, null);
            TipoDeRecebimento tipoRecebimento = new TipoDeRecebimento(0,null);

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
                            System.out.println("Deseja cadastrar um novo Fornecedor? 1-Sim, 2-Não");
                            escolhaCadastrarCredor = teclado.nextInt();
                                if(escolhaCadastrarCredor == 1){
                                    credor = new Credor();
                                    credor.cadastrar();
                                    ListaDeCredores.add(credor);
                                }else {
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

                            System.out.print("Digite o número do credor: ");
                            int credorEscolhido = teclado.nextInt();
                            teclado.nextLine();
                            if (credorEscolhido > 0 && credorEscolhido <= ListaDeCredores.size()) {
                                Credor credorSelecionado = ListaDeCredores.get(credorEscolhido - 1);
                                System.out.println("Credor selecionado: " + credorSelecionado);
                            } else {
                                System.out.println("Opção inválida.");
                            }
                        }
                    } else if (escolhaReceber == 2) {

                        credor = new Credor();
                        credor.cadastrar();
                        ListaDeCredores.add(credor);
                        System.out.println("Novo credor cadastrado com sucesso!");
                    } else {
                        System.out.println("Opção inválida.");
                    }

                    //DAQUI PRA BAIXO TESTE

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
                            }else {
                                if (escolhaCadastrarTipoRecebimento == 2) {
                                    continue;
                                }
                            }

                        } else {
                                //Collections.sort(ListaDeTipoDeRecebimento, comparing(tipoRecebimento:;
                            System.out.println("Escolha o Tipo Recebimento:");
                            int i = 1;
                            for (TipoDeRecebimento y : ListaDeTipoDeRecebimento) {
                                System.out.println(i + " - " + y);
                                i++;
                            }

                            System.out.print("Digite o número do Tipo de recebimento: ");
                            int tipoRecebimentoEscolhido = teclado.nextInt();
                            teclado.nextLine();
                            if (tipoRecebimentoEscolhido > 0 && tipoRecebimentoEscolhido <= ListaDeCredores.size()) {
                                TipoDeRecebimento tipoRecebimentoSelecionado = ListaDeTipoDeRecebimento.get(tipoRecebimentoEscolhido - 1);
                                System.out.println("Tipo de Recebimento selecionado: " + tipoRecebimentoSelecionado);
                            } else {
                                System.out.println("Opção inválida.");
                            }
                        }
                    } else if (escolhaReceber == 2) {

                        tipoRecebimento = new TipoDeRecebimento();
                        tipoRecebimento.cadastrar();
                        ListaDeTipoDeRecebimento.add(tipoRecebimento);
                        System.out.println("Novo tipo de Recebimento cadastrado com sucesso!");
                    } else {
                        System.out.println("Opção inválida.");
                    }

                    tituloReceber.cadastrar();
                    listaDeTitulosReceber.add(tituloReceber);
                    System.out.println("Título à Receber cadastrado com sucesso!");
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
