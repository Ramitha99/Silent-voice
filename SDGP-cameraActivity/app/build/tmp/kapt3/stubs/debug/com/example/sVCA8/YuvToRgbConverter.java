package com.example.sVCA8;

import java.lang.System;

/**
 * Helper class used to efficiently convert a [Media.Image] object from
 * [ImageFormat.YUV_420_888] format to an RGB [Bitmap] object.
 *
 * The [yuvToRgb] method is able to achieve the same FPS as the CameraX image
 * analysis use case on a Pixel 3 XL device at the default analyzer resolution,
 * which is 30 FPS with 640x480.
 *
 * NOTE: This has been tested in a limited number of devices and is not
 * considered production-ready code. It was created for illustration purposes,
 * since this is not an efficient camera pipeline due to the multiple copies
 * required to convert each frame.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/sVCA8/YuvToRgbConverter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "inputAllocation", "Landroid/renderscript/Allocation;", "outputAllocation", "pixelCount", "", "rs", "Landroid/renderscript/RenderScript;", "kotlin.jvm.PlatformType", "scriptYuvToRgb", "Landroid/renderscript/ScriptIntrinsicYuvToRGB;", "yuvBuffer", "", "imageToByteArray", "", "image", "Landroid/media/Image;", "outputBuffer", "yuvToRgb", "output", "Landroid/graphics/Bitmap;", "app_debug"})
public final class YuvToRgbConverter {
    private final android.renderscript.RenderScript rs = null;
    private final android.renderscript.ScriptIntrinsicYuvToRGB scriptYuvToRgb = null;
    private int pixelCount = -1;
    private byte[] yuvBuffer;
    private android.renderscript.Allocation inputAllocation;
    private android.renderscript.Allocation outputAllocation;
    
    public final synchronized void yuvToRgb(@org.jetbrains.annotations.NotNull()
    android.media.Image image, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap output) {
    }
    
    private final void imageToByteArray(android.media.Image image, byte[] outputBuffer) {
    }
    
    public YuvToRgbConverter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}