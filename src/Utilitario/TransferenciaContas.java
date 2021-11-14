package Utilitario;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import controller.CtrlConta;
import controller.CtrlExtrato;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TransferenciaContas {

    public static CtrlConta conta = new CtrlConta();
    public static CtrlExtrato extrato = new CtrlExtrato();

    public static boolean transferir(int codContaOrigem, int codContaDestino, String valor) throws SQLException {
        Connection conexao = DAO.Fabrica.getConexaoNOVA();

        try {
            String[] dadosContaOrigem = conta.recuperar(codContaOrigem);
            String[] dadosContaDestino = conta.recuperar(codContaDestino);

            if (Double.parseDouble(dadosContaOrigem[4]) < Double.parseDouble(valor)) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                return false;
            } else {
                atualizar(dadosContaOrigem, dadosContaDestino, valor);
                extrato(dadosContaOrigem, dadosContaDestino, valor);
                conexao.commit();
                JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso");
            }
        } catch (Exception e) {
            conexao.rollback();
            System.out.println("Erro na transferencia" + e);
        }
        return true;
    }

    public static void atualizar(String[] contaOrigem, String[] contaDestino, String valor) {

        contaOrigem[4] = String.valueOf(Double.parseDouble(contaOrigem[4]) - Double.parseDouble(valor));
        contaDestino[4] = String.valueOf(Double.parseDouble(contaDestino[4]) + Double.parseDouble(valor));

        try {
            conta.atualizar(contaOrigem);
            conta.atualizar(contaDestino);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar saldo conta origem  - Transferencia" + e);
        }
    }

    public static void extrato(String[] contaOrigem, String[] contaDestino, String valor) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String[] saida = {"0",
                        String.valueOf(df.format(Calendar.getInstance().getTime())),
                        "Enviado p/ conta: " + contaDestino[0],
                        valor,
                        "S",
                        contaOrigem[0]};
        
        String[] entrada = {"0", 
                        String.valueOf(df.format(Calendar.getInstance().getTime())), 
                        "Recebido da conta: " + contaOrigem[0], 
                        valor, 
                        "E", 
                        contaDestino[0]};
        try {
            System.out.println(entrada[0]+ ", "+ entrada[1] + ", " + entrada[2] + ", " + entrada[3]+ ", " + entrada[4]+", " + entrada[5]);
            System.out.println(saida[0]+ ", "+ saida[1] + ", " + saida[2] + ", " + saida[3]+ ", " + saida[4]+", " + saida[5]);
            extrato.inserir(saida);
            extrato.inserir(entrada);
        } catch (Exception e) {
            System.out.println("Erro ao inserir extrato nas contas - Transferencia " + e);
        }
    }
}