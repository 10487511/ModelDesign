package com.model.design.strategymodel

import android.util.Log

/**创建具体策略类*/

class ShoppingStrategy : ChaseStrategy {
    override fun chase() {
        Log.e("model", "一起逛街")
    }
}