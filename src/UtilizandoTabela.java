
public class UtilizandoTabela {

    public static void usarTabela(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da Tabela: " + tabela.valor());
        } else {
            System.out.println("A classe " + clazz.getSimpleName() + " não está anotada com @Tabela.");
        }
    }

    @Tabela(valor = "Teste_aula_ANNOTATION_EBAC")
    public static class MinhaTabela {
    }
}