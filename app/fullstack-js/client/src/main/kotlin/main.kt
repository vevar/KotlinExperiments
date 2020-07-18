import com.app.fullstack.js.domain.model.TestModel
import com.app.fullstack.js.domain.printTestModel
import com.app.fullstack.js.feature.test
import com.app.fullstack.js.feature.testFeature

fun main() {
    printTestModel(TestModel("model-1"))
    testFeature()
    test()
}