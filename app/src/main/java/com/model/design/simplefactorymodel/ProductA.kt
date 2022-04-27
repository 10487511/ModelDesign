package com.model.design.simplefactorymodel

import android.app.Activity
import android.widget.Toast

/**创建具体产品类，继承Product类*/

class ProductA :Product() {

    override fun show(a: Activity) {
        Toast.makeText(a, "ProductA", Toast.LENGTH_SHORT).show()
    }

}