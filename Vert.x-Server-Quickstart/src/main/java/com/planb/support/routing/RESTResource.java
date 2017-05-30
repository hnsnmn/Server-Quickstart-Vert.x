package com.planb.support.routing;

public class RESTResource {
	private String name;
	private String summary;
	private String method;
	private String uri;
	private String requestHeaders;
	private String params;
	private String formAttributes;
	private int successCode;
	private String responseHeaders;
	private String responseBody;
	private int failureCode;
	
	public RESTResource(String name, String summary, String method, String uri, String requestHeaders, String params, String formAttributes, int successCode, String responseHeaders, String responseBody, int failureCode) {
		this.setName(name);
		this.setSummary(summary);
		this.setMethod(method);
		this.setUri(uri);
		this.setRequestHeaders(requestHeaders);
		this.setParams(params);
		this.setFormAttributes(formAttributes);
		this.setSuccessCode(successCode);
		this.setResponseHeaders(responseHeaders);
		this.setResponseBody(responseBody);
		this.setFailureCode(failureCode);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getRequestHeaders() {
		return requestHeaders;
	}

	public void setRequestHeaders(String requestHeaders) {
		this.requestHeaders = requestHeaders;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}
	
	public String getFormAttributes() {
		return formAttributes;
	}

	public void setFormAttributes(String formAttributes) {
		this.formAttributes = formAttributes;
	}

	public int getSuccessCode() {
		return successCode;
	}

	public void setSuccessCode(int successCode) {
		this.successCode = successCode;
	}

	public String getResponseHeaders() {
		return responseHeaders;
	}

	public void setResponseHeaders(String responseHeaders) {
		this.responseHeaders = responseHeaders;
	}

	public String getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}

	public int getFailureCode() {
		return failureCode;
	}

	public void setFailureCode(int failureCode) {
		this.failureCode = failureCode;
	}
}