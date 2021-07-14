package br.com.supera.game.store.controller;


import br.com.supera.game.store.models.Product;
import br.com.supera.game.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;



    @GetMapping("/listaProdutos")
    public ModelAndView listar() {

        ModelAndView modelAndView = new ModelAndView("listaproduto");
        modelAndView.addObject("produtos",productService.findAll());
        return modelAndView;

    }
    @GetMapping("/cadastroProduto")
    public ModelAndView cadastroAnuncioForm(Product product) {

        ModelAndView modelAndView = new ModelAndView("cadastroAnuncio");
        modelAndView.addObject("anuncio",new Product());

        return modelAndView;

    }

    @PostMapping("/cadastroProduto")
    public String salvar(@Valid Product product, BindingResult result, RedirectAttributes attributes){


        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem","Verifique se os campos obrigatŕoios (*) foram preenchidos");
            return "redirect:/cadastroProduto";

        }

        this.productService.save(product);
        attributes.addFlashAttribute("mensagem","Cadastrado com sucesso");
        return "redirect:/listaProduto";
    }




}
