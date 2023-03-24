package primeirotranpodev.lacofor.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LacoforService {


    public List<Integer> lacoForAte10(Integer lacoFor10) {

        List<Integer> listafor10 = new ArrayList<>();
        for (Integer i = 0; i < 10; i += 1) {
            listafor10.add(lacoFor10 + i);
        }
        return listafor10;
    }

    public List<Integer> listaSomaAte100(Integer lacoFor100) {

        List<Integer> lacoforsoma100 = new ArrayList<>();
        Integer resultado = 0;

        for (Integer i = 0; i <= 100; i++) {
            resultado += i;
            lacoforsoma100.add(resultado);
        }

        return lacoforsoma100;
    }

    public List<Integer> listaDivAte50(Integer lacoFor50) {

        List<Integer> lacofordiv50 = new ArrayList<>();

        for (Integer i = 1; i <= lacoFor50; i++) {
            if (lacoFor50 % i == 0) {
                lacofordiv50.add(i);
            }
        }
        return lacofordiv50;
    }

    public List<Character> listaPalavras(String lacoForletra) {

        List<Character> lacoforletra = new ArrayList<>();
        Character texto;
        for (Integer i = 0; i < lacoForletra.length(); i++) {
            lacoforletra.add(lacoForletra.charAt(i));

        }
        return lacoforletra;
    }

    public void listaTela10() {
        for (Integer i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

