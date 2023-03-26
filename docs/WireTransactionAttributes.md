# WireTransactionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**amount** | **Integer** |  | 
**balance** | **Integer** |  | 
**summary** | **String** |  | 
**counterparty** | [**Counterparty**](Counterparty.md) |  | 
**description** | **String** |  |  [optional]
**senderReference** | **String** |  |  [optional]
**referenceForBeneficiary** | **String** |  |  [optional]
**originatorToBeneficiaryInformation** | **String** |  |  [optional]
**beneficiaryInformation** | **String** |  |  [optional]
**beneficiaryAdviceInformation** | **String** |  |  [optional]
**imadOmad** | [**WirePaymentAttributesImadOmad**](WirePaymentAttributesImadOmad.md) |  |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;
