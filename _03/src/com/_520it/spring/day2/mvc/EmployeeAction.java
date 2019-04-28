package com._520it.spring.day2.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("employeeAction")
//@Controller
@Scope("prototype")
public class EmployeeAction {

    @Autowired
    private IEmployeeService service;

    public void setService(IEmployeeService service) {
        this.service = service;
    }

    public String save(){
        Employee e = new Employee();
        service.save(e);
        return "success";
    }

}
