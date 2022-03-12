package petrea.alexandru.vladut.proiect;

import java.util.HashMap;

public class Numeutilizatorsiparola {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    public void setLogininfo(HashMap<String, String> logininfo) {
        this.logininfo = logininfo;
    }


    public Numeutilizatorsiparola() {
        logininfo.put("Alex.2000", "sarmale");
        logininfo.put("Vlad.123", "hello");
        logininfo.put("Mada.12", "15032019");

    }

    public HashMap getLogininfo() {
        return logininfo;
    }
}
