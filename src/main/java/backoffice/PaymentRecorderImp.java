package backoffice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/payment")
@Named
@SessionScoped
public class PaymentRecorderImp implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB(lookup="java:global/BackOfficeEAR-1/BackOfficeEJB-1/PaymentRecorderImpl!backoffice.PaymentRecorder")
	private PaymentRecorder pr;
	public PaymentRecorderImp() {}
	
    @GET
    @Produces("application/json")
    public List<Payment> getP(){
    	List<String> gp = pr.getPayments();
    	List<Payment> payments = new ArrayList<>();
    	for(String p:gp) {
    		payments.add(new Payment(p));
    	}
    	return payments;
    }

}
