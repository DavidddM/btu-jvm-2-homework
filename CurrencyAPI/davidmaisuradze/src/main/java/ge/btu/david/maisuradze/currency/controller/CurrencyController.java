package ge.btu.david.maisuradze.currency.controller;

import ge.btu.david.maisuradze.currency.model.Currency;
import ge.btu.david.maisuradze.currency.model.RequestModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/currency")
public class CurrencyController {

    List<Currency> currencies = new ArrayList<>(Arrays.asList(
            new Currency("USD",3.16,3.2),
            new Currency("EUR",3.425,3.475),
            new Currency("GBP",3.84,3.94),
            new Currency("RUB",4.12,4.3),
            new Currency("TRY",0.4,0.47),
            new Currency("AZN",1.6,1.84)));

    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> getRates(){
        return currencies;
    }

    @POST
    @Path("/buy")
    @Consumes(MediaType.APPLICATION_JSON)
    public double buy(RequestModel requestModel) {
        Currency currency = new Currency();
        boolean found = false;
        for (Currency curr: currencies) {
            if(curr.getCurrenyName().equals(requestModel.getTo())) {
                currency = curr;
                found = true;
            }
            if(!found) {
                return 0.0;
            }
        }

        return requestModel.getAmount() / currency.getSellValue();
    }

    @POST
    @Path("/sell")
    @Consumes(MediaType.APPLICATION_JSON)
    public double sell(RequestModel requestModel) {
        Currency currency = new Currency();
        boolean found = false;
        for (Currency curr: currencies) {
            if(curr.getCurrenyName().equals(requestModel.getTo())) {
                currency = curr;
                found = true;
            }
        }
        if(!found) {
            return 0.0;
        }
        return requestModel.getAmount() * currency.getBuyValue();
    }
}
