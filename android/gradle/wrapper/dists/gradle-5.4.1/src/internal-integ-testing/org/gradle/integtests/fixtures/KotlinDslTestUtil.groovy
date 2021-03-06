/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.integtests.fixtures

import org.gradle.test.fixtures.dsl.GradleDsl

import static org.gradle.integtests.fixtures.RepoScriptBlockUtil.jcenterRepositoryDefinition
import static org.gradle.integtests.fixtures.RepoScriptBlockUtil.kotlinEapRepositoryDefinition

class KotlinDslTestUtil {

    static String getKotlinDslBuildSrcScript() {
        """
            plugins { `kotlin-dsl-base` }

            allprojects {
                repositories {
                    //TODO:kotlin-dsl remove once we're no longer on a kotlin eap 
                    ${kotlinEapRepositoryDefinition(GradleDsl.KOTLIN)}
                    ${jcenterRepositoryDefinition(GradleDsl.KOTLIN)}
                }
            }
        """
    }
}
