package com.model.design.factorymodel

import android.app.Activity
import android.widget.Toast

/**创建具体产品类，继承Product类*/

class ProductB : Product() {

    override fun show(a: Activity) {
        Toast.makeText(a, "ProductB", Toast.LENGTH_SHORT).show()
    }

}