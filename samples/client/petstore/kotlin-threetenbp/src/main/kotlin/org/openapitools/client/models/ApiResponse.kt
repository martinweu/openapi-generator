/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
/**
 * Describes the result of uploading an image resource
 * @param code 
 * @param type 
 * @param message 
 */

data class ApiResponse (
    @Json(name = "code")
    val code: kotlin.Int? = null,
    @Json(name = "type")
    val type: kotlin.String? = null,
    @Json(name = "message")
    val message: kotlin.String? = null
) 





