// Copyright © 2012-2018 Vaughn Vernon. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.cluster.model.attribute;

import io.vlingo.actors.Logger;
import io.vlingo.cluster.model.attribute.message.ApplicationMessageType;
import io.vlingo.wire.node.Configuration;
import io.vlingo.wire.node.Id;

public class NoOpConfirmationInterest implements ConfirmationInterest {
  private final Logger logger;
  
  public NoOpConfirmationInterest(final Configuration configuration) {
    this.logger = configuration.logger();
  }

  @Override
  public void confirm(final Id confirmingNodeId, final String attributeSetName, final String attributeName, final ApplicationMessageType type) {
    logger.log("ATTR CONFIRMATION: NODE: " + confirmingNodeId.value() + " SET: " + attributeSetName + " ATTR: " + attributeName + " TYPE: " + type);
  }
}
