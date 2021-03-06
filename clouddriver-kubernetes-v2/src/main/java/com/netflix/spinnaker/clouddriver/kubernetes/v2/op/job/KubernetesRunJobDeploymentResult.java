/*
 * Copyright 2019 Armory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.clouddriver.kubernetes.v2.op.job;

import com.netflix.spinnaker.clouddriver.kubernetes.v2.op.OperationResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class KubernetesRunJobDeploymentResult extends OperationResult {
  Map<String, List<String>> deployedNamesByLocation = new HashMap<>();

  public KubernetesRunJobDeploymentResult(OperationResult result) {
    this.setManifestNamesByNamespace(result.getManifestNamesByNamespace());
    this.setManifests(result.getManifests());
    this.setCreatedArtifacts(result.getCreatedArtifacts());
    this.setBoundArtifacts(result.getBoundArtifacts());
  }
}
