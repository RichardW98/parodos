package com.redhat.parodos.examples.longrunningchecker.task;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redhat.parodos.examples.utils.RestUtils;
import com.redhat.parodos.workflow.task.checker.BaseWorkFlowCheckerTask;
import com.redhat.parodos.workflows.work.DefaultWorkReport;
import com.redhat.parodos.workflows.work.WorkContext;
import com.redhat.parodos.workflows.work.WorkReport;
import com.redhat.parodos.workflows.work.WorkStatus;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.UUID;

@Slf4j
public class LongRunningWorkFlowCheckerTask extends BaseWorkFlowCheckerTask {

	@Override
	public WorkReport checkWorkFlowStatus(WorkContext workContext) {
		log.info("SimpleWorkFlowCheckerTask");
		// call api to check status
		List<ApprovalResponse> approvedRequests = List.of(ApprovalResponse.builder()
				.executionId(UUID.randomUUID().toString()).checkerTaskName("simpleCustomCheckerTask").build());
		// override other workflow checker tasks' status
		approvedRequests.forEach(approvalResponse -> RestUtils.executePost(
				String.format("http://localhost:8080/api/v1/workflows/%s/checkers/%s",
						approvalResponse.getExecutionId(), approvalResponse.getCheckerTaskName()),
				CallbackRequest.builder().status("COMPLETED").build().toString()));
		return new DefaultWorkReport(WorkStatus.FAILED, workContext);
	}

	@Data
	@Builder
	static class ApprovalResponse {

		private String executionId;

		private String checkerTaskName;

	}

	@Data
	@Builder
	static class CallbackRequest {

		private String status;

		public String toString() {
			try {
				return new ObjectMapper().writeValueAsString(this);
			}
			catch (JsonProcessingException e) {
				throw new RuntimeException(e);
			}
		}

	}

}