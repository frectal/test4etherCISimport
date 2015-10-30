/*
 * Copyright (c) 2015 Christian Chevalley
 * This file is part of Project Ethercis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ethercis.ehr.encode.wrappers;

import com.ethercis.ehr.encode.DataValueAdapter;
import org.openehr.rm.datatypes.uri.DvURI;

import java.util.HashMap;
import java.util.Map;

public class DvURIVBean extends DataValueAdapter implements I_VBeanWrapper {

	public DvURIVBean(DvURI u) {
		this.adaptee = u;
	}
	
	@Override
	public Map<String, Object> getFieldMap() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("value", adaptee.toString());
		return map;
	}

    @Override
    public DvURI parse(String value, String... defaults) {
        adaptee = ((DvURI)adaptee).parse(value);
        return (DvURI)adaptee;
    }
}