# PurchaseAuthorizationRequestAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**amount** | **Integer** |  | 
**status** | **String** |  | 
**partialApprovalAllowed** | **Boolean** |  | 
**approvedAmount** | **Integer** |  |  [optional]
**declineReason** | **String** |  |  [optional]
**merchant** | [**Merchant**](Merchant.md) |  | 
**recurring** | **Boolean** |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]
**healthcareAmounts** | [**HealthcareAmounts**](HealthcareAmounts.md) |  |  [optional]
**paymentMethod** | **String** |  |  [optional]
**digitalWallet** | **String** |  |  [optional]
**cardVerificationData** | [**CardVerificationData**](CardVerificationData.md) |  |  [optional]
**ecommerce** | **Boolean** |  |  [optional]
**cardPresent** | **Boolean** |  |  [optional]
**cardNetwork** | **String** |  |  [optional]
**cashWithdrawalAmount** | **Integer** |  |  [optional]
