package com.model.design.strategymodel

/**创建环境类*/

class AreaContext(private var chaseStrategy: ChaseStrategy) {

    fun chase() {
        chaseStrategy.chase()
    }

}