package metier;

import dao.IIDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {

    private IIDao dao;

    public IMetierImpl(IIDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
double tmp= dao.getData();
double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    public void setDao(IIDao dao) {
        this.dao = dao;
    }
} 
