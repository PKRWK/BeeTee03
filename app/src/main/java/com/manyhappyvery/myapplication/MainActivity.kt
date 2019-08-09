package com.manyhappyvery.myapplication

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var m_bluetoothAdapter: BluetoothAdapter?
    lateinit var m_pairedDevices: Set<BluetoothDevice>
    val REQUEST_ENABLE_BLUETOOTH  = 1


    companion object {
        val EXTRA_ADDRESS: String = "Device_adress"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TheLog.text = "avvvvv" + "\n" + "bmnjjjjjjjj" + "\n" + "ahhhhhhhh" + "\n" + "b90999999999" + "\n333333333" + "a665555665656566556" + "\n" + "booooiiiiii" + "\n" + "a" + "\n" + "b" + "\n" + "a" + "\n" + "b" + "\n"

        m_bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

        if (m_bluetoothAdapter == null )
        {

        }
    private fun pairedDeviceList () {

    }


        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
        }


    }
}
