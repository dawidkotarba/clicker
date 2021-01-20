package dawid.kotarba.automater.executor

import dawid.kotarba.automater.executor.steps.keyboard.KeyboardHold
import dawid.kotarba.automater.executor.steps.keyboard.KeyboardPress
import dawid.kotarba.automater.executor.steps.mouse.MouseLeftClick
import dawid.kotarba.automater.executor.steps.mouse.MouseMoveByPercentStep
import dawid.kotarba.automater.executor.steps.mouse.MouseMoveByStep
import dawid.kotarba.automater.executor.steps.mouse.MouseMoveToPercentStep
import dawid.kotarba.automater.executor.steps.mouse.MouseMoveToStep
import dawid.kotarba.automater.executor.steps.mouse.MouseRightClick
import dawid.kotarba.automater.executor.steps.sleep.RandomSleepStep
import dawid.kotarba.automater.executor.steps.sleep.SleepStep
import dawid.kotarba.automater.executor.switches.LoopSwitch
import dawid.kotarba.automater.executor.switches.WhenMouseIdleSwitch

class Steps {
    private static List<Step> steps = []
    static {
        // switches
        steps.add(new LoopSwitch())
        steps.add(new WhenMouseIdleSwitch())

        // keyboard
        steps.add(new KeyboardPress())
        steps.add(new KeyboardHold())

        // mouse
        steps.add(new MouseMoveToStep())
        steps.add(new MouseMoveByStep())
        steps.add(new MouseLeftClick())
        steps.add(new MouseRightClick())
        steps.add(new MouseMoveToPercentStep())
        steps.add(new MouseMoveByPercentStep())

        // sleep
        steps.add(new SleepStep())
        steps.add(new RandomSleepStep())
    }

    static List<Step> getSteps() {
        return steps
    }
}
