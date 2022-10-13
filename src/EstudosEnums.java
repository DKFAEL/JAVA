// Enums são estruturas com constantes definidas
// Dias da semana, Meses, ano, Turnos do dia, Estações
// Niveis (junior, pleno, senior), Feriados nacionais, Naipes

public class EstudosEnums {
    public static void main(String[] args) {
        enum DiaDasSemana {
            SEGUNDA,
            TERÇA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }
        DiaDasSemana hoje = DiaDasSemana.QUINTA; // enum.CONSTANTE
        System.out.println(hoje);

        enum  NivelDev {JUNIOR, PLENO, SENIOR}
        NivelDev nivel = NivelDev.SENIOR;

        switch (nivel) {
            case JUNIOR:
                System.out.println("Seu nivel é Junior"); break;
            case PLENO:
                System.out.println("Seu nivel é Pleno"); break;
            case SENIOR:
                System.out.println("Seu nivel é Senior"); break;

        }
        // VERSÃO ENHANCED

        switch (nivel){
            case JUNIOR ->  {System.out.println("Seu nivel é Junior");}
            case PLENO -> {System.out.println("Seu nivel e Pleno");}
            case SENIOR -> {System.out.println("Seu nivel e Senior");}
            default ->  {System.out.println("Nunca executa");}
        }
    }
}
