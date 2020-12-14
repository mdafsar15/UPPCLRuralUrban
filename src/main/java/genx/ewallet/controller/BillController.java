package genx.ewallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import genx.ewallet.model.UPPCLHierarchy;
import genx.ewallet.repository.IBillRepository;
import genx.ewallet.response.Response;
import genx.ewallet.service.BillService;

@RestController
public class BillController { 
    @Autowired
    private IBillRepository repo; 
    
    @Autowired
    private BillService billService;; 
  
    @GetMapping("/") 
    public String welcome() 
    { 
        return "<html><body>"
            + "<h1>WELCOME</h1>"
            + "</body></html>"; 
    } 
  
    @GetMapping("/company") 
    public List<UPPCLHierarchy> getAllNotes() 
    { 
        return repo.findAll(); 
    } 
  
    @GetMapping("/company/{id}") 
    public UPPCLHierarchy getCompanyById( 
        @PathVariable(value = "id") int id) 
    { 
        return repo.findById(id); 
    } 
  
//    @GetMapping("/division") 
//    public  List<String> getHierarchy1 (){
//    	return billService.findId();
//    }
    
    @GetMapping("/division")
	public ResponseEntity<Response> getHierarchy() {
		List<String> bill = billService.findId();
		System.out.println("Bills for response : " + bill);
		if (!bill.isEmpty()) {
			return ResponseEntity.status(HttpStatus.OK).body(new Response("Bills are", 200, bill));
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Response("No Record Found", 400, null));
	}
    
    @GetMapping("/bill")
 	public ResponseEntity<Response> getBill(@RequestParam("code") String code) {
 		List<String> bill = billService.findBillRural(code);
 		System.out.println("Bills for response : " + bill);
 		if (!bill.isEmpty()) {
 			return ResponseEntity.status(HttpStatus.OK).body(new Response("Bills are", 200, bill));
 		}
 		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Response("No Record Found", 400, null));
 	}

    @GetMapping("/billUrban")
 	public ResponseEntity<Response> getBillUrban(@RequestParam("area") String area,@RequestParam("code") String code) {
 		List<String> bill = billService.findBillRuralUrban(area,code);
 		System.out.println("Bills for response : " + bill);
 		if (!bill.isEmpty()) {
 			return ResponseEntity.status(HttpStatus.OK).body(new Response("Bills are", 200, bill));
 		}
 		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Response("No Record Found", 400, null));
 	}

}