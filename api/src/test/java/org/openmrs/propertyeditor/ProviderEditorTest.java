/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.propertyeditor;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.test.BaseContextSensitiveTest;

public class ProviderEditorTest extends BaseContextSensitiveTest {
	
	/**
	 * @see ProviderEditor#setAsText(String)
	 */
	@Test
	public void setAsText_shouldSetUsingId() throws Exception {
		ProviderEditor editor = new ProviderEditor();
		editor.setAsText("1");
		Assert.assertNotNull(editor.getValue());
	}
	
	/**
	 * @see ProviderEditor#setAsText(String)
	 */
	@Test
	public void setAsText_shouldSetUsingUuid() throws Exception {
		ProviderEditor editor = new ProviderEditor();
		editor.setAsText("c2299800-cca9-11e0-9572-0800200c9a66");
		Assert.assertNotNull(editor.getValue());
	}
}
