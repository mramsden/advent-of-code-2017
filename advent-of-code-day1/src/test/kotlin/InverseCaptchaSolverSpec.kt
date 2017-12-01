import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

object InverseCaptchaSolverSpec: Spek({
    describe("an inverse captcha solver") {
        val solver = InverseCaptchaSolver()

        it("solves the challenge 1122 with the sum 3") {
            val answer = solver.solve(challenge="1122")
            assertEquals(3, answer)
        }


    }
})