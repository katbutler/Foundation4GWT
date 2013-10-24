/*
 *  Copyright 2013 Foundation4GWT
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
package com.wfairclough.foundation4gwt.client.ui.base;

import com.google.gwt.user.client.ui.Widget;

/**
 * Simple wrapper for an HTML {@code <li>} tag.
 * 
 * @since 1.0.0
 * 
 * @author Carlos Alexandro Becker
 * @author Will Fairclough
 */
public class ListItem extends ComplexWidget {

	/**
	 * Creates a new ListItem.
	 */
	public ListItem() {
		super("li");
	}

	/**
	 * Creates a new ListItem and adds the given widgets.
	 * 
	 * @param widgets
	 *            widgets to be added.
	 */
	public ListItem(Widget... widgets) {
		this();
		for (Widget w : widgets) {
			add(w);
		}
	}
}
