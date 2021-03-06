
# InteropQuoteRequestData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionCode** | **String** |  | 
**requestCode** | **String** |  |  [optional]
**accountId** | **String** |  | 
**amount** | [**MoneyData**](MoneyData.md) |  | 
**transactionRole** | [**TransactionRoleEnum**](#TransactionRoleEnum) |  | 
**transactionType** | [**InteropTransactionTypeData**](InteropTransactionTypeData.md) |  |  [optional]
**note** | **String** |  |  [optional]
**geoCode** | [**GeoCodeData**](GeoCodeData.md) |  |  [optional]
**expiration** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**extensionList** | [**List&lt;ExtensionData&gt;**](ExtensionData.md) |  |  [optional]
**quoteCode** | **String** |  | 
**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) |  | 
**fees** | [**MoneyData**](MoneyData.md) |  |  [optional]
**expirationLocalDate** | [**LocalDate**](LocalDate.md) |  |  [optional]


<a name="TransactionRoleEnum"></a>
## Enum: TransactionRoleEnum
Name | Value
---- | -----
PAYER | &quot;PAYER&quot;
PAYEE | &quot;PAYEE&quot;


<a name="AmountTypeEnum"></a>
## Enum: AmountTypeEnum
Name | Value
---- | -----
SEND | &quot;SEND&quot;
RECEIVE | &quot;RECEIVE&quot;



