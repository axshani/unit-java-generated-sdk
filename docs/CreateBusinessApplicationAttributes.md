# CreateBusinessApplicationAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**dba** | **String** |  |  [optional]
**ein** | **String** |  | 
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  | 
**dateOfIncorporation** | [**LocalDate**](LocalDate.md) |  |  [optional]
**stateOfIncorporation** | **String** |  | 
**purpose** | **String** |  |  [optional]
**phone** | [**Phone**](Phone.md) |  | 
**address** | [**Address**](Address.md) |  | 
**contact** | [**Contact**](Contact.md) |  | 
**officer** | [**Officer1**](Officer1.md) |  | 
**ip** | **OneOfCreateBusinessApplicationAttributesIp** |  |  [optional]
**website** | **String** |  |  [optional]
**beneficialOwners** | [**List&lt;BeneficialOwner1&gt;**](BeneficialOwner1.md) |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]
**idempotencyKey** | **String** |  |  [optional]
**deviceFingerprints** | [**List&lt;DeviceFingerprint&gt;**](DeviceFingerprint.md) |  |  [optional]
**industry** | [**Industry**](Industry.md) |  |  [optional]

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
CORPORATION | &quot;Corporation&quot;
LLC | &quot;LLC&quot;
PARTNERSHIP | &quot;Partnership&quot;
