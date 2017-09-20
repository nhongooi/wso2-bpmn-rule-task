/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.carbon.bpmn.rule.task.internal;

import org.wso2.carbon.registry.core.service.RegistryService;

/**
 * Data holder singleton.
 */
public class RuleTaskDataHolder {

    private static RuleTaskDataHolder instance = new RuleTaskDataHolder();

    private RegistryService registryService;

    private RuleTaskDataHolder() {
    }

    public static RuleTaskDataHolder getInstance() {
        return instance;
    }

    public RegistryService getRegistryService() {
        return this.registryService;
    }

    public void setRegistryService(RegistryService registryService) {
        this.registryService = registryService;
    }
}
