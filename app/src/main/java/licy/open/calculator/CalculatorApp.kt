package licy.open.calculator

import android.app.Application
import com.tencent.mmkv.MMKV

/**
 * CalculatorApp
 * description: CalculatorApp
 *
 * @author : Licy
 * @date : 2022/9/6
 * email : licy3051@qq.com
 */
class CalculatorApp:Application() {

    override fun onCreate() {
        super.onCreate()


        MMKV.initialize(this)


    }
}