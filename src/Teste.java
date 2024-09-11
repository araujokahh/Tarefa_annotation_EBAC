public class Teste {
    public static void main(String[] args) {
        Class<?> clazz = UtilizandoTabela.MinhaTabela.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da Tabela com reflection: " + tabela.valor());
        }

        UtilizandoTabela.usarTabela(UtilizandoTabela.MinhaTabela.class);
    }
}