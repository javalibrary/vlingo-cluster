// Copyright © 2012-2018 Vaughn Vernon. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.cluster.model.attribute;

import io.vlingo.cluster.model.attribute.message.ApplicationMessageType;
import io.vlingo.wire.node.Id;

public interface ConfirmationInterest {
  void confirm(final Id confirmingNodeId, final String attributeSetName, final String attributeName, final ApplicationMessageType type);
}
