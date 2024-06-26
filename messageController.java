package cn.lilulu.java_web_zangda.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //添加此注解后可以接收到前端传输过来的数据
public class messageController {

    /**
     *  model是数据容器*/

    @RequestMapping("/msg")
    public String msg(String wd, Model model){
        //查验是否接收到前端的数据
        //System.out.println(wd);
        if(wd.equals("王者荣耀")){
            //将处理完的数据放回前端页面
            //System.out.println("");
            String info = "我也喜欢王者荣耀,农批";
            model.addAttribute("info",info);
        }else{
            String info = "我也喜欢原神,启动!!!";
            model.addAttribute("info",info);
        }
        return "msg";
    }
}
