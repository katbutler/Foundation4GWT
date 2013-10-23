/*
 *  Copyright 2012 GWT-Bootstrap
 *
 *	Modified for use in Foundation4GWT
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.wfairclough.foundation4gwt.client.ui.constants;

import com.wfairclough.foundation4gwt.client.ui.base.Style;

/**
* Size of a {@link Button Button}.
* 
* @since 1.0.0
* 
* @author Dominik Mayer
* @author Will Fairclough
* 
*/
public enum ButtonSize implements Style {

	DEFAULT(""), TINY("tiny"), SMALL("small"), MEDIUM("medium"), LARGE("large");
	
	private String className;

	private ButtonSize(String className) {
		this.className = className;
	}

	public String get() {
		return className;
	}

	public String getWithoutPrefix() {
		return className;
	}
}