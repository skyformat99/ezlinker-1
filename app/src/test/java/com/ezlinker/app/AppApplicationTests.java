package com.ezlinker.app;


import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {
//    @Resource
//    IRoleService roleService;
//
//    @Test
//    void addRoles() {
//        Role admin = new Role();
//        admin.setLabel("系统管理员").setName("ADMIN").setDescription("系统内部管理员").setParent(0L);
//        admin.setCreateTime(new Date());
//
//        Role user = new Role();
//        user.setLabel("普通用户").setName("USER").setDescription("系统注册用户").setParent(0L);
//        user.setCreateTime(new Date());
//        roleService.save(admin);
//        roleService.save(user);
//    }
//
//    @Autowired
//    TemplateEngine templateEngine;
//    @Autowired
//    MailService mailService;
//
//    @Test
//    void sendTemplateMail() throws XException {
//        //创建邮件正文
//        Context context = new Context();
//        //context.setVariable("id", "006");
//        String emailContent = templateEngine.process("register_email", context);
//        mailService.sendTextMail("751957846@qq.com","激活账户",emailContent);
//        System.out.println("邮件发送报告测试");
//    }
}
