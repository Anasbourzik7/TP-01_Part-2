package ext;

import dao.IIDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IIDao {

    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp=1000;
        return temp;
    }

}
