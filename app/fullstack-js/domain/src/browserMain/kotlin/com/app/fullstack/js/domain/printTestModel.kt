package com.app.fullstack.js.domain

import com.app.fullstack.js.domain.model.TestModel

actual fun printTestModel(model: TestModel) {
    println("print from browser js $model")
}