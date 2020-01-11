package com.aaa.czj.controller;

import com.aaa.czj.dao.PersonDao;
import com.aaa.czj.entity.LayUiTableData;
import com.aaa.czj.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonDao personDao;
    //thymeleaf
//    @RequestMapping("/all")
//    public String findAllPerson(Model model){
//        List<Person> allPerson = personDao.findAllPerson();
//        for (Person person : allPerson) {
//            System.out.println(person.toString()  );
//        }
//        model.addAttribute("name","czj");
//        model.addAttribute("allPerson",allPerson);
//        //return "hello";
//        return "sel";
//    }


    //layui 查询
    @RequestMapping("/all")
    public String toLayUiPage() {
        return "sel";
    }
    @RequestMapping("/findperson")
    @ResponseBody  //layui 的模板解析器（没有会报错）
    public LayUiTableData findPerson(){
        LayUiTableData layUiTableData = new LayUiTableData();
        List<Person> allPerson = personDao.findAllPerson();
        layUiTableData.setCode(0);
        layUiTableData.setData(allPerson);
        return layUiTableData;
    }
    //添加
    @RequestMapping("/toadd")
    public String toupdate(){
        return "adduser";
    }
    //添加
    @RequestMapping("/insertuser")
    public String insertuser(Person person){
        System.out.println(person);
        personDao.addUser(person);
        System.out.println(person);
        //返回到all  页面
        return "redirect:/all";
    }

    //删除
    @RequestMapping("todel")
    public String deleteById(Integer dept){
        System.out.println(dept);
        personDao.deleteById(dept);
        return "redirect:/all";
    }
}
