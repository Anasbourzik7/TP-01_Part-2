package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IIDao
{

    @Override
    public double getData() {
        System.out.println("version base de donnees");
        double temp=Math.random()*40;
        return temp;
    }
}
