// This file was generated by PermissionsDispatcher. Do not modify!
@file:JvmName("MainActivityPermissionsDispatcher")

package com.example.sVCA8

import androidx.core.app.ActivityCompat
import kotlin.Array
import kotlin.Int
import kotlin.IntArray
import kotlin.String
import permissions.dispatcher.PermissionUtils

private const val REQUEST_SETUPCAMERA: Int = 0

private val PERMISSION_SETUPCAMERA: Array<String> = arrayOf("android.permission.CAMERA")

fun MainActivity.setupCameraWithPermissionCheck() {
  if (PermissionUtils.hasSelfPermissions(this, *PERMISSION_SETUPCAMERA)) {
    setupCamera()
  } else {
    ActivityCompat.requestPermissions(this, PERMISSION_SETUPCAMERA, REQUEST_SETUPCAMERA)
  }
}

fun MainActivity.onRequestPermissionsResult(requestCode: Int, grantResults: IntArray) {
  when (requestCode) {
    REQUEST_SETUPCAMERA ->
     {
      if (PermissionUtils.verifyPermissions(*grantResults)) {
        setupCamera()
      }
    }
  }
}
