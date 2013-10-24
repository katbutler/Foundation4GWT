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
package com.wfairclough.foundation4gwt.client.ui.widget;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.wfairclough.foundation4gwt.client.ui.base.TopBarItem;
import com.wfairclough.foundation4gwt.client.ui.base.UnorderedList;

public class TopBarList extends UnorderedList {

	private static String ADD_WIDGET_TOP_BAR_LIST = "Trying to add widget to TopBarList that can only accept TopBarItem Widgets";

	
	public TopBarList() {
		super();
	}

	/**
	 * Add a {@link TopBarItem} to this {@link TopBarList}
	 * 
	 * @param child to add
	 */
	public void add(IsWidget child) {
		Widget widget = asWidgetOrNull(child);
		
		if (widget != null && (child instanceof TopBarItem) ) {
			super.add(widget, getElement());
		} else {
			throw new IllegalArgumentException(ADD_WIDGET_TOP_BAR_LIST);
		}
	}
	
	/**
	 * Add a {@link TopBarItem} to this {@link TopBarList}
	 * 
	 * @param child to add
	 */
	public void add(Widget child) {
		if (child instanceof TopBarItem) {
			super.add(child, getElement());
		} else {
			throw new IllegalArgumentException(ADD_WIDGET_TOP_BAR_LIST);
		}
	}
	
}