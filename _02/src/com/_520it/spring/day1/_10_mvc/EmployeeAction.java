package com._520it.spring.day1._10_mvc;

public class EmployeeAction {

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
