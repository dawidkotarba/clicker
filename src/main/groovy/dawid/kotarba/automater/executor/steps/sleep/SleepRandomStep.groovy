package dawid.kotarba.automater.executor.steps.sleep

import dawid.kotarba.automater.executor.AbstractStep
import dawid.kotarba.automater.executor.StepType

import static com.google.common.base.Preconditions.checkArgument

class SleepRandomStep extends AbstractStep {
    @Override
    void execute(String executionLine) {
        def maxSleepTime = getIntParam(executionLine)
        checkArgument(maxSleepTime >= 0)

        sleep(new Random().nextInt(maxSleepTime))
    }

    @Override
    StepType getStepType() {
        StepType.SLEEP
    }

    @Override
    Optional<String> getMethod() {
        Optional.of('random')
    }

    @Override
    int getArgumentsCount() {
        1
    }
}
