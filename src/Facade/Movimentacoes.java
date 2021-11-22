package Facade;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import controller.CtrlConta;
import controller.CtrlExtrato;
import org.json.simple.JSONArray;

public class Movimentacoes {

    public static CtrlConta conta = new CtrlConta();
    public static CtrlExtrato extrato = new CtrlExtrato();

    public static boolean transferir(int codContaOrigem, int codContaDestino, String valor) throws SQLException {
        //Connection conexao = DAO.Fabrica.getConexaoNOVA();

        try {
            JSONArray dadosContaOrigem = conta.recuperar(codContaOrigem);
            JSONArray dadosContaDestino = conta.recuperar(codContaDestino);

            if (Double.parseDouble(String.valueOf(dadosContaOrigem.get(4))) < Double.parseDouble(valor)) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                return false;
            } else {
                atualizar(dadosContaOrigem, dadosContaDestino, valor);
                extratoTransferencia(dadosContaOrigem, dadosContaDestino, valor);
                //conexao.commit();
                JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso");
            }
        } catch (Exception e) {
            //conexao.rollback();
            System.out.println("Erro na transferencia" + e);
        }
        return true;
    }

    public static void atualizar(JSONArray contaOrigem, JSONArray contaDestino, String valor) {

        double valorSaida = Double.parseDouble(String.valueOf(contaOrigem.get(4))) - Double.parseDouble(valor);
        double valorEntrada = Double.parseDouble(String.valueOf(contaDestino.get(4))) + Double.parseDouble(valor);

        contaOrigem.set(4, valorSaida);
        contaDestino.set(4, valorEntrada);

        try {
            conta.atualizar(contaOrigem);
            conta.atualizar(contaDestino);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar saldo conta origem  - Transferencia" + e);
        }
    }

    public static void extratoTransferencia(JSONArray contaOrigem, JSONArray contaDestino, String valor) {
        JSONArray arrayJSONSaida = new JSONArray();
        JSONArray arrayJSONEntrada = new JSONArray();

        arrayJSONSaida.add("0");
        arrayJSONSaida.add(FuncoesData.now());
        arrayJSONSaida.add("Enviado p/ conta: " + contaDestino.get(0));
        arrayJSONSaida.add(valor);
        arrayJSONSaida.add("S");
        arrayJSONSaida.add(contaOrigem.get(0));

        arrayJSONEntrada.add("0");
        arrayJSONEntrada.add(FuncoesData.now());
        arrayJSONEntrada.add("Recebido da conta: " + contaOrigem.get(0));
        arrayJSONEntrada.add(valor);
        arrayJSONEntrada.add("E");
        arrayJSONEntrada.add(contaDestino.get(0));

        try {
            extrato.inserir(arrayJSONSaida);
            extrato.inserir(arrayJSONEntrada);
        } catch (Exception e) {
            System.out.println("Erro ao inserir extrato nas contas - Movimentacoes " + e);
        }
    }

    public static void extratoEntradaSaida(String codConta, String tipo, String valor) {
        JSONArray arrayJSONSaida = new JSONArray();
        JSONArray arrayJSONEntrada = new JSONArray();
        try {
            if ("E".equals(tipo)) {
                arrayJSONEntrada.add("0");
                arrayJSONEntrada.add(FuncoesData.now());
                arrayJSONEntrada.add("Operação de depósito");
                arrayJSONEntrada.add(valor);
                arrayJSONEntrada.add(tipo);
                arrayJSONEntrada.add(codConta);
                extrato.inserir(arrayJSONEntrada);
            } else {
                arrayJSONSaida.add("0");
                arrayJSONSaida.add(FuncoesData.now());
                arrayJSONSaida.add("Operação de saque");
                arrayJSONSaida.add(valor);
                arrayJSONSaida.add(tipo);
                arrayJSONSaida.add(codConta);
                extrato.inserir(arrayJSONSaida);
            }
        } catch (Exception e) {
            System.out.println("Erro ao inserir extrato nas contas - Movimentacoes " + e);
        }
    }

    public static void extratoRendimento(int codConta, double valor) {
        JSONArray arrayJSONEntrada = new JSONArray();
        try {
            arrayJSONEntrada.add("0");
            arrayJSONEntrada.add(FuncoesData.now());
            arrayJSONEntrada.add("Rendimentos");
            arrayJSONEntrada.add(valor);
            arrayJSONEntrada.add("E");
            arrayJSONEntrada.add(codConta);
            extrato.inserir(arrayJSONEntrada);
        } catch (Exception e) {
            System.out.println("Erro ao inserir extrato nas contas - Movimentacoes " + e);
        }
    }
}
