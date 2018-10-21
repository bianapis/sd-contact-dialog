/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class ContactDialogueApiController {

	@Autowired
	ContactDialogueApiService service;
	
	@Process.ExecutePost
	public BianResponse<ContactDialogueBaseWithIds> executePost(@RequestBody BianRequest<ContactDialogueBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Process.ExecutePut
	public BianResponse<ContactDialogueBaseWithIds> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<ContactDialogueRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("authentications")
	@Process.RequestPost
	public BianResponse<ContactDialogueAuthenticationBaseWithIds> requestPostAuthentications(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueAuthenticationBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostAuthentications(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("authentications")
	@Process.RequestPut
	public BianResponse<ContactDialogueAuthenticationBaseWithIds> requestPutAuthentications(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactDialogueAuthenticationBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutAuthentications(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("cases")
	@Process.RequestPost
	public BianResponse<ContactDialogueCaseBaseWithIds> requestPostCases(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostCases(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cases")
	@Process.RequestPut
	public BianResponse<ContactDialogueCaseBaseWithIds> requestPutCases(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactDialogueCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutCases(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sales")
	@Process.RequestPost
	public BianResponse<ContactDialogueSalesBaseWithIds> requestPostSales(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueSalesRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPostSales(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("sales")
	@Process.RequestPut
	public BianResponse<ContactDialogueSalesBaseWithIds> requestPutSales(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactDialogueSalesRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPutSales(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("offers")
	@Process.RequestPost
	public BianResponse<ContactDialogueOfferBaseWithIds> requestPostOffers(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueOfferBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostOffers(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("offers")
	@Process.RequestPut
	public BianResponse<ContactDialogueOfferBaseWithIds> requestPutOffers(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactDialogueOfferBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutOffers(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("orders")
	@Process.RequestPost
	public BianResponse<ContactDialogueOrderBaseWithIds> requestPostOrders(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostOrders(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("orders")
	@Process.RequestPut
	public BianResponse<ContactDialogueOrderBaseWithIds> requestPutOrders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactDialogueOrderBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutOrders(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("products-services")
	@Process.RequestPost
	public BianResponse<ContactDialogueProductServiceBaseWithIds> requestPostProductsServices(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueProductServiceBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostProductsServices(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("products-services")
	@Process.RequestPut
	public BianResponse<ContactDialogueProductServiceBaseWithIds> requestPutProductsServices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactDialogueProductServiceBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutProductsServices(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("queries")
	@Process.RequestPost
	public BianResponse<ContactDialogueQueryBaseWithIds> requestPostQueries(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueQueryBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostQueries(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("queries")
	@Process.RequestPut
	public BianResponse<ContactDialogueQueryBaseWithIds> requestPutQueries(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ContactDialogueQueryBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutQueries(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<ContactDialogueBaseWithIds> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("authentications")
	@Process.Retrieve
	public BianResponse<ContactDialogueAuthenticationBaseWithIds> retrieveAuthentications(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthentications(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("cases")
	@Process.Retrieve
	public BianResponse<ContactDialogueCaseBaseWithIds> retrieveCases(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCases(crReferenceId, bqReferenceId));
	}
	
	@BQ("histories")
	@Process.Retrieve
	public BianResponse<ContactDialogueHistoryBaseWithIds> retrieveHistories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveHistories(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("intelligences")
	@Process.Retrieve
	public BianResponse<ContactDialogueIntelligenceBaseWithIds> retrieveIntelligences(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIntelligences(crReferenceId, bqReferenceId));
	}
	
	@BQ("offers")
	@Process.Retrieve
	public BianResponse<ContactDialogueOfferBaseWithIds> retrieveOffers(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOffers(crReferenceId, bqReferenceId));
	}
	
	@BQ("orders")
	@Process.Retrieve
	public BianResponse<ContactDialogueOrderBaseWithIds> retrieveOrders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOrders(crReferenceId, bqReferenceId));
	}
	
	@BQ("products-services")
	@Process.Retrieve
	public BianResponse<ContactDialogueProductServiceBaseWithIds> retrieveProductsServices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductsServices(crReferenceId, bqReferenceId));
	}
	
	@BQ("queries")
	@Process.Retrieve
	public BianResponse<ContactDialogueQueryBaseWithIds> retrieveQueries(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveQueries(crReferenceId, bqReferenceId));
	}
	
	@BQ("sales")
	@Process.Retrieve
	public BianResponse<ContactDialogueSalesBaseWithIds> retrieveSales(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSales(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<ContactDialogueBaseWithIds> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ContactDialogueBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
