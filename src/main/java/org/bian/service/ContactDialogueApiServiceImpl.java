/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ContactDialogueApiServiceImpl implements ContactDialogueApiService {

	public ContactDialogueBaseWithIds executePost(ContactDialogueBase request){
		return JsonReader.read("executePost-ContactDialogueBaseWithIds.json",new TypeReference<ContactDialogueBaseWithIds>(){});
	}
	
	public ContactDialogueBaseWithIds executePut(String crReferenceId, ContactDialogueBase request){
		return JsonReader.read("executePut-ContactDialogueBaseWithIds.json",new TypeReference<ContactDialogueBaseWithIds>(){});
	}
	
	public ContactDialogueRecordResponse record(String crReferenceId, ContactDialogueRecordRequest request){
		return JsonReader.read("record-ContactDialogueRecordResponse.json",new TypeReference<ContactDialogueRecordResponse>(){});
	}
	
	public ContactDialogueAuthenticationBaseWithIds requestPostAuthentications(String crReferenceId, ContactDialogueAuthenticationBase request){
		return JsonReader.read("requestPost-ContactDialogueAuthenticationBaseWithIds.json",new TypeReference<ContactDialogueAuthenticationBaseWithIds>(){});
	}
	
	public ContactDialogueAuthenticationBaseWithIds requestPutAuthentications(String crReferenceId, String bqReferenceId, ContactDialogueAuthenticationBase request){
		return JsonReader.read("requestPut-ContactDialogueAuthenticationBaseWithIds.json",new TypeReference<ContactDialogueAuthenticationBaseWithIds>(){});
	}
	
	public ContactDialogueCaseBaseWithIds requestPostCases(String crReferenceId, ContactDialogueCaseBase request){
		return JsonReader.read("requestPost-ContactDialogueCaseBaseWithIds.json",new TypeReference<ContactDialogueCaseBaseWithIds>(){});
	}
	
	public ContactDialogueCaseBaseWithIds requestPutCases(String crReferenceId, String bqReferenceId, ContactDialogueCaseBase request){
		return JsonReader.read("requestPut-ContactDialogueCaseBaseWithIds.json",new TypeReference<ContactDialogueCaseBaseWithIds>(){});
	}
	
	public ContactDialogueSalesBaseWithIds requestPostSales(String crReferenceId, ContactDialogueSalesRequest request){
		return JsonReader.read("requestPost-ContactDialogueSalesBaseWithIds.json",new TypeReference<ContactDialogueSalesBaseWithIds>(){});
	}
	
	public ContactDialogueSalesBaseWithIds requestPutSales(String crReferenceId, String bqReferenceId, ContactDialogueSalesRequest request){
		return JsonReader.read("requestPut-ContactDialogueSalesBaseWithIds.json",new TypeReference<ContactDialogueSalesBaseWithIds>(){});
	}
	
	public ContactDialogueOfferBaseWithIds requestPostOffers(String crReferenceId, ContactDialogueOfferBase request){
		return JsonReader.read("requestPost-ContactDialogueOfferBaseWithIds.json",new TypeReference<ContactDialogueOfferBaseWithIds>(){});
	}
	
	public ContactDialogueOfferBaseWithIds requestPutOffers(String crReferenceId, String bqReferenceId, ContactDialogueOfferBase request){
		return JsonReader.read("requestPut-ContactDialogueOfferBaseWithIds.json",new TypeReference<ContactDialogueOfferBaseWithIds>(){});
	}
	
	public ContactDialogueOrderBaseWithIds requestPostOrders(String crReferenceId, ContactDialogueOrderBase request){
		return JsonReader.read("requestPost-ContactDialogueOrderBaseWithIds.json",new TypeReference<ContactDialogueOrderBaseWithIds>(){});
	}
	
	public ContactDialogueOrderBaseWithIds requestPutOrders(String crReferenceId, String bqReferenceId, ContactDialogueOrderBase request){
		return JsonReader.read("requestPut-ContactDialogueOrderBaseWithIds.json",new TypeReference<ContactDialogueOrderBaseWithIds>(){});
	}
	
	public ContactDialogueProductServiceBaseWithIds requestPostProductsServices(String crReferenceId, ContactDialogueProductServiceBase request){
		return JsonReader.read("requestPost-ContactDialogueProductServiceBaseWithIds.json",new TypeReference<ContactDialogueProductServiceBaseWithIds>(){});
	}
	
	public ContactDialogueProductServiceBaseWithIds requestPutProductsServices(String crReferenceId, String bqReferenceId, ContactDialogueProductServiceBase request){
		return JsonReader.read("requestPut-ContactDialogueProductServiceBaseWithIds.json",new TypeReference<ContactDialogueProductServiceBaseWithIds>(){});
	}
	
	public ContactDialogueQueryBaseWithIds requestPostQueries(String crReferenceId, ContactDialogueQueryBase request){
		return JsonReader.read("requestPost-ContactDialogueQueryBaseWithIds.json",new TypeReference<ContactDialogueQueryBaseWithIds>(){});
	}
	
	public ContactDialogueQueryBaseWithIds requestPutQueries(String crReferenceId, String bqReferenceId, ContactDialogueQueryBase request){
		return JsonReader.read("requestPut-ContactDialogueQueryBaseWithIds.json",new TypeReference<ContactDialogueQueryBaseWithIds>(){});
	}
	
	public ContactDialogueBaseWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ContactDialogueBaseWithIds.json",new TypeReference<ContactDialogueBaseWithIds>(){});
	}
	
	public ContactDialogueAuthenticationBaseWithIds retrieveAuthentications(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactDialogueAuthenticationBaseWithIds.json",new TypeReference<ContactDialogueAuthenticationBaseWithIds>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ContactDialogueCaseBaseWithIds retrieveCases(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactDialogueCaseBaseWithIds.json",new TypeReference<ContactDialogueCaseBaseWithIds>(){});
	}
	
	public ContactDialogueHistoryBaseWithIds retrieveHistories(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactDialogueHistoryBaseWithIds.json",new TypeReference<ContactDialogueHistoryBaseWithIds>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ContactDialogueIntelligenceBaseWithIds retrieveIntelligences(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactDialogueIntelligenceBaseWithIds.json",new TypeReference<ContactDialogueIntelligenceBaseWithIds>(){});
	}
	
	public ContactDialogueOfferBaseWithIds retrieveOffers(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactDialogueOfferBaseWithIds.json",new TypeReference<ContactDialogueOfferBaseWithIds>(){});
	}
	
	public ContactDialogueOrderBaseWithIds retrieveOrders(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactDialogueOrderBaseWithIds.json",new TypeReference<ContactDialogueOrderBaseWithIds>(){});
	}
	
	public ContactDialogueProductServiceBaseWithIds retrieveProductsServices(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactDialogueProductServiceBaseWithIds.json",new TypeReference<ContactDialogueProductServiceBaseWithIds>(){});
	}
	
	public ContactDialogueQueryBaseWithIds retrieveQueries(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactDialogueQueryBaseWithIds.json",new TypeReference<ContactDialogueQueryBaseWithIds>(){});
	}
	
	public ContactDialogueSalesBaseWithIds retrieveSales(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ContactDialogueSalesBaseWithIds.json",new TypeReference<ContactDialogueSalesBaseWithIds>(){});
	}
	
	public ContactDialogueBaseWithIds update(String crReferenceId, ContactDialogueBase request){
		return JsonReader.read("update-ContactDialogueBaseWithIds.json",new TypeReference<ContactDialogueBaseWithIds>(){});
	}
	
}
