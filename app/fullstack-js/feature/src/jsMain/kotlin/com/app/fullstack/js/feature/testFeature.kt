package com.app.fullstack.js.feature

import com.app.fullstack.js.domain.model.TestModel
import com.app.fullstack.js.domain.printTestModel


actual fun testFeature() {
    println("testFeature:")
    printTestModel(TestModel("TestModel-feature"))
}
