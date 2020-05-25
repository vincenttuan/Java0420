package com.myjava.ocp.lab10;

public class Manager {

    public void job() {
        System.out.println("管理人員");
        Tech tech = new Tech();
        tech.job();
    }

    private class Tech {
        public void job() {
            System.out.println("系統開發");
        }
    }
    
    public class Sales {
        public void job() {
            System.out.println("對外行銷系統產品");
        }
    }

}
