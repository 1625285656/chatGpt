package com.saimo.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.saimo.common.security.annotation.EnableCustomConfig;
import com.saimo.common.security.annotation.EnableRyFeignClients;
import com.saimo.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author 
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringBootApplication
public class GenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
				"                                                          \n"
                + "                     88                                  \n"
                + "                     ^^                                  \n"
                + "                                                         \n"
                + ",adPPYba, ,adPPYYba, 88 88,dPYba,,adPYba,   ,adPPYba,    \n"
                + "I8[    ^^ ^^     `Y8 88 88P'   ^88^    ^8a a8^     ^8a   \n"
                + " `^Y8ba,  ,adPPPPP88 88 88      88      88 8b       d8   \n"
                + "aa    ]8I 88,    ,88 88 88      88      88 ^8a,   ,a8^   \n"
                + "`^YbbdP^' `^8bbdP^Y8 88 88      88      88  `^YbbdP^'    \n"
                + "\n"
                + "\n"
                + "              88                       ad88                                          \n"
                + "              88              ,d      d8^                                            \n"
                + "              88              88      88                                             \n"
                + "  8b,dPPYba,  88 ,adPPYYba, MM88MMM MM88MMM ,adPPYba,  8b,dPPYba, 88,dPYba,,adPYba,  \n"
                + "  88P'    ^8a 88 ^^     `Y8   88      88   a8^     ^8a 88P'   ^Y8 88P'   ^88^    ^8a \n"
                + "  88       d8 88 ,adPPPPP88   88      88   8b       d8 88         88      88      88 \n"
                + "  88b,   ,a8^ 88 88,    ,88   88,     88   ^8a,   ,a8^ 88         88      88      88 \n"
                + "  88`YbbdP^'  88 `^8bbdP^Y8   ^Y888   88    `^YbbdP^'  88         88      88      88 \n"
                + "  88                                                                                 \n"
                + "  88                                                                                 ");
    }
}
