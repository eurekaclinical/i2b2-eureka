package org.eurekaclinical.i2b2.props;

/*
 * #%L
 * i2b2 Eureka Service
 * %%
 * Copyright (C) 2015 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import javax.inject.Singleton;
import org.eurekaclinical.i2b2.client.props.I2b2Properties;
import org.eurekaclinical.standardapis.props.CasEurekaClinicalProperties;

/**
 *
 * @author Andrew Post
 */
@Singleton
public class I2b2EurekaServicesProperties extends CasEurekaClinicalProperties implements I2b2Properties {

	public I2b2EurekaServicesProperties() {
		super("/etc/ec-i2b2");
	}
	
	@Override
	public String getProxyCallbackServer() {
		return this.getValue("eurekaclinical.i2b2service.callbackserver", "https://localhost:8443");
	}
	
	@Override
	public String getProxyUrl() {
		return this.getValue("eurekaclinical.i2b2service.proxyUrl", "https://localhost/i2b2/index.php");
	}

	/**
	 * Gets the URL of the i2b2 services. Reads from the properties file first if necessary.
	 *
	 * @return the URL as a String
	 */
	@Override
	public String getI2b2ServiceHostUrl() {
		return this.getValue("eurekaclinical.i2b2service.serviceHostUrl", "http://localhost:9090");
	}
	
	public String getServiceUrl() {
		return this.getValue("eureka.webapp.url", "https://localhost/eureka-webapp");
	}
	
	public String getSourceConfigId() {
		return this.getValue("eurekaclinical.i2b2service.sourceConfigId", "i2b2 Eureka Service");
	}
	
}