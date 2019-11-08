package android.firstopenglproject.com.firstopenglproject;


import android.opengl.GLSurfaceView;
import android.util.Log;


import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import static android.opengl.GLES20.GL_COLOR_BUFFER_BIT;
import static android.opengl.GLES20.glClear;
import static android.opengl.GLES20.glClearColor;
import static android.opengl.GLES20.glViewport;


public class FirstOpenGLProjectRender implements GLSurfaceView.Renderer{
    private static final String TAG = "OpenGLProjectRender";
    @Override
    public void onSurfaceCreated(GL10 glUnused, EGLConfig config) {
        glClearColor(0.0f, 1.0f, 1.0f, 0.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 glUnused, int width, int height) {
        glViewport(0, 0, width, height);
    }

    long lastTime = 0;
    long currentTime = 0;
    @Override
    public void onDrawFrame(GL10 glUnused) {
        glClear(GL_COLOR_BUFFER_BIT);
        currentTime = System.currentTimeMillis();
        float Frame = (1000)/(currentTime-lastTime);
        lastTime = currentTime;
        Log.d(TAG, "onDrawFrame: Frame = " + Frame);
    }
}
