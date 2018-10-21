/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ContactDialogueApiService {

	ContactDialogueBaseWithIds executePost(ContactDialogueBase request);
	
	ContactDialogueBaseWithIds executePut(String crReferenceId, ContactDialogueBase request);
	
	ContactDialogueRecordResponse record(String crReferenceId, ContactDialogueRecordRequest request);
	
	ContactDialogueAuthenticationBaseWithIds requestPostAuthentications(String crReferenceId, ContactDialogueAuthenticationBase request);
	
	ContactDialogueAuthenticationBaseWithIds requestPutAuthentications(String crReferenceId, String bqReferenceId, ContactDialogueAuthenticationBase request);
	
	ContactDialogueCaseBaseWithIds requestPostCases(String crReferenceId, ContactDialogueCaseBase request);
	
	ContactDialogueCaseBaseWithIds requestPutCases(String crReferenceId, String bqReferenceId, ContactDialogueCaseBase request);
	
	ContactDialogueSalesBaseWithIds requestPostSales(String crReferenceId, ContactDialogueSalesRequest request);
	
	ContactDialogueSalesBaseWithIds requestPutSales(String crReferenceId, String bqReferenceId, ContactDialogueSalesRequest request);
	
	ContactDialogueOfferBaseWithIds requestPostOffers(String crReferenceId, ContactDialogueOfferBase request);
	
	ContactDialogueOfferBaseWithIds requestPutOffers(String crReferenceId, String bqReferenceId, ContactDialogueOfferBase request);
	
	ContactDialogueOrderBaseWithIds requestPostOrders(String crReferenceId, ContactDialogueOrderBase request);
	
	ContactDialogueOrderBaseWithIds requestPutOrders(String crReferenceId, String bqReferenceId, ContactDialogueOrderBase request);
	
	ContactDialogueProductServiceBaseWithIds requestPostProductsServices(String crReferenceId, ContactDialogueProductServiceBase request);
	
	ContactDialogueProductServiceBaseWithIds requestPutProductsServices(String crReferenceId, String bqReferenceId, ContactDialogueProductServiceBase request);
	
	ContactDialogueQueryBaseWithIds requestPostQueries(String crReferenceId, ContactDialogueQueryBase request);
	
	ContactDialogueQueryBaseWithIds requestPutQueries(String crReferenceId, String bqReferenceId, ContactDialogueQueryBase request);
	
	ContactDialogueBaseWithIds retrieve(String crReferenceId);
	
	ContactDialogueAuthenticationBaseWithIds retrieveAuthentications(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	ContactDialogueCaseBaseWithIds retrieveCases(String crReferenceId, String bqReferenceId);
	
	ContactDialogueHistoryBaseWithIds retrieveHistories(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	ContactDialogueIntelligenceBaseWithIds retrieveIntelligences(String crReferenceId, String bqReferenceId);
	
	ContactDialogueOfferBaseWithIds retrieveOffers(String crReferenceId, String bqReferenceId);
	
	ContactDialogueOrderBaseWithIds retrieveOrders(String crReferenceId, String bqReferenceId);
	
	ContactDialogueProductServiceBaseWithIds retrieveProductsServices(String crReferenceId, String bqReferenceId);
	
	ContactDialogueQueryBaseWithIds retrieveQueries(String crReferenceId, String bqReferenceId);
	
	ContactDialogueSalesBaseWithIds retrieveSales(String crReferenceId, String bqReferenceId);
	
	ContactDialogueBaseWithIds update(String crReferenceId, ContactDialogueBase request);
	
}
