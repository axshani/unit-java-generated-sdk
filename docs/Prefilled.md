# Prefilled

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationType** | [**ApplicationTypeEnum**](#ApplicationTypeEnum) |  |  [optional]
**fullName** | [**FullName**](FullName.md) |  |  [optional]
**ssn** | **Object** |  |  [optional]
**passport** | **Object** |  |  [optional]
**nationality** | **String** |  |  [optional]
**dateOfBirth** | [**LocalDate**](LocalDate.md) |  |  [optional]
**email** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**stateOfIncorporation** | **String** |  |  [optional]
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional]
**contact** | [**Contact**](Contact.md) |  |  [optional]
**officer** | [**Officer1**](Officer1.md) |  |  [optional]
**beneficialOwners** | [**List&lt;BeneficialOwner1&gt;**](BeneficialOwner1.md) |  |  [optional]
**website** | **String** |  |  [optional]
**phone** | [**Phone**](Phone.md) |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**dba** | **String** |  |  [optional]
**ein** | **String** |  |  [optional]
**jwtSubject** | [**JwtSubject**](JwtSubject.md) |  |  [optional]
**industry** | [**Industry**](Industry.md) |  |  [optional]

<a name="ApplicationTypeEnum"></a>
## Enum: ApplicationTypeEnum
Name | Value
---- | -----
INDIVIDUAL | &quot;Individual&quot;
BUSINESS | &quot;Business&quot;
SOLEPROPRIETORSHIP | &quot;SoleProprietorship&quot;

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
CORPORATION | &quot;Corporation&quot;
LLC | &quot;LLC&quot;
PARTNERSHIP | &quot;Partnership&quot;
