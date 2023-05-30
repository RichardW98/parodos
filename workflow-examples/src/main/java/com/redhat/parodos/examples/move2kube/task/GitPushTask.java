package com.redhat.parodos.examples.move2kube.task;

import com.redhat.parodos.workflow.parameter.WorkParameter;
import com.redhat.parodos.workflows.work.WorkContext;
import lombok.NonNull;

import java.util.List;
import java.util.stream.Collectors;

public class GitPushTask extends com.redhat.parodos.tasks.git.GitPushTask {

    @Override
    public @NonNull List<WorkParameter> getWorkFlowTaskParameters() {
        return super.getWorkFlowTaskParameters().stream().filter(param -> !param.getKey().equals("path"))
                .collect(Collectors.toList());
    }


    public String getRepoPath(WorkContext workContext) {
        // comes from GitClonePrebuiltTask
        return workContext.get("gitDestination").toString();
    }

}
