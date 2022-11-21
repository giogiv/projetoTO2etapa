package br.edu.ifsul.bcc.too.topico4.exercicios.respostas;

import br.edu.ifsul.bcc.too.topico4.PessoaEncapsulada;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

public class Exercicio9 {

    public Exercicio9() throws Exception {

        List<PessoaEncapsulada> lista = new ArrayList();

        String dtNascimento = "25/09/1989";

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date dt = null;

        try {

            dt = sdf.parse(dtNascimento);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Calendar dtCalendar = Calendar.getInstance();

        dtCalendar.setTime(dt);

        PessoaEncapsulada p = new PessoaEncapsulada("000013",
                                                    "teste",
                                                    "cinza",
                                                    "cinza claro",
                                                    dtCalendar,
                                                    1.73f);
        lista.add(p);

        PessoaEncapsulada p2 = new PessoaEncapsulada("000013",
                                                     "teste",
                                                     "cinza",
                                                     "cinza claro",
                                                     "01/01/1970",
                                                     1.73f);
        lista.add(p2);

        p = new Pessoa("", "", "", "", Calendar.getInstance(), 173f);
        lista.add(p);

        for (Pessoa pess : lista) {

            System.out.println(pess);
        }

    }

    public static void main(String args[]) {
        new Exercicio9();
    }

}
