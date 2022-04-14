package PrototypePattern;

public class PrototypeMain {
    
    public static void main(String[] args) throws CloneNotSupportedException {
    
        Company company = new Dell();

        SystemsConfiguration systemConfig1 = new SystemsConfiguration("i7 9th Generation", "RTX GTX 3090", 32, 2);

        company.buildPC(systemConfig1);

        SystemsConfiguration systemConfig2 = (SystemsConfiguration)systemConfig1.clone();

        company.buildPC(systemConfig2);

        SystemsConfiguration systemConfig3 = (SystemsConfiguration)systemConfig1.clone();

        //Suppose we want to change the ram only
        systemConfig3.setRam(16);
        company.buildPC(systemConfig3);

    }
}
