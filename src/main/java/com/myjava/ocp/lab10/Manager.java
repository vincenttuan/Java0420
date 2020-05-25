package com.myjava.ocp.lab10;

public class Manager {
    private String name = "John";
    
    public void job() {
        System.out.println("管理人員");
        Tech tech = new Tech();
        tech.job();
    }

    private class Tech {
        private String name = "系統開發";
        public void job() {
            String name = "工作";
            System.out.println(Manager.this.name + name + this.name);
        }
    }
    
    public class Sales {
        private String name = "對外行銷系統產品";
        public void job() {
            System.out.println(name);
        }
    }

}
