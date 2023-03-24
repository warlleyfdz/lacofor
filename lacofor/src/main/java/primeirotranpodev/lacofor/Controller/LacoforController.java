package primeirotranpodev.lacofor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import primeirotranpodev.lacofor.Service.LacoforService;

import java.util.List;

@RestController
@RequestMapping(value = "/lacofor")
public class LacoforController {

    @Autowired
    private LacoforService lacoforService;

    @RequestMapping(value = "/lacoforate10")
    public List<Integer> lacoFor10(@RequestParam("valorinicial") Integer valorInicial) {
        return lacoforService.lacoForAte10(valorInicial);
    }

    @RequestMapping(value = "/lacoforsomaate100")
    public List<Integer> lacoFor100(@RequestParam("valorinicial") Integer valorInicial) {
        return lacoforService.listaSomaAte100(valorInicial);
    }

    @RequestMapping(value = "/lacofordivate50")
    public List<Integer> lacoFor50 (@RequestParam("valorinicial") Integer valorInicial) {
        return lacoforService.listaDivAte50(valorInicial);
    }

    @RequestMapping(value = "/lacoforletra")
    public List<Character> lacoForLetra (@RequestParam("palavra") String palavraInicial) {
        return lacoforService.listaPalavras(palavraInicial);
    }

    @RequestMapping(value = "listafor10")
    public void listaFor10() {
        lacoforService.listaTela10();
    }
}


