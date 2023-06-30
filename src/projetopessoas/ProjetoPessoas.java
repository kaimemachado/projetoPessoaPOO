package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa Principal

        Visitante visitante = new Visitante();
        visitante.setName("Juvenal");
        visitante.setIdade(22);
        visitante.setSexo("M");
        System.out.println(visitante.toString());

        Aluno aluno = new Aluno();
        aluno.setName("Cláudio");
        aluno.setMatricula(2516);
        aluno.setCurso("Informática");
        aluno.setIdade(18);
        aluno.setSexo("M");
        aluno.pagarMensalidade();
        System.out.println(aluno.toString());

        System.out.println("=========================================");

        Bolsista bolsista = new Bolsista();
        bolsista.setMatricula(1547);
        bolsista.setName("Jubileu");
        bolsista.setBolsa(12.5f);
        bolsista.setSexo("M");
        bolsista.pagarMensalidade();
        System.out.println(bolsista.toString());

        System.out.println("=========================================");

        Professor professor = new Professor();
        professor.setName("Pedro");
        professor.setSexo("M");
        professor.setEspecialidade("Matemático");
        professor.setSalario(5000.00f);
        professor.receberAumento(500.00f);
        System.out.println(professor.toString());

        System.out.println("=========================================");

        Tecnico tecnico = new Tecnico();
        tecnico.setName("Maria");
        tecnico.setSexo("F");
        tecnico.setRegistroProfissional(816);
        tecnico.setIdade(15);
        tecnico.fazerAniversario();
        System.out.println(tecnico.toString());
        tecnico.praticar();
    }
}