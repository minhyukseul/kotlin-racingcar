package racing.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

class CarTest : AnnotationSpec() {

    @Test
    fun `자동차는 이름을 가지고 최초 위치는 0을 가리킨다`() {
        val name = "poby"
        val car = Car(name)
        car.name shouldBe name
        car.position shouldBe 0
    }

    @Test
    fun `자동차 이름은 5글자가 넘을 수가 없음`() {
        shouldThrow<IllegalArgumentException> {
            Car("123456")
        }
    }

    @Test
    fun `자동차는 강도 4이상의 엑셀을 밟으면 움직 일 수 있음`() {
        val numbers = listOf(4, 5, 6, 7, 8, 9)
        val car = Car("Poby")
        numbers.forEach {
            car.moveCar(it)
        }
        car.position shouldBe numbers.size
    }

    @Test
    fun `자동차는 강도 4미만의 엑셀을 밟으면 움직 일 수 없음`() {
        val numbers = listOf(0, 1, 2, 3)
        val car = Car("Poby")
        numbers.forEach {
            car.moveCar(it)
        }
        car.position shouldBe 0
    }
}
