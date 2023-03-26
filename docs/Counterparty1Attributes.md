# Counterparty1Attributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routingNumber** | **String** |  | 
**accountNumber** | **String** |  | 
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**name** | **String** |  | 
**bank** | **String** |  |  [optional]
**permissions** | [**PermissionsEnum**](#PermissionsEnum) |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 

<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
CHECKING | &quot;Checking&quot;
SAVINGS | &quot;Savings&quot;
LOAN | &quot;Loan&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BUSINESS | &quot;Business&quot;
PERSON | &quot;Person&quot;
UNKNOWN | &quot;Unknown&quot;

<a name="PermissionsEnum"></a>
## Enum: PermissionsEnum
Name | Value
---- | -----
CREDITONLY | &quot;CreditOnly&quot;
DEBITONLY | &quot;DebitOnly&quot;
CREDITANDDEBIT | &quot;CreditAndDebit&quot;
