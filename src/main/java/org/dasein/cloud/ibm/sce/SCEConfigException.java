/**
 * Copyright (C) 2012 enStratus Networks Inc
 *
 * ====================================================================
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
 * ====================================================================
 */

package org.dasein.cloud.ibm.sce;

import org.dasein.cloud.InternalException;

import javax.annotation.Nonnull;

/**
 * Error configuring Dasein Cloud for SmartCloud.
 * <p>Created by George Reese: 7/16/12 7:45 PM</p>
 * @author George Reese
 * @version 2012.04 initial version
 * @since 2012.04
 */
public class SCEConfigException extends InternalException {
    public SCEConfigException(@Nonnull String message) {
        super(message);
    }

    public SCEConfigException(@Nonnull Throwable cause) {
        super(cause);
    }
}
