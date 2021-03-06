/**
 * Copyright (C) FuseSource, Inc.
 * http://fusesource.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.gateway.fabric;

import org.codehaus.jackson.annotate.JsonProperty;
import org.fusesource.gateway.ServiceDetails;

import java.util.Collections;
import java.util.List;

/**
 */
public class ServiceDTO implements ServiceDetails {
	@JsonProperty
	private String id;

	@JsonProperty
	private String container;

    @JsonProperty
    private List<String> services = Collections.EMPTY_LIST;

    public String getId() {
        return id;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    @Override
	public String toString() {
		return "ServiceDTO{" +
				"id='" + id + '\'' +
				", services=" + services + "}";
	}
}
