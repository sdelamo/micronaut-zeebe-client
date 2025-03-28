/*
 * Copyright 2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package info.novatec.micronaut.zeebe.client.feature;

import io.micronaut.context.annotation.Executable;
import io.micronaut.context.annotation.Parallel;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Martin Sawilla
 * @author Stefan Schultz
 * @author Stephan Seelig
 * @author Tobias Schäfer
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Documented
@Executable(processOnStartup = true)
@Parallel
public @interface ZeebeWorker {

    String type();

}
