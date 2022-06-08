package br.livrariafatec.tentandomvc.controler;
import br.livrariafatec.tentandomvc.modelo.Livraria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")

public class Aluno_Controller {

    private static final List<Livraria> livros = new ArrayList<Livraria>();

    public Aluno_Controller(){
        livros.add(new Livraria("Dom Quixote","Miguel de Cervantes", 19.99f,0001));
        livros.add(new Livraria("O Principe","Maquiavel", 24.99f,0002));
        livros.add(new Livraria("Riacho Doce","José Lins", 29.99f,0003));
        livros.add(new Livraria("O velho e o mar","Ernest Hemingway", 39.99f,0004));
        livros.add(new Livraria("Misery","Stephen King", 46.99f,0005));
    }

    @GetMapping

    public String getLivros(Model model){
        model.addAttribute("livros", livros);
        return "livros";
    }

}
