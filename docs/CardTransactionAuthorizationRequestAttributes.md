# CardTransactionAuthorizationRequestAttributes

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
**paymentMethod** | **String** |  |  [optional]
**digitalWallet** | **String** |  |  [optional]
**cardVerificationData** | [**CardVerificationData**](CardVerificationData.md) |  |  [optional]
**cardNetwork** | **String** |  |  [optional]
