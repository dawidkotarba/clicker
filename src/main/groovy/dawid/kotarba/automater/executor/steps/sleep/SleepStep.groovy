package dawid.kotarba.automater.executor.steps.sleep

import dawid.kotarba.automater.executor.AbstractStep
import dawid.kotarba.automater.executor.StepType

import static com.google.common.base.Preconditions.checkArgument

class SleepStep extends AbstractStep {
    @Override
    void execute(String executionLine) {
        def sleepTime = getIntParam(executionLine)
        checkArgument(sleepTime >= 0)

        sleep(sleepTime)
    }

    @Override
    StepType getStepType() {
        StepType.SLEEP
    }

    @Override
    Optional<String> getMethod() {
        Optional.of('of')
    }

    @Override
    int getArgumentsCount() {
        1
    }
}
