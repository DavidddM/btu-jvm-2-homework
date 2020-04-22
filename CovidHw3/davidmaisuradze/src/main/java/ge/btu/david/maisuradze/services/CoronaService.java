package ge.btu.david.maisuradze.services;

import ge.btu.david.maisuradze.models.Covid;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@WebService
public class CoronaService {
    List<Covid> cases = new ArrayList<>(Arrays.asList(
            new Covid("Georgia", 410, 3, 30),
            new Covid("USA", 820600, 45965, 83203),
            new Covid("Spain", 208389, 21717, 85913),
            new Covid("Italy", 183713, 25863, 54543),
            new Covid("France", 158050, 20313, 39195)));

    @WebMethod
    public List<Covid> getStatistic() {
        return cases;
    }

    @WebMethod
    public Covid CountryStatistic(final String country) {
        if (cases.stream().filter(c -> c.getCountry().equals(country)).findFirst().isPresent()) {
            return cases.stream().filter(c -> c.getCountry().equals(country)).findFirst().get();
        }
        return new Covid();
    }

    @WebMethod
    public int TotalConfirmed() {
        return cases.stream().mapToInt(Covid::getConfirmed).sum();
    }

    @WebMethod
    public int TotalDeathget() {
        return cases.stream().mapToInt(Covid::getDeath).sum();
    }

    @WebMethod
    public int TotalRecoveryget() {
        return cases.stream().mapToInt(Covid::getRecovered).sum();
    }

}

