/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.privacy;

/**
 * Confidential objects has a pseudonym for the name as an Id.
 * Implement this interface whenever you have some object to be logged while retaining unique
 * identifier which can be correlated to real object.
 * Used for things like
 * <ul>
 *     <li>User: object where we do not want to expose real user name</li>
 *     <li>email: where we do not want to expose real email address</li>
 * </ul>
 */
public interface Confidential {

    /**
     * Get the the pseudonym for the name.
     * @return Pseudonymous id as a string.
     */
    String getId();
}
