/*
 * Copyright (c) 2022 Red Hat Developer
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
package com.redhat.parodos.examples.longrunningchecker;

import com.redhat.parodos.examples.longrunningchecker.task.LongRunningWorkFlowTask;
import com.redhat.parodos.examples.longrunningchecker.task.LongRunningWorkFlowCheckerTask;
import com.redhat.parodos.workflow.annotation.Checker;
import com.redhat.parodos.workflow.annotation.Infrastructure;
import com.redhat.parodos.workflow.consts.WorkFlowConstants;
import com.redhat.parodos.workflows.workflow.SequentialFlow;
import com.redhat.parodos.workflows.workflow.WorkFlow;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Very simple workflow configurations in different package from Parodos main class
 *
 * @author Richard Wang (Github: richardW98)
 */

@Configuration
public class LongRunningWorkFlowConfiguration {

	// START Custom Sequential Example (WorkflowTasks and Workflow Definitions)

	@Bean
	LongRunningWorkFlowTask longRunningWorkFlowTaskOne(@Qualifier("longRunningWorkFlowChecker") WorkFlow longRunningWorkFlowChecker) {
		LongRunningWorkFlowTask longRunningWorkFlowTaskOne = new LongRunningWorkFlowTask();
		longRunningWorkFlowTaskOne.setWorkFlowCheckers(List.of(longRunningWorkFlowChecker));
		return longRunningWorkFlowTaskOne;
	}

	@Bean
	LongRunningWorkFlowTask longRunningWorkFlowTaskTwo() {
		return new LongRunningWorkFlowTask();
	}

	@Bean(name = "longRunningWorkFlow" + WorkFlowConstants.INFRASTRUCTURE_WORKFLOW)
	@Infrastructure
	WorkFlow longRunningWorkFlow(@Qualifier("longRunningWorkFlowTaskOne") LongRunningWorkFlowTask longRunningWorkFlowTaskOne,
			@Qualifier("longRunningWorkFlowTaskTwo") LongRunningWorkFlowTask longRunningWorkFlowTaskTwo) {
		// @formatter:off
        return SequentialFlow
                .Builder.aNewSequentialFlow()
                .named("longRunningWorkFlow" + WorkFlowConstants.INFRASTRUCTURE_WORKFLOW)
                .execute(longRunningWorkFlowTaskOne)
				.then(longRunningWorkFlowTaskTwo)
                .build();
        // @formatter:on
	}
	// END Custom Sequential Example (WorkflowTasks and Workflow Definitions)

	@Bean
	LongRunningWorkFlowCheckerTask longRunningWorkFlowCheckerTask() {
		return new LongRunningWorkFlowCheckerTask();
	}

	@Bean(name = "longRunningWorkFlowChecker")
	@Checker(cronExpression = "*/5 * * * * ?")
	WorkFlow longRunningWorkFlowChecker(
			@Qualifier("longRunningWorkFlowCheckerTask") LongRunningWorkFlowCheckerTask longRunningWorkFlowCheckerTask) {
		return SequentialFlow.Builder.aNewSequentialFlow().named("longRunningWorkFlowChecker")
				.execute(longRunningWorkFlowCheckerTask).build();
	}

}
