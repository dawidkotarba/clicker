package dawid.kotarba.automater.executor.steps.mouse

import dawid.kotarba.automater.executor.AbstractStep
import dawid.kotarba.automater.executor.StepType

class MouseMoveToPercentStep extends AbstractStep {
    @Override
    void execute(String executionLine) {
        def params = getTwoIntParams(executionLine)
        mouse.moveToPercentOfTheScreen(params.first, params.second)
    }

    @Override
    StepType getStepType() {
        StepType.MOUSE
    }

    @Override
    Optional<String> getSupportedMethod() {
        Optional.of('moveToPercentOfTheScreen')
    }
}