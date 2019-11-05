package com.ezlinker.app;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ZeroArgFunction;
import org.luaj.vm2.lib.jse.JsePlatform;

/**
 * @program: ezlinker
 * @description: Luaj测试
 * @author: wangwenhai
 * @create: 2019-11-05 11:41
 **/
public class LuaJTest {
    public static void main(String[] args) {
        Globals globals = JsePlatform.standardGlobals();
        LuaValue luaValue=  globals.load("print \"HelloLua\"");
        String result = luaValue.call().toString();
        System.out.println(result);
    }
}

