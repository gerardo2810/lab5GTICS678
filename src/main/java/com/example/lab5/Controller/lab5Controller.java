package com.example.lab5.Controller;

import com.example.lab5.Entity.Employees;
import com.example.lab5.Repository.EmployeesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class lab5Controller {
    /* Repositorios */
    final EmployeesRepository employeesRepository;

    public lab5Controller(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @GetMapping("/recursos_humanosGTICS")
    public String labInicio() {
        return "/recursos_humanosGTICS";
    }

    @GetMapping("/reporstes_dashborads.html")
    public String reportes() {
        return "/reporstes_dashborads.html";
    }
    @GetMapping("/empleados")
    public String empleadoss(Model model) {
        List<Employees> listaEmp = employeesRepository.findAll();
        model.addAttribute("listaEmp", listaEmp);
        return "/empleados";
    }
    @GetMapping("/salario")
    public String salario(Model model) {

        return "/salario";
    }



}
